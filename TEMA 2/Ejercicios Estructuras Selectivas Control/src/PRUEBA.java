public class PRUEBA {



    public static void main(String... mutableObjectExample) {

        StringBuilder name = new StringBuilder("James ");

        agregarApellido(name);

        System.out.println(name);

    }


    static void agregarApellido(StringBuilder name) {

        name.append("Gosling");

    }






}
