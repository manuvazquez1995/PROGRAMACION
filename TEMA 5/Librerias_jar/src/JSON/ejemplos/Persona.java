/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON.ejemplos;

import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
public class Persona {
 
    private String nombre;
    private String apellidos;
    private int edad;
    
    private ArrayList<Asignatura> asignaturas;
 
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.asignaturas = new ArrayList();
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellidos() {
        return apellidos;
    }
 
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
 
    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
 
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
 
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad="
                     + edad + ", asignaturas=" + asignaturas + '}';
    }
}
