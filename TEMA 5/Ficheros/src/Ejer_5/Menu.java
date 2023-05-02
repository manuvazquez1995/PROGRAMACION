package Ejer_5;

import java.io.IOException;

public class Menu implements iTeclado{

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
                        System.out.println("OPCIÓN 1");
                        opMenu();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 2 -> {
                        System.out.println("OPCIÓN 2");
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

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }finally {
            System.out.println("- FIN DEL PROGRAMA.");
        }

    }

















}