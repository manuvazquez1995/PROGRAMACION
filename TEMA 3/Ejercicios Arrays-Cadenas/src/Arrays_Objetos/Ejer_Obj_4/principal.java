package Arrays_Objetos.Ejer_Obj_4;
import metodosReutilizables.bufferReader;
import java.io.IOException;
import static Arrays_Objetos.Ejer_Obj_4.metodos.*;

public class principal {

    /*
    4. Crear un array de objetos coche para simular un Concesionario.
    Se debe guardar del coche la siguiente info: marca, modelo,precio_base,
    aire_acondicionado,cierre_central,pintura_metalizada, tipo_motor.
     */
    public static void main(String[] args) throws IOException {

        //Array donde se guardarán los coches con su información.
        coche[] concesionario = new coche[5];

        //Variable que gestiona la opción escogida del menú.
        menu();
        int op = bufferReader.leerInt();

        while(op!=0) {
            switch (op) {
                case 1 -> {
                    coche c1 = new coche("BMW", "Serie 3", 25000, true,
                            true, false, "Diesel");
                    coche c2 = new coche("Audi", "A 3", 29000, true,
                            true, true, "Gasolina");
                    coche c3 = new coche("Peugeot", "308", 14000, true,
                            false, false, "Diesel");
                    coche c4 = new coche("Audi", "A 1", 15000, true,
                            true, false, "Gasolina");
                    coche c5 = new coche("BMW", "Serie 1", 21000, true,
                            true, false, "Diesel");
                    concesionario[0] = c1;
                    concesionario[1] = c2;
                    concesionario[2] = c3;
                    concesionario[3] = c4;
                    concesionario[4] = c5;
                    menu();
                    op = bufferReader.leerInt();
                }
                case 2 -> {
                    ordenarPorMarca(concesionario);
                    menu();
                    op = bufferReader.leerInt();
                }
                case 3 -> {
                    ordenarPorPrecio(concesionario);
                    menu();
                    op = bufferReader.leerInt();
                }
                case 4 -> {
                    //ordenarPorPrecio(concesionario);
                    //System.out.println("- Introduzca un precio a buscar: ");
                    //int precioBuscar = bufferReader.leerInt();
                    //int cod = metodos.runBinarySearchIteratively(concesionario, precioBuscar, 0, concesionario.length-1);
                    //System.out.println(cod);
                    int cod = busquedaBinMarca(concesionario, "BMW", 0, concesionario.length-1);
                    System.out.println(cod);
                    menu();
                    op = bufferReader.leerInt();
                }
                case 5 -> {
                    mostrarConcesionario(concesionario);
                    menu();
                    op = bufferReader.leerInt();
                }
                default -> {
                    System.err.println("Opción no válida, introduzca una correcta.");
                    menu();
                    op = bufferReader.leerInt();
                }
            }
        }


    }


}