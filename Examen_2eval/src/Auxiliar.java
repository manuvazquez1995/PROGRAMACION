public class Auxiliar extends Persona{

    // Constructor que sirve para crear Auxiliares.
    public Auxiliar(String dni, String nombre, String telefono, float sueldoBase, float retencion) {
        super(dni, nombre, telefono, sueldoBase, retencion);
    }


    // Método calculoSalario.
    public float calculoSalario(){
        return (getSueldoBase()) - (getSueldoBase()*getRetencion());
    }

}