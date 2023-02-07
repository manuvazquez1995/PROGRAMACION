public class alumno {

    // Atributos
    private String nombre;
    private int nota;

    // Constructor parametrizado.
    public alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters & setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}