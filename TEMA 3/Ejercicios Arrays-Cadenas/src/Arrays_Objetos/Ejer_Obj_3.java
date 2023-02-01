package Arrays_Objetos;
import metodosReutilizables.*;
public class Ejer_Obj_3 {

    /*  TODO: PENDIENTE DE HACER.
        3. Array de objetos Contacto (como máximo 100). La clase Contacto tendrá los siguientes datos:
        nombre, array de teléfonos y array de correos.
        Introducir valores y permitir realizar la búsqueda de teléfonos o correos de un contacto determinado.
     */
    public static void main(String[] args) {

        //Creamos un array donde podremos guardar un máximo de 100 contactos.
        contacto[] contactos = new contacto[100];




    }

}



//CLASE CONTACTO.
class contacto{

    private String nombre;
    private int[] telefonos;
    private String[] correos;

    public contacto(String nombre, int[] telefonos, String[] correos) {
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.correos = correos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int[] telefonos) {
        this.telefonos = telefonos;
    }

    public String[] getCorreos() {
        return correos;
    }

    public void setCorreos(String[] correos) {
        this.correos = correos;
    }

}