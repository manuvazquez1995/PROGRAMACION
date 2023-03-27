import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


// TODO: métodos que sirven para gestionar el main de la app, así como la gestión de los empleados.

public class Gestiones implements iTeclado{


    //TODO: Métodos que imprimen las opciones de los menús.
    //Menú principal.
    public static void menu(){
        System.out.println("""
                ************* MENÚ PRINCIPAL ***************
                (1) Altas de empleados fijos y temporales.
                (2) Altas de ventas de un empleado temporal.
                (3) Dar de baja un empleado.
                (4) Modificar los datos de un empleado.
                (5) Visualizar los datos de los empleados.
                (6) Consultas ventas temporales.
                (0) Salir.
                
                Escoja una opción.
                
                """);
    }

    //Menú de altas de empleados.
    public static void menuAltas(){
        System.out.println("""
                ****** MENÚ ALTAS ******
                (1) Empleado fijo.
                (2) Empleado temporal.
                (0) Volver atrás.
                
                Escoja una opción.
                
                """);
    }


    // Menú con las opciones de visualizar empleados.
    public static void menuVisualizar(){
        System.out.println("""
                ****** MENÚ VISUALIZAR ******
                (1) Ver los empleados en activo.
                (2) Ver todos los empleados (activos/bajas).
                (0) Volver atrás.
                
                Escoja una opción.
                
                """);
    }


    // Menú que muestra las opciones de ModificarEmpleados.
    public static void menuModEmpleados(){
        System.out.println("""
                ****** MENÚ MODIFICAR EMPLEADOS ******
                (1) Modificar empleado fijo.
                (2) Modificar empleado temporal.
                (0) Volver atrás.
                
                Escoja una opción.
                
                """);
    }


    // Menú para mostrar las opciones de modificación de los empleados fijos.
    public static void menuOpFijos(){
        System.out.println("""
                ¿Que desea modificar?
                (1) Salario base.
                (2) Trienios.
                (3) Salario base y trienios.
                (0) Cancelar.
                
                Escoja una opción:
                
                """);
    }



    //TODO: Método que dá de alta un empleado fijo o temporal.
    public static void alta(ArrayList<Empleado> empleAct) throws IOException {
        menuAltas();
        int op = Integer.parseInt(bf.readLine());

        while (op != 0){
            switch (op){

                case 1 -> {
                    System.out.println("***** Alta empleado fijo *****");
                    System.out.println("- Introduce su número de la seguridad social: ");
                    String ns = bf.readLine();
                    while(!Validaciones.validadNs(ns)){
                        System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducirlo: ");
                        ns = bf.readLine();
                    }
                    System.out.println("- Introduzca su nombre: ");
                    String nombre = bf.readLine();
                    System.out.println("- Introduce su fecha de nacimiento: ");
                    String fechaNac = bf.readLine();
                    while (!Validaciones.validarFecha(fechaNac)){
                        System.err.println("La fecha no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a otra fecha: ");
                        fechaNac = bf.readLine();
                    }
                    System.out.println("- Introduce su sexo (H/M) en mayúscula: ");
                    String s = bf.readLine();
                    char sexo = s.charAt(0);
                    while(!Validaciones.validarSexo(sexo)){
                        System.err.println("El sexo no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducirlo: ");
                        s = bf.readLine();
                        sexo = s.charAt(0);
                    }
                    System.out.println("- Introduce el sueldo del empleado: ");
                    int sueldo = Integer.parseInt(bf.readLine());
                    System.out.println("- Introduce los trienios: ");
                    int trienios = Integer.parseInt(bf.readLine());

                    empleAct.add(new EmpFijo(ns, nombre, fechaNac, sexo, sueldo, trienios));

                    menuAltas();
                    op = Integer.parseInt(bf.readLine());
                }

                case 2 -> {
                    System.out.println("***** Alta empleado temporal *****");
                    System.out.println("- Introduce su número de la seguridad social: ");
                    String ns = bf.readLine();
                    while(!Validaciones.validadNs(ns)){
                        System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducirlo: ");
                        ns = bf.readLine();
                    }
                    System.out.println("- Introduzca su nombre: ");
                    String nombre = bf.readLine();
                    System.out.println("- Introduce su fecha de nacimiento: ");
                    String fechaNac = bf.readLine();
                    while (!Validaciones.validarFecha(fechaNac)){
                        System.err.println("La fecha no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducir otra fecha: ");
                        fechaNac = bf.readLine();
                    }
                    System.out.println("- Introduce su sexo (H/M) en mayúscula: ");
                    String s = bf.readLine();
                    char sexo = s.charAt(0);
                    while(!Validaciones.validarSexo(sexo)){
                        System.err.println("El sexo no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducirlo: ");
                        s = bf.readLine();
                        sexo = s.charAt(0);
                    }
                    System.out.println("- Introduzca la fecha de inicio del contrato: ");
                    String fechaInicio = bf.readLine();
                    while (!Validaciones.validarFecha(fechaInicio)){
                        System.err.println("La fecha no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducir otra fecha: ");
                        fechaInicio = bf.readLine();
                    }
                    System.out.println("- Introduzca la fecha de finalización del contrato: ");
                    String fechaFin = bf.readLine();
                    while (!Validaciones.validarFecha(fechaFin)){
                        System.err.println("La fecha no cumple con los requisitos de validación.");
                        System.out.println("Vuelva a introducir otra fecha: ");
                        fechaFin = bf.readLine();
                    }
                    System.out.println("- Introduzca el importe de salario diario: ");
                    double precioDia = Double.parseDouble(bf.readLine());

                    empleAct.add(new EmpTemporal(ns, nombre, fechaNac, sexo, fechaInicio, fechaFin, precioDia));

                    menuAltas();
                    op = Integer.parseInt(bf.readLine());
                }

                default -> {
                    System.out.println("Opción no válida, vuelva a intentarlo.");
                    menuAltas();
                    op = Integer.parseInt(bf.readLine());
                }
            }
        }
    }


    //TODO: Método que ordena alfabéticamente los empleados por nombre.
    public static void ordenarEmpNombre(ArrayList<Empleado> emple){
        emple.sort(Comparator.comparing(Empleado::getNombre)); // Una forma de ordenar un arrayList.
    }


    //TODO: Método que muestra los empleados en activo, tanto fijos como temporales.
    public static void visualiza(ArrayList<Empleado> empleAct) throws ParseException {
        if(empleAct.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();
        }else {
            // Primero ordenamos el array por nombre.
            Gestiones.ordenarEmpNombre(empleAct);
            // Mostramos los datos de los empleados una vez ordenados.
            System.out.println("""
                     ***** EMPLEADOS ****
                     NOMBRE        SUELDO
                    """);
            for (Empleado e : empleAct) {
                System.out.println(e.getNombre() + "\t    " + e.sueldo());
            }
        }
        System.out.println(" ");
    }


    //TODO: Método que muestra todos los empleados, tanto los activos como los dados de baja.
    public static void visualiza(ArrayList<Empleado> emple, ArrayList<Empleado> empleBaja) throws ParseException {
        if(emple.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();
        }else {
            System.out.println("""
                            ******** EMPLEADOS EN ACTIVO ********
                                    Empleados Temporales
                    ==================================================
                    Nombre      FechaInicio      FechaFin        Sueldo
                    ==================================================
                    """);
            // Con el siguiente for solo sacamos los empleados temporales.
            for (Empleado e : emple) {
                if (e instanceof EmpTemporal) {
                    System.out.println(e.getNombre() + "\t    " + ((EmpTemporal) e).getFechaInicio() + "" +
                            "\t    " + ((EmpTemporal) e).getFechaFin() + "\t    " + e.sueldo());
                    System.out.println("VENTAS: ");
                    if(((EmpTemporal) e).getVentas().isEmpty()){
                        System.out.println("- No tiene ventas asignadas.");
                        System.out.println();
                    }else {
                        for (Ventas v : ((EmpTemporal) e).getVentas()) {
                            System.out.println("- Fecha: " + v.getFechaVenta() + "   - Imp: " + v.getImporteVenta());
                        }
                    }
                }
            }
            System.out.println("""
                              
                              Empleados Fijos
                    =================================
                    Nombre      Trienios      Sueldo
                    =================================
                    """);
            // Con el siguiente for solo sacamos los empleados fijos.
            for (Empleado e : emple) {
                if (e instanceof EmpFijo) {
                    System.out.println(e.getNombre() + "\t    " + ((EmpFijo) e).getTrienios() + "\t    " + e.sueldo());
                }
            }
            System.out.println();
        }

        // Lo siguiente es para mostrar los datos de los empleados dados de baja.
        if(empleBaja.isEmpty()){
            System.out.println("** No hay empleados dados de baja.");
            System.out.println();
        }else {
            System.out.println("""
                                    
                    *** EMPLEADOS DADOS DE BAJA ***
                    =======================
                    Nombre          Sueldo
                    =======================
                    """);
            for (Empleado e : empleBaja) {
                System.out.println(e.getNombre() + "\t    " + e.sueldo());
            }
            System.out.println();
        }
    }


    //TODO: Método para modificar un empleado fijo.
    public static void modEmpFijo(ArrayList<Empleado> empleAct) throws IOException {

        // Pedimos al usuario un NSS para escoger cuál modificar.
        System.out.println("- Introduce el NSS del empleado para buscarlo: ");
        String nss = bf.readLine();
        while(!Validaciones.validadNs(nss)){
            System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
            System.out.println("Vuelva a introducirlo: ");
            nss = bf.readLine();
        }

        // Buscamos si existe el NSS introducido (no se emplea la búsqueda binaria).
        // Para ello, una vez que se encuentra, se guarda el objeto para su posterior tratamiento.
        EmpFijo emp = null;
        for(Empleado e : empleAct){
            if(e instanceof EmpFijo) {
                if (Objects.equals(e.getNss(), nss)) {
                    emp = (EmpFijo) e;
                    break;
                }
            }
        }

        // Comprobamos si lo encontró, en el caso afirmativo, se procede a las modificaciones.
        if(emp==null){
            System.err.println("- No existe el NSS introducido.");
            System.out.println();
        }else{
            // Mostramos los datos del empleado que se quiere modificar.
            System.out.println("- Empleado con NSS-"+nss+" encontrado: ");
            System.out.println("- "+emp.getNombre()+"\t "+emp.getNss());
            System.out.println();
            System.out.println("¿Seguro que quiere modificarlo? (s -> aceptar, cualquier tecla -> cancela): ");
            String op = bf.readLine();
            char opc = op.charAt(0);
            if(opc=='s'){
                menuOpFijos();
                int opt = Integer.parseInt(bf.readLine());
                while(opt!=0){
                    switch (opt){
                        case 1 -> {
                            System.out.println("- Introduce el nuevo salario base (actual "+emp.getSalarioBase()+"):");
                            int newSalarioBase = Integer.parseInt(bf.readLine());
                            for(Empleado e : empleAct){
                                if(e instanceof EmpFijo){
                                    if(Objects.equals(e.getNss(), emp.getNss())){
                                        ((EmpFijo) e).setSalarioBase(newSalarioBase);
                                        break;
                                    }
                                }
                            }
                            menuOpFijos();
                            opt = Integer.parseInt(bf.readLine());
                        }
                        case 2 -> {
                            System.out.println("- Introduce los trienios (actuales "+emp.getTrienios()+"):");
                            int newTrienios = Integer.parseInt(bf.readLine());
                            for(Empleado e : empleAct){
                                if(e instanceof EmpFijo){
                                    if(Objects.equals(e.getNss(), emp.getNss())){
                                        ((EmpFijo) e).setTrienios(newTrienios);
                                        break;
                                    }
                                }
                            }
                            menuOpFijos();
                            opt = Integer.parseInt(bf.readLine());
                        }
                        case 3 -> {
                            System.out.println("- Introduce el nuevo salario base (actual "+emp.getSalarioBase()+"):");
                            int newSalarioBase = Integer.parseInt(bf.readLine());
                            //emp.setSalarioBase(newSalarioBase);  // Modificamos el salario base.
                            System.out.println("- Introduce los trienios (actuales "+emp.getTrienios()+"):");
                            int newTrienios = Integer.parseInt(bf.readLine());
                            for(Empleado e : empleAct){
                                if(e instanceof EmpFijo){
                                    if(Objects.equals(e.getNss(), emp.getNss())){
                                        ((EmpFijo) e).setSalarioBase(newSalarioBase);
                                        ((EmpFijo) e).setTrienios(newTrienios);
                                        break;
                                    }
                                }
                            }
                            menuOpFijos();
                            opt = Integer.parseInt(bf.readLine());
                        }
                        default -> {
                            System.err.println("- Opción no válida, vuela a intentarlo.");
                            menuOpFijos();
                            opt = Integer.parseInt(bf.readLine());
                        }
                    }
                }
            }
        }
    }



    //TODO: Método para modificar un empleado temporal.
    public static void modEmpTemp(ArrayList<Empleado> empleAct) throws IOException {

        // Pedimos al usuario un NSS para escoger cuál modificar.
        System.out.println("- Introduce el NSS del empleado para buscarlo: ");
        String nss = bf.readLine();
        while(!Validaciones.validadNs(nss)){
            System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
            System.out.println("Vuelva a introducirlo: ");
            nss = bf.readLine();
        }

        // Buscamos si existe el NSS introducido (no se emplea la búsqueda binaria).
        // Para ello, una vez que se encuentra, se guarda el objeto para su posterior tratamiento.
        EmpTemporal emp = null;
        for(Empleado e : empleAct){
            if(e instanceof EmpTemporal) {
                if (Objects.equals(e.getNss(), nss)) {
                    emp = (EmpTemporal) e;
                    break;
                }
            }
        }

        // Comprobamos si lo encontró, en el caso afirmativo, se procede a las modificaciones.
        if(emp==null){
            System.err.println("- No existe el NSS introducido.");
            System.out.println();
        }else {
            // Mostramos los datos del empleado que se quiere modificar.
            System.out.println("- Empleado con NSS-" + nss + " encontrado: ");
            System.out.println("- " + emp.getNombre() + "\t " + emp.getNss());
            System.out.println();
            System.out.println("¿Seguro que quiere modificar su precio por día? (s -> aceptar, cualquier tecla -> cancela): ");
            String op = bf.readLine();
            char opc = op.charAt(0);
            if (opc == 's') {
                System.out.println("- Su precio por día actual es: "+emp.getPrecioDia());
                System.out.println("- Introduce el nuevo precio por día: ");
                double newPrecioDia = Double.parseDouble(bf.readLine());
                for(Empleado e : empleAct){
                    if(e instanceof EmpTemporal){
                        if(Objects.equals(e.getNss(), emp.getNss())){
                            ((EmpTemporal) e).setPrecioDia(newPrecioDia);
                            break;
                        }
                    }
                }
            }
        }
    }


    //TODO: Método para dar de baja un empleado.
    public static void baja(ArrayList<Empleado> empleAct, ArrayList<Empleado> empleBaja) throws IOException {
        if(empleAct.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();
        }else{

            // Primero ordenamos el arrayList empleAct para luego hacer la búsqueda.
            Gestiones.ordenarEmpNombre(empleAct);

            // Se le pide al usuario el NSS del empleado que quiere dar de baja.
            System.out.println("- Introduce el NSS del empleado para darlo de baja: ");
            String nss = bf.readLine();
            while(!Validaciones.validadNs(nss)){
                System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
                System.out.println("Vuelva a introducirlo: ");
                nss = bf.readLine();
            }

            // Buscamos si existe el NSS introducido (no se emplea la búsqueda binaria).
            // Para ello, una vez que se encuentra, se guarda el objeto para su posterior tratamiento.
            Empleado emp = null;
            for(Empleado e : empleAct){
                if(Objects.equals(e.getNss(), nss)){
                    emp = e;
                    break;
                }
            }

            // Mostramos los datos del empleado encontrado, si no lo encontró da un mensaje de error.
            if(emp==null){
                System.out.println("- No se encontró ningún empleado con NSS-"+nss);
            }else{
                System.out.println("- Empleado con NSS-"+nss+" encontrado: ");
                System.out.println("- "+emp.getNombre()+"\t "+emp.getNss());
                System.out.println();
                System.out.println("- Seguro que quiere dar el empleado de baja? (s para afirmar, otra tecla para cancelar):");
                String op = bf.readLine();
                char opc = op.charAt(0);
                //Si decidimos que vamos a dar de baja al empleado, hacemos lo siguiente.
                if(opc=='s'){
                    //Primero guardamos al empleado guardado en la variable en el arrayList empleBaja.
                    empleBaja.add(emp);
                    //Luego lo borramos del arrayList empleAct.
                    String finalNss = nss;
                    empleAct.removeIf(Empleado -> Empleado.getNss().equals(finalNss));
                    //Indicamos que el empleado fué dado de baja.
                    System.out.println("- El empleado fué dado de baja correctamente.");
                }else{
                    System.out.println("- Operación cancelada.");
                }
            }
            System.out.println();
        }
    }


    //TODO: Método que da de alta las ventas de un empleado temporal concreto.
    public static void altaVenta(ArrayList<Empleado> empleAct) throws IOException, ParseException {

        if(empleAct.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();

        }else{
            // Primero filtramos los empleados temporales guardándolos en un ArrayList auxiliar.
            ArrayList<EmpTemporal> auxEmpleTemp = new ArrayList<>();
            for(Empleado e : empleAct){
                if(e instanceof EmpTemporal){
                    auxEmpleTemp.add((EmpTemporal) e);
                }
            }

            if(auxEmpleTemp.isEmpty()){
                System.out.println("** No hay empleados temporales, tiene que añadirlos previamente.");
                System.out.println();

            }else{
                // Pedimos el NSS del empleado temporal al cual le añadiremos ventas.
                System.out.println("- Introduce el NSS del empleado para buscarlo: ");
                String nss = bf.readLine();
                while(!Validaciones.validadNs(nss)){
                    System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
                    System.out.println("Vuelva a introducirlo: ");
                    nss = bf.readLine();
                }

                // Buscamos el NSS para saber si existe un empleado con dicho NSS.
                EmpTemporal emp = null;
                for(EmpTemporal e : auxEmpleTemp){
                    if(Objects.equals(e.getNss(), nss)){
                        emp = e;
                        break;
                    }
                }

                // Comprobamos si lo encontró, en el caso afirmativo, se procede a las modificaciones.
                if(emp==null){
                    System.err.println("- No existe el NSS introducido.");
                    System.out.println();
                }else{
                    // Mostramos los datos del empleado que se quiere modificar.
                    System.out.println("- Empleado con NSS-"+nss+" encontrado: ");
                    System.out.println("- "+emp.getNombre()+"\t "+emp.getNss());
                    System.out.println();
                    System.out.println("¿Seguro que quiere añadirle una venta? (s -> aceptar, cualquier tecla -> cancela): ");
                    String op = bf.readLine();
                    char opc = op.charAt(0);
                    if(opc=='s'){
                        System.out.print(" - Introduce la fecha de la venta: ");
                        String fechaVenta = bf.readLine();
                        while (!Validaciones.validarFecha(fechaVenta)){
                            System.out.println("La fecha no cumple con los requisitos de validación.");
                            System.out.println("Vuelva a introducir otra fecha: ");
                            fechaVenta = bf.readLine();
                        }
                        /* Validamos si la fecha de venta está comprendida entre la fecha de inicio y fin del contrato del empleado.
                        De no ser así, vuelve a pedir de nuevo la fecha. */
                        while(!Validaciones.validarFechaVenta(emp.getFechaInicio(), emp.getFechaFin(), fechaVenta)){
                            System.out.println("** La fecha no puede ser antes del inicio del contrato o después.");
                            System.out.print(" - Introduce la fecha de la venta: ");
                            fechaVenta = bf.readLine();
                            while (!Validaciones.validarFecha(fechaVenta)){
                                System.out.println("La fecha no cumple con los requisitos de validación.");
                                System.out.println("Vuelva a introducir otra fecha: ");
                                fechaVenta = bf.readLine();
                            }
                        }
                        System.out.println("- Introduce el importe de la venta: ");
                        double importeVenta = Double.parseDouble(bf.readLine());

                        // Lo añadimos a la lista de ventas del empleado temporal.
                        for(Empleado e : empleAct){
                            if(e instanceof EmpTemporal){
                                if(Objects.equals(e.getNss(), emp.getNss())){
                                    // Creamos el objeto venta con la nueva venta.
                                    Ventas venta = new Ventas(fechaVenta, importeVenta);
                                    // Añadimos la venta al empleado utilizando un array auxiliar.
                                    ArrayList<Ventas> v = emp.getVentas();  // Traemos con get la lista de ventas del empleado.
                                    v.add(venta);  // Añadimos a la lista auxiliar de ventas la nueva venta.
                                    ((EmpTemporal) e).setVentas(v); // Establecemos como nueva lista de ventas del empleado el arrayList auxiliar.
                                    // Sumamos las ventas que tiene en total para actualizar el importe ventas del empleado.
                                    double sumaVentas = 0; // Se guarda la suma para sumaVentas del empleado.
                                    for(Ventas ve : ((EmpTemporal) e).getVentas()){
                                        sumaVentas = sumaVentas + ve.getImporteVenta();
                                    }
                                    int sumaV = (int) sumaVentas;
                                    ((EmpTemporal) e).setImporteVentas(sumaV);
                                    break;
                                }
                            }
                        }
                        System.out.println("Venta añadida correctamente.");
                    }
                }
            }
        }
    }


    // TODO: Método que muestra los empleados temporales con un total de ventas superior a 10.000 €.
    public static void consultarTemp(ArrayList<Empleado> empleAct){
        if(empleAct.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();
        }else {
            System.out.println("******* CONSULTAS VENTAS *********");
            for (Empleado e : empleAct) {
                if (e instanceof EmpTemporal) {
                    if (((EmpTemporal) e).getImporteVentas() > 10000) {
                        System.out.println("NSS\t       Nombre\t       Total");
                        System.out.println("================================");
                        System.out.println(e.getNss() + "\t  " + e.getNombre() + "\t  " + ((EmpTemporal) e).getImporteVentas() + "€");
                    }
                }
            }
        }
        System.out.println();
    }



}