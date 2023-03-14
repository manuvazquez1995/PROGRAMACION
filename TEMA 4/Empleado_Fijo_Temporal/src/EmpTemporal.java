import java.util.ArrayList;
import java.util.Date;

public class EmpTemporal extends Empleado {

    private Date fechaInicio;
    private Date fechaFin;
    private Double precioDia;

    private ArrayList<Ventas> ventas;


    // Constructor parametrizado que se trae también los parámetros del constructor padre.
    public EmpTemporal(String nss, String nombre, Date fechaNacimiento, char sexo, Date fechaInicio, Date fechaFin, Double precioDia, ArrayList<Ventas> ventas) {
        super(nss, nombre, fechaNacimiento, sexo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.ventas = ventas;
    }


    // Getters y setters.
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(Double precioDia) {
        this.precioDia = precioDia;
    }

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }

    @Override
    public float sueldo(){
        return 2000;   //No está completo, ya que hay que calcular los días que trabaja y multiplicarlo por el precio día.
    }


}