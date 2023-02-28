package Mascotas;

public class Canario extends Ave{

    String color;
    boolean canta;

    public Canario(String nombre,
                int edad,
                String estado,
                String fechaNacimiento,
                String pico,
                boolean vuela,
                String color,
                boolean canta){
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }


    public void mostrar(){
        System.out.println("***** MASCOTA *****\n" +
                "- Nombre: "+this.getNombre()+"\n" +
                "- Edad: "+this.getEdad()+"\n" +
                "- Estado: "+this.getEdad()+"\n" +
                "- Fecha nacimiento: "+this.getFechaNacimiento()+"\n" +
                "- Pico: "+this.getPico()+"\n" +
                "- Puede volar: "+this.getVuela()+"\n" +
                "- Color: "+this.getColor()+"\n" +
                "- Puede cantar: "+this.getCanta());
    }


    public void habla(){
        System.out.println("Solo canta, no habla.");
    }


    public void volar(){
        if(!getVuela()){
            System.out.println("NO VUELA");
        }else{
            System.out.println("SI VUELA");
        }
    }


}