package Exceptions.Ejer_1;
import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        // ArrayList donde guardaremos las matrículas.
        menu();
        int op = bufferReader.leerInt();

        while(op!=0){
            switch (op){
                case 1 -> {
                    System.out.println("- Introduce una matrícula: ");

                }
                case 2 -> {}
                default -> {
                    System.err.println("Opción no válida. Vuelva a intentarlo.");
                    menu();
                    op = bufferReader.leerInt();
                }
            }
        }


    }

    public static void menu(){
        System.out.println("""
                (1) Dar de alta matrícula.
                (2) Visualizar matrículas.
                
                Escoja una opción:
                
                """);
    }



}
