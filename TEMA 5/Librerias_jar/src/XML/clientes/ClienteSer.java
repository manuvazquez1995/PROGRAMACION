package XML.clientes;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


//TODO: XSTREAM (funciona)


public class ClienteSer {


    public static void main(String[] args) throws FileNotFoundException {
        // Creamos el fichero si este no existe.
        File fXML = new File("ficheros\\clientsXstream.xml");
        // Para el xml.
        XStream xstream = new XStream();

        // Para que no de errores de acceso a tipos.
        xstream.allowTypes(new Class[]{Cliente.class,ClientList.class});

        // Alias opcionales.
        xstream.alias("Clientes", ClientList.class);
        xstream.alias("Cliente", Cliente.class);
        xstream.aliasAttribute(Cliente.class, "phone", "Phone");
        xstream.aliasAttribute(Cliente.class, "fax", "Fax");

        xstream.aliasAttribute(Cliente.class, "dni", "DNI");

        // Quitamos la etiqueta lista (atributo de la clase PeopleList).
        xstream.addImplicitCollection(ClientList.class, "lista");

        // Creamos 2 clientes y los metemos en un arrayList.
        Cliente cliente1 = new Cliente();
        cliente1.setDni("111111111A");
        cliente1.setFirstname("José");
        cliente1.setLastname("González");
        cliente1.setPhone(new PhoneNumber(100,"100100100"));
        cliente1.setFax(new PhoneNumber(100, "100100100"));

        Cliente cliente2 = new Cliente();
        cliente2.setDni("222222222B");
        cliente2.setFirstname("Jesús");
        cliente2.setLastname("López");
        cliente2.setPhone(new PhoneNumber(200, "222222222"));
        cliente2.setFax(new PhoneNumber(600, "222222222"));

        Cliente cliente3 = new Cliente();
        cliente3.setDni("333333333C");
        cliente3.setFirstname("Marta");
        cliente3.setLastname("Suárez");
        cliente3.setPhone(new PhoneNumber(300, "555555555"));
        cliente3.setFax(new PhoneNumber(900, "555555555"));

        ClientList list = new ClientList();
        list.add(cliente1);
        list.add(cliente2);
        list.add(cliente3);

        // Ejecutamos el método que guarda la lista en un xml.
        ObjAXML(xstream, list, fXML);

        System.out.println();

        // Ejecutamos el método que lista los objetos guardados en el xml.
        XMLAObj(xstream, fXML);


    }





    // Método que inserta clientes en el fichero XML.
    public static void ObjAXML(XStream xStream, ClientList list, File fXML) throws FileNotFoundException {
        // Convertimos el contenido del arrayList en formato xml, en el que se incluirá el contenido del arrayList(Lista).
        String xml = xStream.toXML(list);
        System.out.println(xml);  // Mostramos el contenido para ver como quedará el xml.

        // Insertamos los objetos en el xml.
        xStream.toXML(list, new FileOutputStream(fXML));

        System.out.println("El fichero xml ha sido creado.");

    }


    // Método que muestra el contenido del archivo xml.
    public static void XMLAObj(XStream xstream, File fXML) throws FileNotFoundException {
        // Leemos toda la colección.
        ClientList clients = (ClientList) xstream.fromXML(fXML);
        // Indicamos el número de clientes que están en el xml.
        System.out.println("- Número de clientes: "+clients.getList().size());

        // Creamos una lista donde se guardarán todos los elementos del xml.
        // Esto sirve para el for-each que viene después.
        List<Cliente> listaC = new ArrayList<>();
        listaC = (List<Cliente>) clients.getList();

        // Con un for-each sacamos los datos de todos los clientes del xml.
        for(Cliente c : listaC){
            System.out.println(c.toString()); // La clase tiene un método toString() que muestra todos los datos.
        }

        System.out.println("- FIN DEL FICHERO.");

    }


}