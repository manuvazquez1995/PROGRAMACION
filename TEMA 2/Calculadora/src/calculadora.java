public class calculadora {

    private float a;
    private float b;
    private float resultado;

    //Constructor sin parámetros para forzar la utilización de setters y getters.
    public calculadora(){

    }

    //Getters y Setters
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    //Menú para la calculadora.
    public void menuCalc(){
        System.out.println("""
                - SELECCIONE UNA OPCIÓN:
                      (0) Salir
                      (1) Sumar
                      (2) Restar
                      (3) Multiplicar
                      (4) Dividir""");
    }

    //Método para la suma.
    public float sumar(){
        resultado = a + b;
        return resultado;
    }

    //Método para la resta.
    public float restar(){
        resultado = a - b;
        return resultado;
    }

    //Método para la multiplicación.
    public float multiplicacion(){
        resultado = a * b;
        return resultado;
    }

    //Método para la división.
    public float division(){
        resultado = a / b;
        return resultado;
    }


}