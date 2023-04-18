package Listas_Pilas_Colas.Supermercado;
import java.text.DecimalFormat;

/**
 * @author mrnovoa
 */
public class Producto {

    private int cantidad;
    private double precio;

    /**
     * Constructor por defecto
     * @param cantidad
     * @param precio
     */
    public Producto(int cantidad, double precio){
        this.cantidad=cantidad;
        this.precio=precio;
    }

    /**
     * Devuelve la cantidad de productos
     * @return Cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Devuelve el precio
     * @return Precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve el precio final que tiene un producto
     * @return precio final
     */
    public double precioFinal(){

        //Formateamos el precio final por problemas de precision
        DecimalFormat df=new DecimalFormat("#,##");
        return Double.parseDouble(df.format(this.precio * this.cantidad));
    }

}