package Ejer_2;
import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {

        String inputSourceFilePath1 = ".\\ficheros\\A.txt";
        String inputSourceFilePath2 = ".\\ficheros\\B.txt";
        String outputSourceFilePath = ".\\ficheros";

        leerYescribir(inputSourceFilePath1, inputSourceFilePath2, outputSourceFilePath);


    }


    // Método para copiar el contenido de 2 archivos a un tercero (carácter a carácter).
    public static void leerYescribir(String inputSourceFilePath1,
                                     String inputSourceFilePath2,
                                     String outputSourceFilePath)
            throws IOException {

        // Con la clase file comprobamos las propiedades de los ficheros (por ejemplo si existen).
        File in1F = new File(inputSourceFilePath1);
        File in2F = new File(inputSourceFilePath2);
        File outF = new File(outputSourceFilePath);

        // Declaramos los streams de entrada y salida.
        InputStream in1 = null;
        InputStream in2 = null;
        OutputStream out = null;

        // Comprobamos que existe
        while(!outF.exists()){
            System.err.println("El fichero de destino no existe.");
            System.out.println("Creando fichero de destino...");
            outF.createNewFile();
        }

        try{

            //Abrimos los streams.
            in1 = new FileInputStream(inputSourceFilePath1);
            in2 = new FileInputStream(inputSourceFilePath2);
            out = new FileOutputStream(outputSourceFilePath);

            // Usamos los métodos read y write para leer y escribir byte a byte.
            int oneByte;
            while((oneByte = in1.read()) != 1){  // Leemos el primero y escribimos en out.
                out.write(oneByte);
            }
            while((oneByte = in1.read()) != 1){  // Leemos el segundo y escribimos en out.
                out.write(oneByte);
            }


        }finally {
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