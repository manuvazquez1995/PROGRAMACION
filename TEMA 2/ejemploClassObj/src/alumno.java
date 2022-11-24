public class alumno {

    public String nombre;
    public String dni;

    private String nivelAcademico;

    public alumno(){

    }

    public void mostrarDatos(){
        System.out.println("********DATOS DEL ALUMNO**********\n" +
                "-Nombre: "+nombre+"\n" +
                "-Dni: "+dni+"\n" +
                "Nivel academico: "+nivelAcademico);
    }

    public void resolverExamen(String enunciado){
        System.out.println("Está resolvieno el examen siguente: "+ enunciado);
    }

    public void matricularse(String modulo){
        System.out.println("Esta matriculado en el siguiente modulo: "+ modulo);
    }

    public alumno(String nombre, String dni, String nivelAcademico) {
        this.nombre = nombre;
        this.dni = dni;
        this.nivelAcademico = nivelAcademico;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }




}
