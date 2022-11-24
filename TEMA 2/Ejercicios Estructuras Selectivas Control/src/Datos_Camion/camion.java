package Datos_Camion;
import lectorDatos.reader;

/*Leer datos por teclado acerca de camión: el propietario,
la matricula, los litros_iniciales_combustible,
estado del cuentakilómetros antes y después del viaje y el nombre de la compañía.
Calcular el consumo total que será (litros a los 100Km / kilómetros recorridos).
Añadir la información que consideréis imprescindible.
Mostrar todos los valores por pantalla.*/

//import java.util.*;

public class camion {

    private static String propietario;
    private static String matricula;
    private static String nombreCompanhia;
    private static double litrosConsumidosComustible;
    private static double kmAntes;
    private static double kmDespues;


    public static void main(String[] args) {
        lecturaDatosCamion();
        consumoTotal();
        mostrarDatos();
    }

    // Método para leer los datos camión.
    public static void lecturaDatosCamion(){
        //Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el nombre del propietario: ");
        propietario = reader.leerString();
        System.out.println("Intoduzca la matrícula: ");
        matricula = reader.leerString();
        System.out.println("Introduce el nombre de la compañia: ");
        nombreCompanhia = reader.leerString();
        System.out.println("Introduce los litros de comustible consumidos: ");
        litrosConsumidosComustible = reader.leerDouble();
        System.out.println("¿Cuántos km tenía ANTES del viaje?: ");
        kmAntes = reader.leerDouble();
        System.out.println("¿Cuántos km tenía DESPUÉS del viaje?: ");
        kmDespues = reader.leerDouble();
        if(kmDespues < kmAntes){
            System.out.println("ATENCIÓN, los kmDespues no puede ser inferior a kmAntes.\n" +
                    "Vuelva a introducir kmDespues: ");
            kmDespues = reader.leerDouble();
        }
        reader.close(); // Método que cierra el lector de datos.
    }


    //Método para mostrar los datos de salida.
    public static void mostrarDatos() {
        // Aque llamamos al metodo para calcular el consumo total.
        double consumoTotal = consumoTotal();

        System.out.println("*********************************************\n" +
                "DATOS DEL VEHÍCULO\n" +
                "*********************************************\n" +
                "PROPIETARIO: " + propietario + "\n" +
                "MATRICULA: " + matricula + "\n" +
                "NOMBRE COMP.: " + nombreCompanhia + "\n" +
                "LITROS CONSUMIDOS: " + litrosConsumidosComustible + "\n" +
                "KM ANTES: " + kmAntes + "\n" +
                "KM DESPUÉS: " + kmDespues + "\n" +
                "----------------------------------------------\n" +
                "CONSUMO TOTAL: " + consumoTotal);
    }

    // Método para calcular el consumo medio.
    public static double consumoTotal(){
        return litrosConsumidosComustible * 100 / (kmDespues - kmAntes);
    }


}
