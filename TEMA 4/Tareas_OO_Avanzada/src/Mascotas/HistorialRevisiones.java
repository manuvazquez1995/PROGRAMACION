package Mascotas;
import java.time.LocalDateTime;

public class HistorialRevisiones {

    private boolean repetida;
    private LocalDateTime fecha;

    private boolean vacuna;


    public HistorialRevisiones(boolean repetida, LocalDateTime fecha, boolean vacuna) {
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }


}