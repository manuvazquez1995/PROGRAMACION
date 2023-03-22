import java.util.ArrayList;

public class Visualizar {


    // Método que muestra los empleados en activo, tanto fijos como temporales.
    public static void visualiza(ArrayList<Empleado> empleAct){
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


    // Método que muestra
    public static void visualiza(ArrayList<Empleado> emple, ArrayList<Empleado> empleBaja){
        if(emple.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();
        }else {
            System.out.println("""
                            ******** EMPLEADOS EN ACTIVO ********
                                    Empleados Temporales
                    ==================================================         
                    Nombre      FechaIncio      FechaFin        Sueldo
                    ==================================================    
                    """);
            // Con el siguiente for solo sacamos los empleados temporales.
            for (Empleado e : emple) {
                if (e instanceof EmpTemporal) {
                    System.out.println(e.getNombre() + "\t    " + ((EmpTemporal) e).getFechaInicio() + "" +
                            "\t    " + ((EmpTemporal) e).getFechaFin() + "\t    " + ((EmpTemporal) e).getPrecioDia());
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
                    System.out.println(e.getNombre() + "\t    " + ((EmpFijo) e).getTrienios() + "\t    " + ((EmpFijo) e).getSalarioBase());
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


}