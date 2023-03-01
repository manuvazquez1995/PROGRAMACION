package Mascotas;

public class Gato extends Mascota{

    private String color;
    private boolean peloLargo;


    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo){
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }


    public void mostrar(){
        System.out.println("***** GATO *****\n" +
                "- Nombre: "+this.getNombre()+"\n" +
                "- Edad: "+this.getEdad()+"\n" +
                "- Estado: "+this.getEdad()+"\n" +
                "- Fecha nacimiento: "+this.getFechaNacimiento()+"\n" +
                "- Color: "+this.getColor()+"\n" +
                "- Pelo largo: "+this.getPeloLargo());
    }


    public void habla(){
        System.out.println("MIAU MIAU");
    }


}