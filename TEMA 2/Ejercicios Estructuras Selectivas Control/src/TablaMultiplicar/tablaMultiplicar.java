package TablaMultiplicar;
import lectorDatos.reader;

public class tablaMultiplicar {

    public static void main(String[] args) {

        //Pedimos un número de la tabla de multiplicar.
        System.out.println("TABLA DE MULTIPLICAR\n" +
                "- Introduce un número: ");
        int numero = reader.leerInt();
        reader.nextLine();

        //Mostramos la tabla de multiplicar con un bucle for.
        for(int i=0; i<13; i++){
            System.out.println(numero+" x "+i+" = "+numero*i);
        }

    reader.close();
    }


}
