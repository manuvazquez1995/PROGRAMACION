public class Main {

    public static void main(String[] args) {

        /*Variables que solo se emplean en esa clase para guardar los datos
        introducidos por teclado.*/
        float a;
        float b;

        /*Instanciamos un objeto calculadora, no le pasamos parámetros ya que lo
        haremos con setters por cada método.*/
        calculadora calc = new calculadora();

        /*Menú con todas con las 4 opciones que podemos hacer.
        Desde este menú ya invocamos a los métodos que harán las operaciones.*/
        System.out.println("""
                **********************************
                ***********CALCULADORA************
                **********************************""");
        byte op;
        do{
            calc.menuCalc();
            op = reader.leerByte();
            //Menú
            switch (op) {
                case 1 -> {
                    System.out.println("-> SUMA:\n" +
                            "- Introduce 2 números:");
                    a = reader.leerFloat();
                    b = reader.leerFloat();
                    calc.setA(a);
                    calc.setB(b);
                    System.err.println("RESULTADO: " + calc.sumar());
                    System.out.println("*************************");
                }
                case 2 -> {
                    System.out.println("-> RESTA:\n" +
                            "- Introduce 2 números:");
                    a = reader.leerFloat();
                    b = reader.leerFloat();
                    calc.setA(a);
                    calc.setB(b);
                    System.err.println("RESULTADO: " + calc.restar());
                    System.out.println("*************************");
                }
                case 3 -> {
                    System.out.println("-> MULTIPLICACIÓN:\n" +
                            "- Introduce 2 números:");
                    a = reader.leerFloat();
                    b = reader.leerFloat();
                    calc.setA(a);
                    calc.setB(b);
                    System.err.println("RESULTADO: " + calc.multiplicacion());
                    System.out.println("*************************");
                }
                case 4 -> {
                    System.out.println("-> DIVISIÓN:\n" +
                            "- Introduce 2 números:");
                    a = reader.leerFloat();
                    b = reader.leerFloat();
                    calc.setA(a);
                    calc.setB(b);
                    System.err.println("RESULTADO: " + calc.division());
                    System.out.println("*************************");
                }
                case 0 -> System.out.println("FIN");
                default -> System.out.println("Opción no válida, vuelva a intentarlo.");
            }

        }while (op != 0);

    }

}