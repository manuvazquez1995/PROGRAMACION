public class Ventas {

    private String fechaVenta;
    private double importeVenta;


    public Ventas(){

    }


    public Ventas(String fechaVenta, double importeVenta) {
        this.fechaVenta = fechaVenta;
        this.importeVenta = importeVenta;
    }


    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }

}