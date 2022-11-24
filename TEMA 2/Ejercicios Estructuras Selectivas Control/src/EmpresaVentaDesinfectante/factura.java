package EmpresaVentaDesinfectante;
import java.time.*;

public class factura {

    private String idFactura;
    private final String idArticulo;
    private final double cantidadLitros;
    private final double precioLitro;
    private double totalFactura;

    //Constructor con parámetros.
    public factura(int nFactura, String idArticulo, double cantidadLitros, double precioLitro){
        /*Crear un idFactura aleatorio en función de la fecha y la hora.
        Esto lo hace sin necesidad de tener que pasarlo por parámetro en el constructor.*/
        idFactura = nFactura+"/"+ LocalDate.now() +LocalTime.now();
        this.idArticulo=idArticulo;
        this.cantidadLitros=cantidadLitros;
        this.precioLitro=precioLitro;
    }

    //Getters y setters.
    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

    public double getPrecioLitro() {
        return precioLitro;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    //Método para calcular el total de cada factura.
    public void TotalFactura(){
        totalFactura = cantidadLitros * precioLitro;
    }

    //Método que muestra las facturas que superan los 600 €.
    public void supSeisc(){
        if(totalFactura>600){
            System.out.println("*SUPERIOR A 600€* -> "+idFactura+" ("+totalFactura+")");
        }
    }


}
