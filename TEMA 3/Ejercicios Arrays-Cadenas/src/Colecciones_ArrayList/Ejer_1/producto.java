package Colecciones_ArrayList.Ejer_1;

public class producto {

    private String nombre;
    private float precioVigo;
    private float precioSantiago;
    private float precioMadrid;

    public producto(){

    }

    public producto(String nombre, float precioVigo, float precioSantiago, float precioMadrid) {
        this.nombre = nombre;
        this.precioVigo = precioVigo;
        this.precioSantiago = precioSantiago;
        this.precioMadrid = precioMadrid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioVigo() {
        return precioVigo;
    }

    public void setPrecioVigo(float precioVigo) {
        this.precioVigo = precioVigo;
    }

    public float getPrecioSantiago() {
        return precioSantiago;
    }

    public void setPrecioSantiago(float precioSantiago) {
        this.precioSantiago = precioSantiago;
    }

    public float getPrecioMadrid() {
        return precioMadrid;
    }

    public void setPrecioMadrid(float precioMadrid) {
        this.precioMadrid = precioMadrid;
    }

}