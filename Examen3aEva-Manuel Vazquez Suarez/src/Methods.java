import examen.Biblioteca.POJOS.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Methods {


    public static Biblioteca altaPrestamosOcio(Biblioteca biblioteca,
                                         LocalDate fechaPrestamo,
                                         String dni,
                                         String titulo){


            for(Libros l : biblioteca.getL()){
                if(l instanceof LibrosOcio){
                    if(l.getTitulo()==titulo){
                        if(l.isEstado()){
                            LocalDate fechaDevolucion = LocalDate.parse("2023-05-30");
                            Prestamos prestamo = new Prestamos(fechaPrestamo, fechaDevolucion, dni);
                            ArrayList<Prestamos> p = new ArrayList<>();
                            p.add(prestamo);
                            ((LibrosOcio) l).setP(p);
                            l.setEstado(false);
                            System.out.println("Préstamo hecho.");
                        }else{
                            System.out.println("El libro ya ha sido prestado.");
                        }
                        break;
                    }else{
                        System.out.println("EL LIBRO NO EXISTE.");
                    }
                }
            }
            return biblioteca;
    }




}