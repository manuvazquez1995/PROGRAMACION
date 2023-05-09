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
* Lectura de un fichero XML a objetos
*/

import com.thoughtworks.xstream.XStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeerFicheroXML {
    public static void main(final String[] args) throws FileNotFoundException {
        //crear una instancia de la clase XStream
        XStream xstream = new XStream();
        
        //Para que no de Errores de acceso de Tipos
        xstream.allowTypes(new Class[] {Alumno.class,ListaAlumnos.class});
        
        //cambiar de nombre a las etiquetas XML
        xstream.alias("ListadoAlumnos", ListaAlumnos.class);
        xstream.alias("DatosAlumno", Alumno.class);
        
        //quitar etiqueta lista (atributo de la clase ListaAlumnos
        xstream.addImplicitCollection(ListaAlumnos.class, "lista");
        ListaAlumnos listadoTodas = (ListaAlumnos) xstream.fromXML(new FileInputStream("ficheros\\Alumnos_list.xml"));
        System.out.println("Número de alumnos: "+listadoTodas.getListaAlumno().size());
        
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();
        listaAlumnos = (List<Alumno>) listadoTodas.getListaAlumno();
        
        Iterator iterator = listaAlumnos.listIterator(); //recorrer los elementos
        while(iterator.hasNext()){
            Alumno alu = (Alumno) iterator.next(); //obtenemos el elemento
            System.out.println("DNI: "+alu.getDni() +"\tNombre: "+alu.getNombre() +"\tTeléfono: "+alu.getTelefono());
        }// fin del while
        System.out.println("\n\nFin del listado... ");
    }// fin main
}//fin clase
