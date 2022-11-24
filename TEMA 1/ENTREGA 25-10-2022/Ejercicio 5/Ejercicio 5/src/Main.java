/* Repetir el ejercicio anterior utilizando una variable de tipo lógico que
represente si se cumple o no que uno de los dos números es igual a la suma de
los otros dos. */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n1, n2, n3;
        boolean sonIguales = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el segundo número");
        n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el tercero número");
        n3 = sc.nextInt();
        sc.nextLine();

        while(!sonIguales){
            if(n1 == n2 + n3){
                sonIguales = true;
                System.out.println("Se cumple que N1=N2+N3");
            }else{
                if(n2 == n1 + n3){
                    sonIguales = true;
                    System.out.println("Se cumple que N2=N1+N3");
                }else{
                    if(n3 == n1 + n2){
                        sonIguales = true;
                        System.out.println("Se cumple que N3=N1+N2");
                    }else{
                        sonIguales = true;
                        System.out.println("Los números no cumplen la condición.");
                    }
                }

            }

        }

        sc.close();
    }

}