package afortunado;
import bufferedReader.*;
import java.io.IOException;


//Esta clase sirve para comprobar un número introducido por teclado por el usuario.
public class afortunado {

    //Variable donde se guarda el número introducido por el usuario.
    int nUsuario;

    //Contadores para saber cuántos números de la buena y mala suerte tiene.
    int contBuenaSuerte = 0;
    int contMalaSuerte = 0;


    //Constructor parametrizado.
    public afortunado(int nUsuario){
        this.nUsuario=nUsuario;
    }

    //Método que comprueba los cada dígito del número para comprobar qué números de cada tipo tiene.
    public void comprobarNumeros(){
        String nums = String.valueOf(nUsuario);              // Guarda el nUsuario convertido en un String dentro de otra variable.
        for(int i=0; i< nums.length(); i++){                 // El for lo hace mientras sea menor que el tamaño del String.
            char n = nums.charAt(i);                         // Guarda el carácter según el número de recorrido del bucle.
            int opNum = Integer.parseInt(String.valueOf(n)); // Transforma el carácter anterior en un entero.
            switch (opNum){                                  // Aumentamos los contadores según el dígito que vaya comprobando.
                case 0, 1, 2, 4, 5, 6 -> contMalaSuerte++;
                case 3, 7, 8, 9 -> contBuenaSuerte++;
            }
        }
    }


    //Método que indica si es afortunado o no según los contadores empleados en el método comprobarNumeros().
    public void comprobarSuerte(){
        if(contBuenaSuerte>contMalaSuerte){
            System.out.print("NÚMERO AFORTUNADO");

        } else if (contBuenaSuerte<contMalaSuerte) {
            System.out.print("NÚMERO NO AFORTUNADO");
        }else{
            System.out.print("TIENE TANTOS NÚMEROS AFORTUNADOS COMO NO AFORTUNADOS.");
        }
    }


    //Método estático que imprime las opciones del menú.
    public static void opMenu(){
        System.out.println("""
                             ** MENÚ PRINCIPAL **
                (1) Introducir número.
                (2) Valorar número.
                (3) Salir.
                
                * Escoja una opción (nº):
                """);
    }


    //Método estático para crear el menú. Puede ser utilizado sin tener que instanciar el objeto.
    public static void menu() throws IOException {

        int num = 0; //Para la opción 2, si no se introdujo un número previamente, establece como predeterminado el 0.

        System.out.println("""
                #####################################
                ########### Nº AFORTUNADO ###########
                #####################################
                """);
        opMenu();
        byte op = bufferedReader.leerByte();
        do{
            while(op<1 | op>3){
                System.out.println("""
                               ##############################################
                               Opción incorrecta, introduzca una opción válida.
                               
                               """);
                opMenu();
                op = bufferedReader.leerByte();
            }
            switch (op){
                case 1 -> {
                    System.out.println("Introduzca número para comprobar: ");
                    num = bufferedReader.leerInt();     //Se pide el número por teclado.
                    while(num<0){                       //Para comprobar que no sea negativo. Si lo es, lo vuelve a pedir.
                        System.err.println("No puede ser negativo. ");
                        System.out.print("Introduzca uno positivo: ");
                        num = bufferedReader.leerInt();
                    }
                    System.out.println("Numero introducido correctamente.");
                    opMenu();
                    op = bufferedReader.leerByte();
                }
                case 2 -> {
                        afortunado af = new afortunado(num); //Creamos un objeto instanciando la clase, pasamos el número introducido antes como parámetro.
                        af.comprobarNumeros();               //Utilizamos el método que comprueba cada dígito y cuenta los números de cada tipo.
                        System.out.println("**********************");
                        System.out.print("["+num+"] -> ");
                        af.comprobarSuerte();                //Utilizamos el método que nos imprime si es afortunado o no.
                        System.out.println();
                        System.out.println();
                        opMenu();
                        op = bufferedReader.leerByte();
                }
            }
        }while(op!=3);
        System.out.println("FIN DEL PROGRAMA. HASTA LUEGO");
    }


}
