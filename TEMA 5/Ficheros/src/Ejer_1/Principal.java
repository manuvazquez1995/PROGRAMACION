package Ejer_1;
import java.io.*;


public class Principal {

    public static void main(String[] args) throws IOException {

        // Atributo que guarda la ruta del fichero.
        String sourceFilePath = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_1\\prueba.txt";

        // Se ejecuta el método que nos muestra el contenido del fichero.
        readFile(sourceFilePath);


    }



    // Método que lé un texto del fichero prueba y lo muestra sin espacios.
    public static void readFile(String sourceFilePath) throws IOException {

        // Con la clase file indicamos la ruta del archivo de texto.
        FileReader in = null;

        try {

            // Abrimos el reader con la ruta del fichero.
            File sourceFile = new File(sourceFilePath);  // File solo sirve para acceder a las características del archivo, no para leerlo.

            if(!sourceFile.exists()){
                System.err.println("No existe el fichero, tienes que crearlo antes.");

            }else {

                // Abrimos el reader para leer el fichero.
                in = new FileReader(sourceFilePath);

                // Usamos método read para leer y mostrar el texto contenido en el fichero carácter a carácter.
                int oneChar;
                while ((oneChar = in.read()) != -1) {
                    if(oneChar != 32) {  // El 32 es para omitir los espacios vacíos.
                        System.out.print((char) oneChar);  // Convertimos la información que lé en un char.
                    }
                }
            }

        }finally {
            // Cerramos el reader tanto como si funcionó o no.
            if(in != null){
                in.close();
            }
        }


    }


}