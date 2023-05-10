/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.JAXB.empresa;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
public class JaxbTestEmpresa {
 private final static String XML_EMPLEADOS = "./ficheros/info-empleados.xml";

 public static void main(String[] args) throws JAXBException, IOException {

  // Primero rellenamos los objetos Java y generamos un XML
  Empresa empresa = new Empresa();
  empresa.setEmpleados(new ArrayList<>());

  Empleado empleado1 = new Empleado();
  empleado1.setDni("12345678C");
  empleado1.setNombre("Carlos Pérez Ruíz");
  empleado1.setEdad(29);
  empleado1.setPuesto("auxiliar");

  Empleado empleado2 = new Empleado();
  empleado2.setDni("87654321C");
  empleado2.setNombre("Claudia Ortiz Zaldo");
  empleado2.setEdad(31);
  empleado2.setPuesto("operario");

  empresa.setCif("A58818501");
  empresa.setNombre("TECNOMUR S.L.");
  
  empresa.getEmpleados().add(empleado1);
  empresa.getEmpleados().add(empleado2);

  // Creamos el contexto e instanciamos el marshaller
  JAXBContext context = JAXBContext.newInstance(Empresa.class);
  Marshaller m = context.createMarshaller();
  m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
  m.marshal(empresa, System.out);

  //escritura en fichero
  //OPCION1
  m.marshal(empresa, new File("ficheros\\emplea2.xml"));
  
  //OPCION2
  Writer w = null;
  try {
    w = new FileWriter(XML_EMPLEADOS);  //Más práctico esta opción.
    m.marshal(empresa, w);
  } finally {
    try {
     w.close();
    } catch (Exception e) {
    }
  }
  
  leerXML(context);
 }
 
 public static void leerXML(JAXBContext context) throws FileNotFoundException, JAXBException{
    // Ahora leemos el XML e instanciamos las clases Java
    System.out.println("Salida desde el fichero XML: ");
    Unmarshaller um = context.createUnmarshaller();
    Empresa empresa2 = (Empresa) um.unmarshal(new FileReader(XML_EMPLEADOS));

    for (int i = 0; i < empresa2.getEmpleados().toArray().length; i++) {
        System.out.println("Empleado " + (i + 1) + ": "
          + empresa2.getEmpleados().get(i).getNombre() + " con DNI "
          + empresa2.getEmpleados().get(i).getDni() + " y "
          + empresa2.getEmpleados().get(i).getEdad() + " años");

    }

 }
}
