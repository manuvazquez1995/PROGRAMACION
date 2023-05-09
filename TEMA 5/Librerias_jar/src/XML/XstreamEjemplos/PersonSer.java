/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.XstreamEjemplos;

/*
XStream es una interesante y simple libreria para serializar objetos a XML y viceversa.

Caracteristicas de XStream
==========================
Fácil de usar. Cuenta una fachada de alto nivel que simplifica los casos más comunes de uso.

No requiere homologaciones “mappings”. La mayoría de los objetos se puede serilizar sin necesidad de crear archivos de homologación o “mapping”.

Rendimiento. Velocidad y bajo consumo de memoria son parte esencial del diseño, lo que hace que XStream sea adecuada sistemas con grandes objetos o alta demanda de envío de mensajes.

XML Limpio. XStream usa “reflection” y crea archivos XML facilmente entendibles por humanos y más compactos que usando la serialización nativa de Java.

No requiere modificar los objetos. Se serializan los campos internos, incluyendo privados y finales. Las clases internas y no publicas son soportadas. No se requiere que las clases tengan un constructor por defecto (sin parametros).

Soporte completo para objetos complejos. Las referencias duplicadas (duplicate references) encontradas en el objeto se mantienen. Soporta referencias duplicadas (circular references).

Integración con otras API de XML. Implementado un interfaz, Xstream puede serializar directamente hacia/desde cualquier estructura de arbol (tree structure) no sólo XML.

Estratégias de conversión personalizables. Las estrategias de conversión se pueden registrar permitiendo personalizar como los tipos son representados en XML.

Mensajes de error. Cuando una excepción, por XML mal formado, es encontrada se provee un diagnostico detallado para ayudar a encontrar y solucionar el problema.

Formato se salida alterno. El diseño modular permite otros formatos de salida. Xstream tiene actualmente soporte para JSON.

*/

import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mrnov
 */
public class PersonSer {
    public static void main (String args []) throws FileNotFoundException{
        File fXML = new File("ficheros\\PersonaPerson.xml");
        XStream xstream = new XStream();
        
        //Para que no de Errores de acceso de Tipos
        //xstream.allowTypes(new Class[] {Person.class});
        xstream.allowTypes(new Class[] {Person.class,PeopleList.class});
        
        //[1] alias opcionales
        xstream.alias("People", PeopleList.class);
        xstream.alias("Person", Person.class);
        xstream.aliasAttribute(Person.class,"phone", "Phone");
        xstream.aliasAttribute(Person.class,"fax", "Fax");
        
        xstream.aliasAttribute(Person.class,"dni", "DNI");
       
        //quitar etiqueta lista (atributo de la clase PeopleList)
        xstream.addImplicitCollection(PeopleList.class, "lista");

        Person joe = new Person("Joe", "Walnes");
        joe.setPhone(new PhoneNumber(123, "1234-456"));
        joe.setFax(new PhoneNumber(123, "9999-999"));
        joe.setDNI("33999999");
        
        Person max = new Person("Max", "Smith");
        max.setPhone(new PhoneNumber(123, "7777-456"));
        max.setFax(new PhoneNumber(123, "8888-999"));
        
        PeopleList listaP = new PeopleList();
        listaP.add(joe);
        listaP.add(max);
        
        

        //Insertar los objetos en el XML
        //xstream.toXML(joe, new FileOutputStream("PersonaPerson.xml"));

        
        ObjAXML(xstream,listaP,fXML);
        
        XMLAObj(xstream,fXML);
    }
    
    public static void ObjAXML(XStream xstream,PeopleList l,File fXML) throws FileNotFoundException{      
        String xml = xstream.toXML(l);
        System.out.println(xml);
        
        //Insertar los objetos en el XML
        xstream.toXML(l, new FileOutputStream(fXML));
        
        System.out.println("Creado el fichero xml");
    }
    
    public static void XMLAObj(XStream xstream,File fXML) throws FileNotFoundException{
        //usamos la variable xml del ejemplo 2
        //Person newJoe = (Person)xstream.fromXML(new FileInputStream("PersonaPerson.xml"));
//        Person newJoe = (Person)xstream.fromXML(fXML);
//        
//        //Visualización del objeto Joe
//        System.out.println(newJoe.toString());

        //Leer toda la colección
 
        PeopleList listadoTodas = (PeopleList) xstream.fromXML(fXML);
        System.out.println("Número de alumnos: "+listadoTodas.getList().size());
        
        List<Person> listaP= new ArrayList<Person>();
        listaP = (List<Person>) listadoTodas.getList();
        
        Iterator iterator = listaP.listIterator(); //recorrer los elementos
        while(iterator.hasNext()){
            Person p = (Person) iterator.next(); //obtenemos el elemento
            System.out.println("Nombre: "+p.getFirstname() +"\tApellido: "+p.getLastname() +"\tTeléfono: "+p.getPhone().getNumber());
        }// fin del while
        System.out.println("\n\nFin del listado... ");
    }
}
