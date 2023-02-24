package Herencia_futbol;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    // constructor, getter y setter
    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega un Partido (Clase Futbolista)");
    }

    public void entrevista() {
        System.out.println("Da una Entrevista");
    }
}
