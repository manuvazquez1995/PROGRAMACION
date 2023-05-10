/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.JAXB.empresa;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
/*
@XmlRootElement(name = "empresa").  
Define que el elemento raíz del objeto Java se llamará empleado.
*/
@XmlRootElement(name = "empresa")
@XmlAccessorType (XmlAccessType.FIELD)
public class Empresa {
     private String cif;
     private String nombre;

     @XmlElementWrapper(name = "ListaEmpleados")
     @XmlElement(name = "empleado")
     private ArrayList<Empleado> empleados = null;

     public String getCif() {
      return cif;
     }

     public void setCif(String cif) {
      this.cif = cif;
     }

     public String getNombre() {
      return nombre;
     }

     public void setNombre(String nombre) {
      this.nombre = nombre;
     }

     public ArrayList<Empleado> getEmpleados() {
      return empleados;
     }

     public void setEmpleados(ArrayList<Empleado> empleados) {
      this.empleados = empleados;
     }
}