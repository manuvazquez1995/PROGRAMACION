import java.io.IOException;
import java.util.ArrayList;

public class Main implements iTeclado{
    public static void main(String[] args) throws IOException {

        // TODO: colección dinámica donde se guardará los objetos veterinario y auxiliar.
        ArrayList<Persona> listadoP = new ArrayList<>();


        // Lo siguiente son los datos de prueba, ya que no tengo que introducirlos por teclado.

        // Creamos un Paciente con su historial
        Historial historial = new Historial("21/03/2022", "Revision", 50, true);
        Paciente paciente = new Paciente("44444444L", "Roberto", "Rufus",
                "Pastor Alemán", "655555555");
        ArrayList<Historial> hp = paciente.getH();
        hp.add(historial);
        paciente.setH(hp);

        // Creamos un veterinario.
        Veterinario v = new Veterinario("22222222K", "Carlos", "600000000",
                3000, 21, 5);
        ArrayList<Paciente> pac = v.getP();
        pac.add(paciente);
        v.setP(pac);

        //Una vez montado, guardamos el veterinario en la lista ListadoP.
        listadoP.add(v);



        // Menú principal.
        System.out.println("******* CLÍNICA VETERINARIA *******");
        Gestiones.menu();
        int op = Integer.parseInt(bf.readLine());

        while(op!=0){
            switch (op){
                case 1 ->{
                    Gestiones.visualizacionTrabajos(listadoP);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }
                case 2 ->{
                    Gestiones.bajaVeterinario(listadoP);
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }
                case 3 ->{
                    //Esta opción no era para esto, yo la utilicé para comprobar la baja del veterinario.
                    for(Persona p : listadoP){
                        System.out.println(p.getNombre());
                    }
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }
                default ->{
                    System.err.println("- Opción no válida, vuelva a intentarlo: ");
                    Gestiones.menu();
                    op = Integer.parseInt(bf.readLine());
                }
            }
        }

    }
}