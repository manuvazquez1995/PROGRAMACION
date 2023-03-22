import java.util.ArrayList;

public class Paciente {

    // Atributos.
    private String dniDuenho;
    private String nombreDuenho;
    private String nombreAnimal;
    private String razaAnimal;
    private String telefono;


    //ArrayList donde se almacena un historial de cada paciente.
    ArrayList<Historial> h = new ArrayList<>();


    // Constructor parametrizado.
    public Paciente(String dniDuenho, String nombreDuenho, String nombreAnimal, String razaAnimal, String telefono) {
        this.dniDuenho = dniDuenho;
        this.nombreDuenho = nombreDuenho;
        this.nombreAnimal = nombreAnimal;
        this.razaAnimal = razaAnimal;
        this.telefono = telefono;
    }


    // Getters y setters.
    public String getDniDuenho() {
        return dniDuenho;
    }

    public void setDniDuenho(String dniDuenho) {
        this.dniDuenho = dniDuenho;
    }

    public String getNombreDuenho() {
        return nombreDuenho;
    }

    public void setNombreDuenho(String nombreDuenho) {
        this.nombreDuenho = nombreDuenho;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Historial> getH() {
        return h;
    }

    public void setH(ArrayList<Historial> h) {
        this.h = h;
    }

}