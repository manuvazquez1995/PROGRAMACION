package Herencia_futbol;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;

    // constructor, getter y setter
    public Masajista(){
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String tit, int anhosExp) {
        super(id, nombre, apellidos, edad);
        this.aniosExperiencia = anhosExp;
        this.titulacion = tit;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    public void darMasaje() {
        System.out.println("Da un Masaje");
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
