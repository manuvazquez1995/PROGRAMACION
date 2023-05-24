import com.thoughtworks.xstream.XStream;
import examen.Biblioteca.POJOS.Biblioteca;

import java.io.File;

public class FicheroAObjetoXML {

    public static void ficheroAObj(XStream xstream, File fXML){

        Biblioteca newBiblio = (Biblioteca) xstream.fromXML(fXML);

        System.out.println(newBiblio);

    }

}