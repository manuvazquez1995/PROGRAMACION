import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Main implements iTeclado {
    public static void main(String[] args) throws IOException, ParseException {

        // Declaramos los arrayLists donde se guardarán los empleados.
        ArrayList<Empleado> empleAct = new ArrayList<>();
        ArrayList<Empleado> empleBaja = new ArrayList<>();


        // Menú principal.
        Gestiones.menu();
        int op = Integer.parseInt(bf.readLine());

        while(op!=0){

            switch (op){
                //Gestiona las altas de empleados tanto fijos como temporales.
                case 1 ->{
                    Gestiones.alta(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 2 ->{
                    // Para dar de alta una venta de un empleado temporal (hace búsqueda del mismo).
                    Gestiones.altaVenta(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 3 ->{
                    // Para dar de baja un empleado en activo.
                    Gestiones.baja(empleAct,empleBaja);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 4 ->{
                    //Para modificar un empleado, sea fijo o temporal (cada tipo de empleado tiene unas opciones distintas).
                    Gestiones.menuModEmpleados();
                    int opMod = Integer.parseInt(bf.readLine());
                    while (opMod!=0){
                        switch (opMod){
                            case 1 ->{
                                Gestiones.modEmpFijo(empleAct);
                                Gestiones.menuModEmpleados();
                                opMod = Integer.parseInt(bf.readLine());
                            }
                            case 2 ->{
                                Gestiones.modEmpTemp(empleAct);
                                Gestiones.menuModEmpleados();
                                opMod = Integer.parseInt(bf.readLine());
                            }
                            default -> {
                                System.err.println("- Opción no válida, vuela a intentarlo.");
                                Gestiones.menuModEmpleados();
                                opMod = Integer.parseInt(bf.readLine());
                            }
                        }
                    }
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 5 ->{
                    // Para visualizar los datos de los empleados, tiene 2 opciones.
                    Gestiones.menuVisualizar();
                    int opVisualizar = Integer.parseInt(bf.readLine());
                    while (opVisualizar!=0){
                        switch (opVisualizar){
                            case 1 -> {
                                Gestiones.visualiza(empleAct);
                                Gestiones.menuVisualizar();
                                opVisualizar = Integer.parseInt(bf.readLine());
                            }
                            case 2 -> {
                                Gestiones.visualiza(empleAct, empleBaja);
                                Gestiones.menuVisualizar();
                                opVisualizar = Integer.parseInt(bf.readLine());
                            }
                            default -> {
                                System.err.println("- Opción no válida, vuela a intentarlo.");
                                Gestiones.menuVisualizar();
                                opVisualizar = Integer.parseInt(bf.readLine());
                            }
                        }
                    }
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 6 ->{
                    // Para visualizar los empleados temporales que tienen ventas totales superiores a 10.000 €.
                    Gestiones.consultarTemp(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                default ->{
                    System.err.println("- Opción no válida, vuela a intentarlo.");
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }
            }

        }

        System.out.println("FIN DEL PROGRAMA, HASTA LUEGO.");

    }


}