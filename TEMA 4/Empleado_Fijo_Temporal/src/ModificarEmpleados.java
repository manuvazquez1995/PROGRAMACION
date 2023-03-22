import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

        // TODO: ESTÁ BIEN, NO HAY NADA QUE CORREGIR.

public class ModificarEmpleados implements iTeclado{


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



    // Método para modificar un empleado fijo.
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
                            emp.setSalarioBase(newSalarioBase);  // Modificamos el salario base.
                            // Encontramos el objeto emp en el array de empleAct.
                            for(Empleado e : empleAct){
                                if(Objects.equals(e.getNss(), emp.getNss())){
                                    e = emp;
                                    break;
                                }
                            }
                            menuOpFijos();
                            opt = Integer.parseInt(bf.readLine());
                        }
                        case 2 -> {
                            System.out.println("- Introduce los trienios (actuales "+emp.getTrienios()+"):");
                            int newTrienios = Integer.parseInt(bf.readLine());
                            emp.setTrienios(newTrienios);
                            // Encontramos el objeto emp en el array de empleAct.
                            for(Empleado e : empleAct){
                                if(Objects.equals(e.getNss(), emp.getNss())){
                                    e = emp;
                                    break;
                                }
                            }
                            menuOpFijos();
                            opt = Integer.parseInt(bf.readLine());
                        }
                        case 3 -> {
                            System.out.println("- Introduce el nuevo salario base (actual "+emp.getSalarioBase()+"):");
                            int newSalarioBase = Integer.parseInt(bf.readLine());
                            emp.setSalarioBase(newSalarioBase);  // Modificamos el salario base.
                            System.out.println("- Introduce los trienios (actuales "+emp.getTrienios()+"):");
                            int newTrienios = Integer.parseInt(bf.readLine());
                            emp.setTrienios(newTrienios);
                            // Encontramos el objeto emp en el array de empleAct.
                            for(Empleado e : empleAct){
                                if(Objects.equals(e.getNss(), emp.getNss())){
                                    e = emp;
                                    break;
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



    // Método para modificar un empleado temporal.
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

                emp.setPrecioDia(newPrecioDia);

                for(Empleado e : empleAct){
                    if(Objects.equals(e.getNss(), emp.getNss())){
                        e = emp;
                        System.out.println("- Precio por día modificado correctamente.");
                        break;
                    }
                }

            }

        }

    }






}