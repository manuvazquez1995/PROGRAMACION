package Expresiones_Regulares;

public class validaciones {

    // Método que sirve para validar si un número es entero.
    public static boolean validarNumEntero(String n) {
        return n.matches("^-?[0-9]+$");
    }


    // Método que sirve para validar si una cadena es un número real con un número de decimales.
    public static boolean validarNumReal(String n){
        return n.matches("^-?[0-9]+([.][0-9]+)?$");
    }


    // Método que sirve para validar si un DNI es correcto.
    public static boolean validarDNI(String n){
        return n.matches("^(?i)\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
    }


    // Método que


    // Método que sirve para validar un número de teléfono movil (9 números).
    public static boolean validarNumTel(String n){
        return n.matches("[6-9][0-9]{8}");
    }



}