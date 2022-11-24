import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String nombre;
        int grado;

        //Pedimos los datos.
        System.out.println("CODIFICAR PRODUCTO:\n" +
                "- Nombre producto: ");
        nombre = reader.nextLine();
        System.out.println("- Grado: ");
        grado = reader.nextInt();
        while(grado < 0){
            System.err.println("El grado no puede ser menor que 0. Vuelve a intentarlo:");
            grado = reader.nextInt();
        }
        reader.close();

        //Intanciamos un producto.
        producto producto1 = new producto(nombre, grado);
        producto1.toxicidad();
        System.out.println("- TOXICIDAD: :"+producto1.getNivelTox());











    }
}