import java.io.IOException;
import java.util.ArrayList;

public class Main implements iTeclado {
    public static void main(String[] args) throws IOException {

        // Declaramos los arrayLists donde se guardarán los empleados.
        ArrayList<Empleado> empleAct = new ArrayList<>();
        ArrayList<Empleado> empleBaja = new ArrayList<>();


        // Menú principal.

        Gestiones.alta(empleAct, empleBaja);




    }


}