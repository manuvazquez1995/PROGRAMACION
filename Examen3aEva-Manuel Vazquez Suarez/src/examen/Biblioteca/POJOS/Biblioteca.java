/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Biblioteca.POJOS;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
public class Biblioteca{
    String cif;
    String nombre;
    String tf;
    ArrayList <Libros> L;

    public Biblioteca() {
    }

    public Biblioteca(String cif, String nombre, String tf, ArrayList<Libros> L) {
        this.cif = cif;
        this.nombre = nombre;
        this.tf = tf;
        this.L = L;
    }

    
    
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    public ArrayList<Libros> getL() {
        return L;
    }

    public void setL(ArrayList<Libros> L) {
        this.L = L;
    }

    public String toString(){
        return "- CIF:"+getCif()+" Nombre: "+getNombre()+" Teléfono: "+getTf();
    }
    
    
}
