import java.util.*;

public class Main {

    public static void main(String[] args) {

        alumno alumno1;
        alumno1 = new alumno();

        //alumno1.nivelAcademico("Universitario");
        String a = "ESO";
        alumno1.setNivelAcademico(a);
        System.out.println("Nivel academico alumno1: "+ alumno1.getNivelAcademico());

        alumno1.resolverExamen("Examen de Programación");

        //BIEN
        alumno alumno2 = new alumno("Manuel","78787878Q","Ciclo superior");
        alumno2.mostrarDatos();





    }

}