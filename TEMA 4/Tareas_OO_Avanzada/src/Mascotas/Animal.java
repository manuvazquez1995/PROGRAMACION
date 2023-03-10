package Mascotas;

public class Animal {

    private String nombre;
    private int edad;
    private String estado;
    private String fechaNacimiento;

    public Animal(){}

    public Animal(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public void mostrar(){
        System.out.println(
                "- Nombre: "+this.getNombre()+"\n" +
                "- Edad: "+this.getEdad()+"\n" +
                "- Estado: "+this.getEstado()+"\n" +
                "- Fecha nacimiento: "+this.getFechaNacimiento());
    };

    public void cumpleanhos(){
        System.out.println("- El animal estará de cumpleaños el: "+fechaNacimiento);
    }

    public void morir(){
        setEstado("Muerto");
    }

    public void habla(){};


}
