import java.io.Serializable;

public abstract class Animal implements Serializable {

    private String nombre;
    private int edad;


    public Animal(){}

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
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


    // Método abstracto que emplearán las subclases para mostrar como se expresan los animales.
    public abstract void expresar();

    // Método que devuelve el tipo de animal que es (Perro/Gato).
    public abstract String getTipo();


}