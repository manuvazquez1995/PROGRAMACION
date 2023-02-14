package Colecciones_ArrayList.Ejer_2;

class alumno {

    private String nombre;
    private final String asignatura1 = "Matemáticas";
    private final String Asignatura2 = "Informática";
    float nota1;
    float nota2;

    public alumno(){

    }

    public alumno(String nombre, float nota1, float nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura1() {
        return asignatura1;
    }

    public String getAsignatura2() {
        return Asignatura2;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

}