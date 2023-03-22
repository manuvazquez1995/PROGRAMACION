public class Historial {

    // Atributos.
    private String fechaConsulta;
    private String tipoTrabajo;
    private int importe;
    private boolean consultaRealizada;


    // Constructor parametrizado.
    public Historial(String fechaConsulta, String tipoTrabajo, int importe, boolean consultaRealizada) {
        this.fechaConsulta = fechaConsulta;
        this.tipoTrabajo = tipoTrabajo;
        this.importe = importe;
        this.consultaRealizada = consultaRealizada;
    }


    // Getters y setters.
    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

}