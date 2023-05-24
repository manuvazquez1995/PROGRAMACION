/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Biblioteca.POJOS;

import java.io.Serializable;

/**
 *
 * @author mrnov
 */
public abstract class Libros{
    private String ref;
    private String titulo;
    private float precio;
    private boolean estado;

    public Libros() {
    }

    public Libros(String ref, String titulo, float precio, boolean estado) {
        this.ref = ref;
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
    }
 
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
}
