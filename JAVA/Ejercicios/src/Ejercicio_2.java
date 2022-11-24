import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        //Definimos variables y escaneres.
        double pi = 3.14159;
        double radio;
        double diametro;
        double circunferencia;
        double area;

        Scanner lectura = new Scanner(System.in);

        //Pedimos los datos.
        System.out.println("Introduce el radio de la circunferencia: ");
        radio = lectura.nextDouble();
        diametro = radio * 2;

        //Proceso.
        circunferencia = pi * diametro;
        area = pi * Math.pow(radio, 2);

        System.out.println("La circunferencia es: "+circunferencia);
        System.out.println("El area es: "+area);


        lectura.close();;
    }
}
