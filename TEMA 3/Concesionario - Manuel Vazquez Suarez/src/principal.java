import java.io.IOException;

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
        metodos.menu();
        int op = bufferReader.leerInt();

        while(op!=0) {
            switch (op) {
                // Cargamos los una lista de coches con la opción 1.
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
                    metodos.menu();
                    op = bufferReader.leerInt();
                }
                // Ordenación por marca, y en la misma opción mostramos la lista ordenada.
                case 2 -> {
                    metodos.ordenarPorMarca(concesionario);
                    metodos.mostrarConcesionario(concesionario);
                    metodos.menu();
                    op = bufferReader.leerInt();
                }
                // Ordenación por precio (del más caro al más barato), y en la misma opción mostramos la lista ordenada.
                case 3 -> {
                    metodos.ordenarPorPrecioMaxMin(concesionario);
                    metodos.mostrarConcesionario(concesionario);
                    metodos.menu();
                    op = bufferReader.leerInt();
                }
                // Búsqueda por marca o por precio, se escoge con el siguiente menú.
                case 4 -> {
                    metodos.menuBusqueda();
                    int opBus = bufferReader.leerInt();
                    while(opBus!=3){
                        switch (opBus){
                            case 1 -> {
                                System.out.println("Introduce el nombre del vehículo que desea buscar: ");
                                String nombreMarca = bufferReader.leerString();
                                metodos.ordenarPorMarca(concesionario); // Para que funcione la búsqueda por marca, se debe ordenar los elementos del array por orden alfabético.
                                metodos.busquedaBinMarca(concesionario, nombreMarca, 0, concesionario.length-1);
                                metodos.menuBusqueda();
                                opBus = bufferReader.leerInt();
                            }
                            case 2 -> {
                                System.out.println("Introduce el precio del vehículo que desea buscar: ");
                                int precioBuscar = bufferReader.leerInt();
                                metodos.ordenarPorPrecioMinMax(concesionario); // Para que funcione la búsqueda por precio, se debe ordenar por precio de menor a mayor.
                                metodos.busquedaBinPrecio(concesionario, precioBuscar, 0, concesionario.length-1);
                                metodos.menuBusqueda();
                                opBus = bufferReader.leerInt();
                            }
                            default -> {
                                System.err.println("- Opción no válida. Introduce una opción correcta: ");
                                metodos.menuBusqueda();
                                opBus = bufferReader.leerInt();
                            }
                        }
                    }
                    metodos.menu();
                    op = bufferReader.leerInt();
                }
                // Se muestra la lista completa de coches, sin tener en cuenta ninguna ordenación.
                case 5 -> {
                    metodos.mostrarConcesionario(concesionario);
                    metodos.menu();
                    op = bufferReader.leerInt();
                }
                default -> {
                    System.err.println("Opción no válida, introduzca una correcta.");
                    metodos.menu();
                    op = bufferReader.leerInt();
                }
            }
        }

        System.out.println("Fin del programa, HASTA LUEGO.");

    }

}