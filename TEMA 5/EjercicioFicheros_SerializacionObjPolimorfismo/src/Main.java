import java.io.IOException;

public class Main implements Reader {
    public static void main(String[] args) throws IOException {

        // String donde se guarda la ruta del fichero de datos.
        String fichero = "ficheros\\datos.dat";

        // Instancia la clase OperacionesAnimales.
        OperacionesAnimales opAnimales = new OperacionesAnimales();

        /* Ejecutamos el siguiente método para guardar en los arrays los animales que
        se guardaron en la ejecución anterior */
        opAnimales.leerYGuardarAnimalesDisco(fichero);

        opMenu();
        int op = Integer.parseInt(bf.readLine());

        while(op != 0){

            switch (op){

                case 1 -> {
                    /* El programa cumple con los requisitos, que indican que no se puede añadir
                     * más de 5 animales de cada tipo. Añado los siguientes animales comentados
                     * para no crearlos introduciendo sus datos por teclado.
                     */
                    //opAnimales.addPerro(new Perro("a", 5, true));
                    //opAnimales.addPerro(new Perro("aa", 5, false));
                    //opAnimales.addPerro(new Perro("aaa", 5, true));
                    //opAnimales.addPerro(new Perro("aaaa", 5, false));
                    //opAnimales.addPerro(new Perro("aaaaa", 5, true));
                    //opAnimales.addGato(new Gato("b", 2, false));
                    //opAnimales.addGato(new Gato("bb", 2, true));
                    //opAnimales.addGato(new Gato("bbb", 2, false));
                    //opAnimales.addGato(new Gato("bbbb", 2, true));
                    //opAnimales.addGato(new Gato("bbbbb", 2, false));

                    opMenuAddAnimal();
                    int opA = Integer.parseInt(bf.readLine());
                    while (opA != 0){
                        switch (opA){
                            case 1 -> {
                                if(opAnimales.isFullPerros(opAnimales.perros)){
                                    System.out.println("- La lista de perros ya está llena.");
                                    System.out.println();
                                    opMenuAddAnimal();
                                    opA = Integer.parseInt(bf.readLine());
                                }else{
                                    System.out.println("- Introduzca el nombre: ");
                                    String nombre = bf.readLine();
                                    System.out.println("- Introduzca su edad: ");
                                    int edad = Integer.parseInt(bf.readLine());
                                    System.out.println("- ¿Tiene rabo largo? (true/false)");
                                    boolean raboLargo = Boolean.parseBoolean(bf.readLine());
                                    opAnimales.addPerro(new Perro(nombre, edad, raboLargo));
                                    System.out.println("El perro fué añadido correctamente.");
                                    opMenuAddAnimal();
                                    opA = Integer.parseInt(bf.readLine());
                                }
                            }
                            case 2 -> {
                                if(opAnimales.isFullGatos(opAnimales.gatos)){
                                    System.out.println("- La lista de gatos ya está llena.");
                                    System.out.println();
                                    opMenuAddAnimal();
                                    opA = Integer.parseInt(bf.readLine());
                                }else{
                                    System.out.println("- Introduzca el nombre: ");
                                    String nombre = bf.readLine();
                                    System.out.println("- Introduzca su edad: ");
                                    int edad = Integer.parseInt(bf.readLine());
                                    System.out.println("- ¿Tiene bigote largo? (true/false)");
                                    boolean bigoteLargo = Boolean.parseBoolean(bf.readLine());
                                    opAnimales.addGato(new Gato(nombre, edad, bigoteLargo));
                                    System.out.println("El gato fué añadido correctamente.");
                                    opMenuAddAnimal();
                                    opA = Integer.parseInt(bf.readLine());
                                }
                            }
                            default -> {
                                System.out.println("- Opción no válida, vuelva a intentarlo.");
                                opMenuAddAnimal();
                                opA = Integer.parseInt(bf.readLine());
                            }
                        }
                    }
                    opMenu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 2 -> {
                    System.out.println("*** GUARDAR ANIMALES EN DISCO***");
                    if(opAnimales.perros.isEmpty() && opAnimales.gatos.isEmpty()){
                        System.out.println("*** No hay animales que guardar, debe introducirlos previamente");
                        System.out.println();
                        opMenu();
                        op = Integer.parseInt(bf.readLine());
                    }else{
                        opAnimales.guardarAnimalesADisco(fichero);
                        opMenu();
                        op = Integer.parseInt(bf.readLine());
                    }
                }

                case 3 -> {
                    System.out.println("*** ANIMALES EN DISCO ***");
                    opAnimales.leerAnimalesDisco(fichero);
                    System.out.println();
                    opMenu();
                    op = Integer.parseInt(bf.readLine());
                }

                case 4 -> {
                    System.out.println("*** BORRAR ANIMAL ***");
                    if(opAnimales.perros.isEmpty() && opAnimales.gatos.isEmpty()){
                        System.out.println("*** No hay animales que borrar, debe introducirlos previamente");
                        System.out.println();
                        opMenu();
                        op = Integer.parseInt(bf.readLine());
                    }else {
                        System.out.println("- Introduzca el nombre del animal a borrar: ");
                        String nombre = bf.readLine();
                        opAnimales.borrarAnimal(nombre, fichero);
                        opMenu();
                        op = Integer.parseInt(bf.readLine());
                    }
                }

                default -> {
                    System.out.println("- Opción no válida, vuelva a intentarlo.");
                    opMenu();
                    op = Integer.parseInt(bf.readLine());
                }

            }

        }
        System.out.println("FIN DEL PROGRAMA.");
    }


    public static void opMenu(){
        System.out.println("""
                ******* MENÚ PRINCIPAL *******
                (1) Añadir animales.
                (2) Guardar animales en disco.
                (3) Leer animales guardados en disco.
                (4) Borrar animal (En array y disco).
                (0) Salir.
                Escoja una opción.
                
                """);
    }

    public static void opMenuAddAnimal(){
        System.out.println("""
                ***** MENÚ AÑADIR ANIMAL *****
                (1) Añadir perro.
                (2) Añadir gato.
                (0) Menú principal.
                Escoja una opción.
                
                """);
    }


}