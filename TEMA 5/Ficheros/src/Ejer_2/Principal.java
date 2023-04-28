package Ejer_2;
import javax.swing.*;
import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {

        String inputSourceFilePath1 = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_2\\A.txt";
        String inputSourceFilePath2 = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_2\\B.txt";
        String outputSourceFilePath = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_2\\";
        String nombreFichero = JOptionPane.showInputDialog("- Introduce el nombre del archivo: ");
        outputSourceFilePath = outputSourceFilePath + nombreFichero;  // Concatenamos la ruta con el nombre del archivo.


        // Como el método solo admite File con parámetros, los creamos antes de ejecutar el propio método.
        File f1 = new File(inputSourceFilePath1);
        File f2 = new File(inputSourceFilePath2);
        File destino = new File(outputSourceFilePath);

        // Ejecutamos el método.
        leerYescribir(f1, f2, destino);

    }


    // Método para copiar el contenido de 2 archivos a un tercero (carácter a carácter).
    public static void leerYescribir(File f1, File f2, File destino) throws IOException {

        // Declaramos los streams de entrada y salida, para leer y escribir.
        InputStream in1 = null;
        InputStream in2 = null;
        OutputStream out = null;


        // Comprobamos que existe
        if(destino.createNewFile()){
            System.out.println("El fichero de destino creado.");
        }else{
            System.out.println("El fichero ya existe.");
        }

        try{

            //Abrimos los streams.
            in1 = new FileInputStream(f1);
            in2 = new FileInputStream(f2);
            out = new FileOutputStream(destino);

            // Usamos los métodos read y write para leer y escribir byte a byte.
            int oneByte;
            while((oneByte = in1.read()) != -1){  // Leemos el primero y escribimos en out.
                out.write(oneByte);  // Escribimos carácter a carácter.
            }

            while((oneByte = in2.read()) != -1){  // Leemos el segundo y escribimos en out.
                out.write(oneByte);   // Escribimos carácter a carácter.
            }


        }finally {
            // Cerramos todos los streams.
            if(in1 != null){
                in1.close();
            }
            if(in2 != null){
                in2.close();
            }
            if(out != null){
                out.close();
            }
        }


    }


}