package XML.JAXB.libreria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
 
//Esto significa que la clases "Libreria.java" es el elemento raiz
//@XmlRootElement(namespace = "ejemplo1.xml")
//@XmlRootElement(namespace = "")
//@XmlRootElement(name = "libreria")

@XmlRootElement(name = "Biblioteca")
@XmlAccessorType (XmlAccessType.FIELD)

public class Libreria {
    @XmlElement(name = "Datoslibro")
    private ArrayList<Libro> Libreria = null;
    	
    private String nombre;
    private String lugar;
   
    public Libreria(ArrayList<Libro> listaLibro, String nombre, String lugar) {
		super();
		this.Libreria = listaLibro;
		this.nombre = nombre;
		this.lugar = lugar;
	}
    public Libreria(){}
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setLugar(String lugar) { this.lugar = lugar;    }
    public String getNombre() {return nombre;    }
    public String getLugar() { return lugar;    }

    //Wrapper, envoltura alrededor la representaci�n XML
   // @XmlElementWrapper(name = "Libreria") // 
    
    public ArrayList<Libro> getListaLibro() {
        return Libreria;    }
 
    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.Libreria = listaLibro;    }
 }
