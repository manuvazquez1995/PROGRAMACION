package cajaFuerte;
import bufferedReader.*;
import java.io.IOException;

public class cajaFuerte {

    //Creamos una combinación en un array, dicha combinación es fija.
    static int[] combinacion = {1,0,3,2,0,6};

    //Método para comprobar que un número es positivo.
    public static boolean validarPositivo(int n){
        boolean esPositivo = true;
        if(n<0){
            esPositivo = false;
        }
        return esPositivo;
    }


    //Método estático con las opciones del menu.
    public static void opMenu(){
        System.out.println("""
                             ** MENÚ PRINCIPAL **
                (1) Introducir combinación.
                (2) Valorar combinación.
                (3) Salir.
                
                * Escoja una opción (nº):
                """);
    }


    //Método estático que muestra el menú, donde se podrá utilizar todas las funcionalidades.
    public static void menu() throws IOException {
        /*Para comprobar que se ha introducido una combinación,
          util por si le damos a la opción 2 sin introducir una combinación.*/
        boolean combIntr = false;
        boolean masNums = true;

        //Contador que se irá restando a medida que la combinación introducida no sea la correcta.
        int cont = 4;

        // Array donde se guardarán los números introducidos por el usuario.
        int[] combUsuario = new int[6];

        System.out.println("""
                #####################################
                ############ CAJA FUERTE ############
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
                    for(int i=combinacion.length-1; i>=0; i--){
                        if(masNums){
                            System.out.println("- Introduce un número: ");
                            int n = bufferedReader.leerInt();
                            while(!cajaFuerte.validarPositivo(n)){
                                System.err.println("No puede ser negativo.");
                                System.out.println("Introduzca uno positivo: ");
                                n = bufferedReader.leerInt();
                            }
                            combUsuario[i] = n; //Asignamos el número introducido.
                            System.out.println("¿Desea introducir más números? (-1)->para parar: ");
                            int siOno = bufferedReader.leerInt();
                            if(siOno == -1){
                                masNums = false;
                            }
                        }else{
                            /*Si se le indica previamente que no se introduce más números
                            rellena por la izquierda. Por eso hice el for contando al revés. */
                            combUsuario[i] = 0;
                        }
                    }
                    combIntr = true; //Para comprobar que hay una combinación introducida por el usuario en la opción 2.
                }
                case 2 -> {
                    boolean iguales = true; //Cambia si se comprueba que las combinaciones no sean iguales.
                    if(combIntr){
                        System.out.println("- La combinación del usuario es: \n" +
                                "***********************************");
                        for(int i=0; i<combUsuario.length; i++){
                            System.out.print(combUsuario[i]+" ");
                        }
                        System.out.println("***********************************");


                        //Comprobamos si las 2 combinaciones son iguales.
                        //TODO: me falla aquí, no di encontrado la solución.
                        for(int i=combUsuario.length-1; i>=0 & iguales; i--){
                            for(int x=0; x<=cajaFuerte.combinacion.length-1; x++){
                                if(combUsuario[i] != cajaFuerte.combinacion[x]) {
                                    iguales = false;
                                }
                            }
                        }


                        if(iguales){
                            System.out.println("ENORABUENA, has abierto la caja fuerte.");
                        }else{
                            cont--; //Restamos 1 al contador.
                            System.out.println("Combinación ERRÓNEA, te quedan "+cont+"\n" +
                                    "***********************************");

                        }

                    }else{
                     System.err.println("No existe una combinación introducida por el usuario.");
                     System.out.println("Debe introducirla previamente en la opción 1.\n" +
                             "**********************************");
                        opMenu();
                        op = bufferedReader.leerByte();
                    }
                }

            }
            opMenu();
            op = bufferedReader.leerByte();

        }while(op!=3);
        System.out.println("FIN DEL PROGRAMA. HASTA LUEGO");


    }


}