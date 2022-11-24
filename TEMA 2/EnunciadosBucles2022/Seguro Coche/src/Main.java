import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Datos de entrada.
        System.out.println("*********** CALCULAR SEGURO ***********");
        System.out.println("- Nombre del asegurado: ");
        String nombreAsegurado = reader.nextLine();
        System.out.println("Edad: ");
        int edadAsegurado = reader.nextInt();
        reader.nextLine();
        System.out.println("- Años de carnet: ");
        int anhosCarnet = reader.nextInt();
        reader.nextLine();
        System.out.println("Precio del coche a asegurar: ");
        double precioCoche = reader.nextDouble();
        reader.close();

        //Lo siguiente es para crear un cliente del seguro para ver cuánto tiene que pagar.
        seguro seguro1 = new seguro(nombreAsegurado, edadAsegurado,anhosCarnet, precioCoche);

        /*Instanciamos la clase ver para mostrar los datos del total. Le pasamos como parámetro
        la instancia "seguro1" que es el cliente creado anteriormente.
        Posteriormente, invocamos el método ver de la clase ver para mostrar todos los datos.*/
        ver ver1 = new ver();
        ver1.ver(seguro1);

    }

}