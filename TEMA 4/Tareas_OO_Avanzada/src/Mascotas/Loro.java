package Mascotas;

public class Loro extends Ave{

    String origen;
    boolean habla;

    public Loro(String nombre,
                int edad,
                String estado,
                String fechaNacimiento,
                String pico,
                boolean vuela,
                String origen,
                boolean habla){
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean getHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }


    public void mostrar(){
        System.out.println("***** LORO *****\n" +
                "- Nombre: "+this.getNombre()+"\n" +
                "- Edad: "+this.getEdad()+"\n" +
                "- Estado: "+this.getEdad()+"\n" +
                "- Fecha nacimiento: "+this.getFechaNacimiento()+"\n" +
                "- Pico: "+this.getPico()+"\n" +
                "- Puede volar: "+this.getVuela()+"\n" +
                "- Origen: "+this.getOrigen()+"\n" +
                "- Puede hablar: "+this.getHabla());
    }

    public void habla(){};


    public void saluda(){
        System.out.println("Si habla, también puede saludar.");
    }


    public void volar(){
        if(!getVuela()){
            System.out.println("- Vuela: no vuela");
        }else{
            System.out.println("- Vuela: si vuela");
        }
    }


}