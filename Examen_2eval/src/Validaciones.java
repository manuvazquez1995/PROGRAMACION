public class Validaciones {

    // Método para validar un DNI.
    public static boolean validarDNI(String n){
        return n.matches("^(?i)\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
    }





}