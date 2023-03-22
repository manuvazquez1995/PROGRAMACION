import java.io.IOException;
import java.util.ArrayList;

public class Main implements iTeclado {
    public static void main(String[] args) throws IOException {

        // Declaramos los arrayLists donde se guardarán los empleados.
        ArrayList<Empleado> empleAct = new ArrayList<>();
        ArrayList<Empleado> empleBaja = new ArrayList<>();


        // Menú principal.
        Gestiones.menu();
        int op = Integer.parseInt(bf.readLine());

        while(op!=0){

            switch (op){
                //Opción para gestionar las altas de empleados tanto fijos como temporales.
                case 1 ->{
                    Gestiones.alta(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 2 ->{
                    AltasVentas.altaVenta(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 3 ->{
                    BajasEmpleados.baja(empleAct,empleBaja);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 4 ->{
                    Gestiones.menuModEmpleados();
                    int opMod = Integer.parseInt(bf.readLine());
                    while (opMod!=0){
                        switch (opMod){
                            case 1 ->{
                                ModificarEmpleados.modEmpFijo(empleAct);
                                Gestiones.menuModEmpleados();
                                opMod = Integer.parseInt(bf.readLine());
                            }
                            case 2 ->{
                                ModificarEmpleados.modEmpTemp(empleAct);
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
                    Gestiones.menuVisualizar();
                    int opVisualizar = Integer.parseInt(bf.readLine());
                    while (opVisualizar!=0){
                        switch (opVisualizar){
                            case 1 -> {
                                Visualizar.visualiza(empleAct);
                                Gestiones.menuVisualizar();
                                opVisualizar = Integer.parseInt(bf.readLine());
                            }
                            case 2 -> {
                                Visualizar.visualiza(empleAct, empleBaja);
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

                case 6 -> {
                    // TODO: FALTA CONSULTAS DE LOS EMPLEADOS TEMPORALES CON MÁS DE 10.000 € EN VENTAS.
                }

                default -> {
                    System.err.println("- Opción no válida, vuela a intentarlo.");
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }
            }

        }

        System.out.println("FIN DEL PROGRAMA, HASTA LUEGO.");

    }


}