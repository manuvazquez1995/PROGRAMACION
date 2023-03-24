public class EmpFijo extends Empleado {

    private int salarioBase;
    private float irpf = 21;
    private int trienios;


    // Constructor parametrizado, junto con los parámetros de la clase padre.
    public EmpFijo(String nss, String nombre, String fechaNacimiento, char sexo, int salarioBase,  int trienios) {
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
        float sueldoBruto = (float) salarioBase + (30 * trienios);
        float imp = sueldoBruto * (irpf/100);
        return sueldoBruto - imp;
    }


}