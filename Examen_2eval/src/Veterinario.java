import java.util.ArrayList;

public class Veterinario extends Persona{

    // Atributos
    private int trienios;

    // ArrayList donde se almacenan los pacientes de cada veterinario.
    ArrayList<Paciente> p = new ArrayList<>();


    // Constructor parametrizado.
    public Veterinario(String dni, String nombre, String telefono, float sueldoBase, float retencion, int trienios) {
        super(dni, nombre, telefono, sueldoBase, retencion);
        this.trienios = trienios;
    }

    //Getters y setters.
    public int getTrienios() {
        return trienios;
    }

    public void setTrienios(int trienios) {
        this.trienios = trienios;
    }

    public ArrayList<Paciente> getP() {
        return p;
    }

    public void setP(ArrayList<Paciente> p) {
        this.p = p;
    }


    // Método calculaSalario.
    public float calculoSalario(){
        return (getSueldoBase()+trienios)-((getSueldoBase()+trienios)*getRetencion());
    }


}