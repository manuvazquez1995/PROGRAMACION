import java.io.IOException;
import java.util.ArrayList;


public class Gestiones implements iTeclado{

    // TODO: métodos que sirven para gestionar el main del la app, así como la gestión de los empleados.

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



    // Método que dá de alta un empleado fijo o temporal.
    public static void alta(ArrayList<Empleado> empleAct, ArrayList<Empleado> empleBaja) throws IOException {
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

                    

                }

                default -> {
                    System.out.println("Opción no válida, vuelva a intentarlo.");
                    menuAltas();
                    op = Integer.parseInt(bf.readLine());
                }
            }
        }
    }





}