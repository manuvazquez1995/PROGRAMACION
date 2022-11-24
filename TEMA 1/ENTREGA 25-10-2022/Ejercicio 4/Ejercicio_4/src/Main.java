import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;
        int suma;

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);

        System.out.println("Introduzca el primeR numero: ");
        n1 = num1.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        n2 = num1.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        n3 = num3.nextInt();

        System.out.println("Numeros introducidos: "+n1+", "+n2+", "+n3);

        suma = n2 + n3;
        if(n1 == suma){
            System.out.println("Se cumple que N1=N2+N3");

        }else{
            suma = n1 + n3;
            if(n2 == suma){
                System.out.println("Se cumple que N2=N1+N3");

            }else{
                suma = n1 + n2;
                if(n3 == suma){
                    System.out.println("Se cumple que N3=N1+N2");

                }else{
                    System.out.println("Los numeros no cumplen la condicion.");

                }

            }

        }

    }

}