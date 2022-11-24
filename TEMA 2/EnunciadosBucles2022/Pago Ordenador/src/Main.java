import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Pedimos los datos guardándolos en variables.
        //Datos de entrada.
        System.out.println("*********** PAGO ORDENADOR ***********");
        System.out.println("- Marca del ordenador: ");
        String marca = reader.nextLine();
        System.out.println("Precio inicial: ");
        double precioInical = reader.nextDouble();
        reader.nextLine();
        System.out.println("- Forma de pago (seleccione número de opción): \n" +
                "      (1) Al contado." +
                "      (2) En 6 meses (financiación)" +
                "      (3) En 12 meses (financiación)");
        /*Creamos variable op para la opción de pago y nos aseguramos que el usuario
        introduce una opción válida.*/
        /*TODO: Funciona pero si introducimos una opción correcta
           por primera vez falla pero si lo volvemos introducir funciona */
        byte op;// = reader.nextByte();
        do {
            System.out.println("Opción no válida. Inténtelo de nuevo:");
            op = reader.nextByte();
        }while(op<1 | op>3);
        reader.close();

        //Creamos el objeto ordenador1 con los datos de entrada.
        ordenador ordenador1 = new ordenador(marca, precioInical, op);
        ordenador1.calcular(); //Llamamos al método para hacer los cálculos.

        //Mostramos los datos por pantalla con getters y utilizando los métodos de (ordenador).
        System.out.println("******************************************\n" +
                "**********  PRESUPUESTO FINAL   **********\n" +
                "******************************************\n" +
                "- Marca ordenador: "+ordenador1.getMarcaPc()+"\n" +
                "- Precio inicial: "+ordenador1.getPrecioInicial());
        switch (ordenador1.getFormaPago()){
            case 1:
                System.out.println("- Precio total: "+ordenador1.getPrecioFinal());
                break;
            case 2:
                System.out.println("- Precio total: "+ordenador1.getPrecioFinal()+" (+8% intereses)\n" +
                        "     - Meses:" +ordenador1.getMeses()+"\n" +
                        "     - Mensualidad: "+ordenador1.getMensualidad());
                break;
            case 3:
                System.out.println("-Precio total: "+ordenador1.getPrecioFinal()+" (+15% intereses)\n" +
                        "     - Meses:" +ordenador1.getMeses()+"\n" +
                        "     - Mensualidad: "+ordenador1.getMensualidad());
                break;
        }


    }


}