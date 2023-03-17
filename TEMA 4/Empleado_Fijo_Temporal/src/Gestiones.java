import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class Gestiones implements iTeclado{

    // TODO: métodos que sirven para gestionar el main de la app, así como la gestión de los empleados.

    //Métodos que imprimen las opciones de los menús.
    //Menú principal.
    public static void menu(){
        System.out.println("""
                ************* MENÚ PRINCIPAL ***************
                (1) Altas de empleados fijos y temporales.
                (2) Altas de ventas de un empleado temporal.
                (3) Dar de baja un empleado.
                (4) Modificar los datos de un empleado.
                (5) Visualizar los datos de los empleados.
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



    // Método que dá de alta un empleado fijo o temporal.
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


    // Método que ordena alfabéticamente los empleados por nombre.
    public static void ordenarEmpNombre(ArrayList<Empleado> emple){
        emple.sort(Comparator.comparing(Empleado::getNombre)); // Una forma de ordenar un arrayList.
    }





}