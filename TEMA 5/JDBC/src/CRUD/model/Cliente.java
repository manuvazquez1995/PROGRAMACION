/*
vamos a programar las operaciones CRUD utilizando el patrón de diseño DAO para la parte del acceso a los datos.

Primero empezamos creando el modelo que es la clase Cliente.java y que es la clase que va mapear los atributos de la tabla cliente en la base de datos ventas.
*/

package CRUD.model;
 
public class Cliente {
    private int id;

    private String dni;
    private String nombre;
    private String apellido;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.id+", "+this.nombre+", "+this.apellido+","+this.dni;
    }
}