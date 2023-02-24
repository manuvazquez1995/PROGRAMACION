package Herencia_futbol;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    // constructor, getter y setter
    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, int idF) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idF;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }
}
