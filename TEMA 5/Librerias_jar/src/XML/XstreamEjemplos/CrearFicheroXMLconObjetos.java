/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.XstreamEjemplos;

/**
 *
 * @author mrnov
 */
/*
* Ejemplo que recorre el fichero Alumnos.Dat para crear una lista de
alumnos
* que después se insertarán en el fichero Alumnos.xml
*/


import com.thoughtworks.xstream.*;

import java.io.*;

public class CrearFicheroXMLconObjetos {
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        File fichero = new File("ficheros\\Alumnos_list.DAT");
        
        AltasObj.altas(fichero);
        
        FileInputStream lectura = new FileInputStream(fichero); //flujo de entrada
        // conecta el flujo de bytes al flujo de datos
        ObjectInputStream datos = new ObjectInputStream(lectura);
        System.out.println("Comienza el proceso de creación del fichero XML....");
        // Creamos un objeto Lista de alumnos

        ListaAlumnos listaalu = new ListaAlumnos();
        try{
            while(true){ // lectura del fichero
                Alumno alumno = (Alumno)datos.readObject(); // leer un alumno
                listaalu.add(alumno); //añadir un alumno a la lista
            }// fin while
        }catch(EOFException eo){}
        datos.close();
        try{
            XStream xstream = new XStream();
            //cambiar de nombre a las etiquetas XML
            xstream.alias("ListadoAlumnos", ListaAlumnos.class);
            xstream.alias("DatosAlumno", Alumno.class);
            //quitar etiqueta lista (atributo de la clase ListaAlumno
            xstream.addImplicitCollection(ListaAlumnos.class, "lista");
           
            //Insertar los objetos en el XML
            xstream.toXML(listaalu, new FileOutputStream("ficheros\\Alumnos_list.xml"));
            System.out.println("Creado el fichero xml");
        }catch(Exception e){
            e.printStackTrace();
        }
    }// fin main
}// fin clase
