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
                //Opción para gestionar las altas de empleados tanto fijos como temporales.
                case 1 ->{
                    Gestiones.alta(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 2 ->{
                    Gestiones.altaVenta(empleAct);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 3 ->{
                    Gestiones.baja(empleAct,empleBaja);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 4 ->{
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
                    // TODO: FALTA CONSULTAS DE LOS EMPLEADOS TEMPORALES CON MÁS DE 10.000 € EN VENTAS.
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