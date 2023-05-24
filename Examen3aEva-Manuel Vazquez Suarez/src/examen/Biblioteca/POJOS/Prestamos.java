/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Biblioteca.POJOS;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDate;
/**
 *
 * @author mrnov
 */
public class Prestamos{
//    private Date fechaPrestamo;
//    private Date fechaDevolucion;
    
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Usuarios lector;

    public Prestamos() {
    }

    public Prestamos(LocalDate fechaPrestamo, LocalDate fechaDevolucion, String dniLector) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lector= new Usuarios();
        this.lector.setDniLector(dniLector);
    }

    
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getDniLector() {
        return lector.getDniLector();
    }

    public void setDniLector(String dniLector) {
        this.lector.setDniLector(dniLector);
    }
    
    
    
}
