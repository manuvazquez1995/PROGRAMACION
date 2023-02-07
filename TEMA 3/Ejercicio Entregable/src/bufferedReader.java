import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {

    //Creamos un lector estático que podrá utilizar en cualquier parte del programa.
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Método para leer un String.
    public static String leerString() throws IOException {
        return reader.readLine();
    }

    //Método para leer un entero (primero recoge un String y lo convierte en un Int).
    public static int leerInt() throws IOException {
        String n = reader.readLine();
        return Integer.parseInt(n);
    }

    //Método para leer un double (primero recoge un String y lo convierte en un Double).
    public static double leerDouble() throws IOException {
        String n = reader.readLine();
        return Double.parseDouble(n);
    }

    //Método para leer un float (primero recoge un String y lo convierte en un Float).
    public static float leerFloat() throws  IOException {
        String n = reader.readLine();
        return Float.parseFloat(n);
    }

    //Método para leer un byte (primero recoge un String y lo convierte en un Byte).
    public static byte leerByte() throws IOException {
        String n = reader.readLine();
        return Byte.parseByte(n);
    }

    //Método para leer un boolean (primero recoge un String y lo convierte en un Boolean).
    public static boolean leerBoolean() throws IOException {
        String n = reader.readLine();
        return Boolean.parseBoolean(n);
    }

}