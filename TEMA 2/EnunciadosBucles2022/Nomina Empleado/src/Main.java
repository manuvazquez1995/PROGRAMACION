import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Leemos los datos y se los asignamos al nuevo usuario.
        System.out.println("*********** CREAR NÓMINA ***********");
        System.out.println("Introduce el nombre: ");
        String nombreEmpleado = reader.nextLine();
        System.out.println("Introduce el mes: ");
        String mesNomina = reader.nextLine();
        System.out.println("Introduce el sueldo base: ");
        float sueldoBase = reader.nextFloat();
        System.out.println("Introduce el Nº de horas extras trabajadas: ");
        byte horasExtras = reader.nextByte();
        System.out.println("Introduce el precio por hora trabajada: ");
        float precioHora = reader.nextFloat();
        reader.close();

        //Instanciamos la clase empleado para crear uno.
        empleado empleado1 = new empleado(nombreEmpleado, sueldoBase, horasExtras, precioHora, mesNomina);

        //Mostramos la factura.
        empleado1.informe();

    }

}