/*
 Diseñar un programa que calcule importe final de la venta considerando que
 sobre el valor bruto se hace un descuento según la siguiente tabla:
		- Valores <=20000 Descuento 0 MOD
		- Valores >20000 y <= 100000 Descuento 5  MOD
		- Valores > 100000 Descuento 10  MOD
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables junto a los escaneres.
        Double valorBruto;
        Double valorFinal;

        Scanner reader = new Scanner(System.in);

        //Leemos los números por teclado.
        System.out.println("Introduce el valor bruto para el descuento: ");
        valorBruto = reader.nextDouble();
        reader.nextLine();

        // Proceso donde también mostramos los datos de salida.
        if(valorBruto<=20000){
            valorFinal = valorBruto;
            System.out.println("No se hace descuento en ventas con valor inferior o igual a 20000.");
            System.out.println("Improte final: "+valorFinal);

        }else{
            if((valorBruto>20000) && (valorBruto<=100000)){
                valorFinal = valorBruto - (valorBruto * 0.05);
                System.out.println("Se hace un descuento del 5%");
                System.out.println("Improte final: "+valorFinal);

            }else{
                valorFinal = valorBruto - (valorBruto * 0.1);
                System.out.println("Se hace un descuento del 10%");
                System.out.println("Improte final: "+valorFinal);

            }

        }

        reader.close();;
    }

}