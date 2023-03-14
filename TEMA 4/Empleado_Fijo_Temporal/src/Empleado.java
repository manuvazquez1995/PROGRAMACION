import java.util.Date;

public abstract class Empleado {

    private String nss;
    private String nombre;
    private Date fechaNacimiento;
    private char sexo;


    // Constructor por defecto.
    public Empleado(){}


    // Constructor parametrizado.
    public Empleado(String nss, String nombre, Date fechaNacimiento, char sexo) {
        this.nss = nss;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }


    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    // Método abstracto sueldo.
    public abstract float sueldo();


}