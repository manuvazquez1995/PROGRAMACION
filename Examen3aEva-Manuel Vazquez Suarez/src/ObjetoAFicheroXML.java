import com.thoughtworks.xstream.XStream;
import examen.Biblioteca.POJOS.Biblioteca;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ObjetoAFicheroXML {

    // Método que guarda los datos de la biblioteca en un json.
    public static void GuardarXML(XStream xstream, Biblioteca biblioteca, File fXML) throws FileNotFoundException {
        String xml = xstream.toXML(biblioteca);
        System.out.println(xml);

        //Insertamos toda la estructura en un XML.
        xstream.toXML(biblioteca, new FileOutputStream(fXML));

        System.out.println("El fichero XML ha sido creado.");
    }




}