/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.JAXBEjemplos;

/**
 *
 * @author mrnov
 */
/*Es momento de generar el fichero XML.*/

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;


public class Escribir {
 
    public static void main(String[] args) {
     
        try {
            Libro libro= new Libro("Odisea 2001",400);           
            
            // Creamos el contexto indicando la clase raíz
            JAXBContext contexto = JAXBContext.newInstance( libro.getClass() );
            
             //Creamos el Marshaller, convierte el Java bean en una cadena XML
            Marshaller marshaller = contexto.createMarshaller();
            
            //Formateamos el xml para que quede bien
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Lo visualizamos con system out
            marshaller.marshal(libro, System.out);
                
            // Escribimos en el archivo
            marshaller.marshal(libro, new File("ficheros/Libro.xml"));
                
        } catch (PropertyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
 /*
Disponemos de dos objetos el contexto y el marshaller.
El contexto se encarga de definir los objetos de negocio que vamos a utilizar 
        y el marshaller en que forma vamos a generar la estructura.
        */
    }
 
}
