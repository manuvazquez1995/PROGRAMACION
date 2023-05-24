/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Biblioteca.POJOS;

/**
 *
 * @author mrnov
 */
public class LibrosTexto extends Libros{
    private String especialidad;

    public LibrosTexto() {
    }

    public LibrosTexto(String especialidad) {
        this.especialidad = especialidad;
    }
     
    public LibrosTexto(String especialidad, String ref, String titulo, float precio, boolean estado) {
        super(ref, titulo, precio, estado);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
