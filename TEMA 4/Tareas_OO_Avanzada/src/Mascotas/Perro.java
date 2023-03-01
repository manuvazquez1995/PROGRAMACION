package Mascotas;

public class Perro extends Mascota{

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas){
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }


    public void mostrar(){
        System.out.println("***** PERRO *****\n" +
                        "- Nombre: "+this.getNombre()+"\n" +
                        "- Edad: "+this.getEdad()+"\n" +
                        "- Estado: "+this.getEstado()+"\n" +
                        "- Fecha nacimiento: "+this.getFechaNacimiento()+"\n" +
                        "- Raza: "+this.getRaza()+"\n" +
                        "- Pulgas: "+this.getPulgas());
    }


    public void habla(){
        System.out.println("-Habla: GUAU GUAU");
    }



}