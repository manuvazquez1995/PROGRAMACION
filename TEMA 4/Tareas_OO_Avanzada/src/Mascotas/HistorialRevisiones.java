package Mascotas;
import java.time.LocalDateTime;

public class HistorialRevisiones {

    private boolean repetida;
    private String fecha;

    private boolean vacuna;


    public HistorialRevisiones(boolean repetida, String fecha, boolean vacuna) {
        this.repetida = repetida;
        this.fecha = fecha;
        this.vacuna = vacuna;
    }

    public boolean isRepetida() {
        return repetida;
    }

    public void setRepetida(boolean repetida) {
        this.repetida = repetida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }


}