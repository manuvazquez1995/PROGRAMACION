package metodosReutilizables;
import java.util.Scanner;

//TODO: lector de datos reutilizables para cualquier proyecto.
public class reader {

    static Scanner reader = new Scanner(System.in);

    public static int leerInt(){
        return reader.nextInt();
    }

    public static float leerFloat(){
        return reader.nextFloat();
    }

    public static double leerDouble(){
        return reader.nextDouble();
    }

    public static String leerString(){
        return reader.nextLine();
    }

    public static byte leerByte(){
        return reader.nextByte();
    }

    public static boolean leerBoolean(){
        return reader.nextBoolean();
    }

    public static void nextLine(){reader.nextLine();}

    public static void close(){
        reader.close();
    }


}
