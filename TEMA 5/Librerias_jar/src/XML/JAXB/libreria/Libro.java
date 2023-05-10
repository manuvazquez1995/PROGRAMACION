package XML.JAXB.libreria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType; 

@XmlType(propOrder = {"autor", "nombre", "editorial", "isbn"})

@XmlRootElement(name = "libro")
@XmlAccessorType (XmlAccessType.FIELD)

public class Libro { 
    private String nombre;
    private String autor;
    private String editorial;
    private String isbn;
    public Libro(String nombre, String autor, String editorial, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}   
	public Libro() {}
    public String getNombre() { return nombre; }
    public String getAutor() { return autor;  }
    public String getEditorial() {return editorial; }
    public String getIsbn() { return isbn;}
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setEditorial(String editorial) { this.editorial = editorial;  }
    public void setIsbn(String isbn) {  this.isbn = isbn;  }
}
