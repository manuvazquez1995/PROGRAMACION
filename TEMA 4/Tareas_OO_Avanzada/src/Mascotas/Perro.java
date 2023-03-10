package Mascotas;

import java.util.ArrayList;

public class Perro extends Animal{

    private String raza;
    private boolean pulgas;


    // ArrayList para las revisiones (clase revisiones.)
    private ArrayList<HistorialRevisiones> revisiones = new ArrayList<>();


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

    public ArrayList<HistorialRevisiones> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(ArrayList<HistorialRevisiones> revisiones) {
        this.revisiones = revisiones;
    }

    @Override
    public void mostrar(){
        System.out.println("***** PERRO *****\n" +
                        "- Nombre: "+this.getNombre()+"\n" +
                        "- Edad: "+this.getEdad()+"\n" +
                        "- Estado: "+this.getEstado()+"\n" +
                        "- Fecha nacimiento: "+this.getFechaNacimiento()+"\n" +
                        "- Raza: "+this.getRaza()+"\n" +
                        "- Pulgas: "+this.getPulgas());
        habla();
    }


    @Override
    public void habla(){
        System.out.println("-Habla: GUAU GUAU");
    }



}