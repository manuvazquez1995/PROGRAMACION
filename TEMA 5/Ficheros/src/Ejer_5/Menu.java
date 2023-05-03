package Ejer_5;
import java.io.IOException;
import java.util.ArrayList;

public class Menu implements iTeclado{


    // ArrayList donde se guardarán los vehiculos.
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    static String rutaArchivo = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_5\\vehiculos.dat";

    public static void opMenu(){
        System.out.println("""
                ********** MENU ************
                (1) Introducir vehículo.
                (2) Ver vehículos.
                (0) Salir
                
                Escoja una opción:
                
                """);
    }


    public static void menu() throws IOException {
        opMenu();

        try {
            int op = Integer.parseInt(bf.readLine());

            try{

                while(op != 0){

                    switch (op){
                        case 1 -> {
                            System.out.println("- Introduzca la matrícula: ");
                            String matr = bf.readLine();
                            System.out.println("- Introducir la marca: ");
                            String marc = bf.readLine();
                            System.out.println("- Introducir el tamaño del depósito: ");
                            double tamD = Double.parseDouble(bf.readLine());
                            System.out.println("- Introducir el modelo: ");
                            String mod = bf.readLine();

                            // Creamos el objeto y lo guardamos en el arrayList.
                            vehiculos.add(new Vehiculo(matr, marc, tamD, mod));
                            // Guardamos en el fichero el nuevo vehículo. (Vuelve a guardar lo que ya estaba guardado
                            // sobrescribiéndolo).
                            Methods.saveVehicles(vehiculos, rutaArchivo);

                            opMenu();
                            op = Integer.parseInt(bf.readLine());
                        }
                        case 2 -> {
                            // Aquí mostramos los vehículos guardados en el archivo.
                            System.out.println("****** VEHÍCULOS GUARDADOS ******");
                            Methods.showVehicles(rutaArchivo);

                            opMenu();
                            op = Integer.parseInt(bf.readLine());
                        }
                        default -> {
                            System.out.println("- Opción no válida, introduzca una opción correcta: ");
                            opMenu();
                            op = Integer.parseInt(bf.readLine());
                        }
                    }
                }

            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }finally {
            System.out.println("- FIN DEL PROGRAMA.");
        }

    }


}