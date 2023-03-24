import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmpTemporal extends Empleado {

    private String fechaInicio;
    private String fechaFin;
    private Double precioDia;
    private int importeVentas;

    private ArrayList<Ventas> ventas = new ArrayList<>();


    // Constructor parametrizado que se trae también los parámetros del constructor padre.
    public EmpTemporal(String nss, String nombre, String fechaNacimiento, char sexo, String fechaInicio, String fechaFin, Double precioDia) {
        super(nss, nombre, fechaNacimiento, sexo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
    }


    // Getters y setters.
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
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

    public int getImporteVentas() {
        return importeVentas;
    }

    public void setImporteVentas(int importeVentas) {
        this.importeVentas = importeVentas;
    }

    public void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }

    @Override
    public float sueldo() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date f1 = sdf.parse(fechaInicio);
        Date f2 = sdf.parse(fechaFin);

        float dias = (f2.getTime() - f1.getTime())/(1000*60*60*24);

        float pDia = precioDia.floatValue();

        return dias * pDia;
    }


}