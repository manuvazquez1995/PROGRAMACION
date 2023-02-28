package Mascotas;

public abstract class Ave extends Mascota{

    private String pico;
    private boolean vuela;

    public Ave(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela){
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }


    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }


    abstract void volar();

}