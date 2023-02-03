package Arrays_Objetos.Ejer_Obj_4;

public class coche {

    private String marca;
    private String modelo;
    private double precio_base;
    private boolean aire_acondicionado;
    private boolean cierre_central;
    private boolean pintura_metalizada;
    private String tipo_motor;

    public coche(String marca,
                 String modelo,
                 double precio_base,
                 boolean aire_acondicionado,
                 boolean cierre_central,
                 boolean pintura_metalizada,
                 String tipo_motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio_base = precio_base;
        this.aire_acondicionado = aire_acondicionado;
        this.cierre_central = cierre_central;
        this.pintura_metalizada = pintura_metalizada;
        this.tipo_motor = tipo_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public boolean getAire_acondicionado() {
        return aire_acondicionado;
    }

    public void setAire_acondicionado(boolean aire_acondicionado) {
        this.aire_acondicionado = aire_acondicionado;
    }

    public boolean getCierre_central() {
        return cierre_central;
    }

    public void setCierre_central(boolean cierre_central) {
        this.cierre_central = cierre_central;
    }

    public boolean getPintura_metalizada() {
        return pintura_metalizada;
    }

    public void setPintura_metalizada(boolean pintura_metalizada) {
        this.pintura_metalizada = pintura_metalizada;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

}