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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
 
/*
La misma operación se puede realizar al contrario,
leer un fichero XML y rellenar un objeto Java.
*/
public class Leer {
 
    public static void main(String[] args) {
     
        try {
            JAXBContext context = JAXBContext.newInstance( Libro.class );
            Unmarshaller unmarshaller = context.createUnmarshaller();
                
            Libro libro = (Libro)unmarshaller.unmarshal(
                //new File("src/Libro.xml") );
                new File("ficheros/Libro.xml") );
            
            System.out.println(libro.getTitulo());
            System.out.println(libro.getPaginas());
             
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
 
}
