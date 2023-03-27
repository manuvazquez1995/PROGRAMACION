package Mascotas;
import java.time.LocalDateTime;

public class HistorialRevisiones {

    private boolean repetida;
    private String fecha;

    private String vacuna;


    public HistorialRevisiones(boolean repetida, String fecha, String vacuna) {
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

    public String  getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }


}