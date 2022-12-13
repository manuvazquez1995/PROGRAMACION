package NumAleatoriosGen;

public class numAleatoriosGen_diaSemana {


    public static void main(String[] args){
        /*
          Generar un día de la semana de forma aleatoria En efecto,
          primero generamos un número entre 1 y 7 ambos inclusive
          y luego hacemos corresponder un día de la semana a cada uno de los números.
        */

        // Generamos el número del día entre 1 y 7.
        int nDia = (int) (Math.random()*(7-1)+1);

        // Mostramos el número del dia con el día de la semana que correspondería.
        switch (nDia) {
            case 1 -> System.out.println(nDia + " - LUNES");
            case 2 -> System.out.println(nDia + " - MARTES");
            case 3 -> System.out.println(nDia + " - MIÉRCOLES");
            case 4 -> System.out.println(nDia + " - JUEVES");
            case 5 -> System.out.println(nDia + " - VIERNES");
            case 6 -> System.out.println(nDia + " - SÁBADO");
            case 7 -> System.out.println(nDia + " - DOMINGO");
        }

    }

}
