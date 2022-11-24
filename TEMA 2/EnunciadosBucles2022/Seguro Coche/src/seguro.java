import java.util.*;

public class seguro {

    private String nombreAsegurado;
    private int edadAsegurado;
    private int anhosCarnet;
    private double precioCoche;
    //La declaramos 'final' porque es un valor fijo(constante).
    private final int tarifaBase = 300; //TODO: Esto es una constante.
    private double precioTotal;

    //Constructor para guardar los atributos del seguro al crearlo.
    public seguro(String nombreAsegurado, int edadAsegurado, int anhosCarnet, double precioCoche) {
        this.nombreAsegurado = nombreAsegurado;
        this.edadAsegurado = edadAsegurado;
        this.anhosCarnet = anhosCarnet;
        this.precioCoche = precioCoche;
    }

    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public int getEdadAsegurado() {
        return edadAsegurado;
    }

    public void setEdadAsegurado(int edadAsegurado) {
        this.edadAsegurado = edadAsegurado;
    }

    public int getAnhosCarnet() {
        return anhosCarnet;
    }

    public void setAnhosCarnet(int anhosCarnet) {
        this.anhosCarnet = anhosCarnet;
    }

    public double getPrecioCoche() {
        return precioCoche;
    }

    public void setPrecioCoche(double precioCoche) {
        this.precioCoche = precioCoche;
    }

    //Método para comprobar si el asegurado tiene que pagar suplemento y calcularlo.
    public int comprobarSuplemento(){
        if(edadAsegurado < 28 && anhosCarnet < 5){
            return 1;   //Devuelve 3 si paga suplemento de edad más el de años con carnet.
        } else if (anhosCarnet < 5) {
            return 2;   //Devuelve 2 si solo paga suplemento por los años de carnet.
        }else if (edadAsegurado<28){
            return 3;   // Devuelve 1 si solo paga suplemento por la edad.
        }
        return 0;   // Si no cumple las condiciones anteriores, es decir no paga suplementos.
    }

    //Método para calcular aumento de precio si el vehículo tiene un precio superior de 15.000 €.
    public double aumentoPorPrecioCoche(){
        if(precioCoche > 15000){
            return tarifaBase * 0.12; //Si cumple la condición, solo nos devuelve el aumento.
        }
        return 0; // Devolvemos 0 si el coche no supera el precio requerido.
    }

    //Método para calcular el precio total si hay que calcularlo con suplementos o no.
    public double precioTotal(){
        if(comprobarSuplemento()==1){
            precioTotal = tarifaBase + 100;
        } else if (comprobarSuplemento()==2) {
            precioTotal = tarifaBase + 100;
        } else if (comprobarSuplemento()==3) {
            precioTotal = tarifaBase + 100;
        } else if (comprobarSuplemento()==0) {
            precioTotal = tarifaBase;
        }
        //Añadir al precio total el aumento por el precio del coche si este lo require (se hace en el método indicado)
        precioTotal = precioTotal + aumentoPorPrecioCoche();
        return precioTotal;
    }


}
