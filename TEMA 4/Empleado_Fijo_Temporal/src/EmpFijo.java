import java.util.Date;

public class EmpFijo extends Empleado {

    private int salarioBase;
    private float irpf;
    private int trienios;


    // Constructor parametrizado, junto con los parámetros de la clase padre.
    public EmpFijo(String nss, String nombre, Date fechaNacimiento, char sexo, int salarioBase,  int trienios) {
        super(nss, nombre, fechaNacimiento, sexo);
        this.salarioBase = salarioBase;
        this.trienios = trienios;
    }

    // Getters y setters.
    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public int getTrienios() {
        return trienios;
    }

    public void setTrienios(int trienios) {
        this.trienios = trienios;
    }


    // Método sueldo().
    @Override
    public float sueldo(){
        float sueldo;
        sueldo = (float) salarioBase + (30 * trienios) * (1-irpf);
        return sueldo;
    }



}