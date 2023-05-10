/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.JAXB.empresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author mrnov
 */
/*
@XmlRootElement(name = "empleado").  
Define que el elemento raíz del objeto Java se llamará empleado.

@XmlType(propOrder = { "dni", "nombre", "edad", "puesto" }). 
Define el orden de los elementos dentro de otro elemento. 

@XmlElement(name = "cargo"). 
Sirve para cambiar el nombre de un elemento en el documento XML. 
Por defecto el elemento aparece con el nombre del atributo de la clase Java 
pero podemos cambiarlo con esta etiqueta. 

En el ejemplo se cambia el nombre puesto por cargo. 
Se puede utilizar en los atributos tipo lista para indicar cómo se llamará cada elemento de la lista. 

@XmlElementWrapper(name = "ListaEmpleados"). Para crear un wrapper llamado empleados que englobe la estructura XML de los objetos Empleado.
*/

@XmlRootElement(name = "empleado")
@XmlAccessorType (XmlAccessType.FIELD)
//@XmlType(propOrder = { "dni", "nombre", "edad" })
@XmlType(propOrder = { "dni", "nombre", "edad", "puesto" })
public class Empleado {
     private String dni;
     private String nombre;
     private int edad;
     private String puesto;

     public String getDni() {
      return dni;
     }
     public void setDni(String dni) {
      this.dni = dni;
     }
     public String getNombre() {
      return nombre;
     }
     public void setNombre(String nombre) {
      this.nombre = nombre;
     }
     public int getEdad() {
      return edad;
     }
     public void setEdad(int edad) {
      this.edad = edad;
     }
     //@XmlElement(name = "puesto")
     //@XmlElement(name = "cargo")
     public String getPuesto() {
      return puesto;
     }
     public void setPuesto(String puesto) {
      this.puesto = puesto;
     }
}
