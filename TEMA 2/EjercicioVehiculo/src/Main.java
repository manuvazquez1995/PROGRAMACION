public class Main {

    public static void main(String[] args) {

        /*Creamos un atributo 'tipo' donde se guarda el dato 'coche'.
        Esto se hace antes de crear el objeto vehiculo.*/
        vehiculo.setTipo("Coche");

        //TODO: Pedimos los datos de coche1 usando el constructor parametrizado.
        System.out.println("******* VEHÍCULO Nº1: ");
        System.out.println("- Modelo: ");
        String modelo = reader.leerString();
        System.out.println("- Marca: ");
        String marca = reader.leerString();
        System.out.println("- Color: ");
        String color = reader.leerString();
        System.out.println("- Combustible: ");
        String combustible = reader.leerString();
        System.out.println("- Potencia: ");
        int potencia = reader.leerInt();
        reader.nextLine();
        System.out.println("- Cilindrada: ");
        int cilindrada = reader.leerInt();
        reader.nextLine();
        System.out.println("- Matrícula: ");
        String matricula = reader.leerString();
        System.out.println("- ¿En que AÑO se matriculó?: ");
        int anhoMatricula = reader.leerInt();
        reader.nextLine();
        System.out.println("- ¿En que MES se matriculó?: ");
        int mesMatricula = reader.leerInt();
        reader.nextLine();

        //Instanciamos el vehículo con parámetros.
        vehiculo coche1 = new vehiculo(modelo, marca, color, combustible, potencia,
                                        cilindrada, matricula, mesMatricula, anhoMatricula);


        //TODO: Creamos coche2 con el constructor por defecto.
        //Instanciamos primero el objeto sin parámetros.
        vehiculo coche2 = new vehiculo();

        //Pedimos los datos y se los asignamos a coche2
        System.out.println("******* VEHÍCULO Nº2: ");
        System.out.println("- Modelo: ");
        coche2.setModelo(reader.leerString());
        System.out.println("- Marca: ");
        coche2.setMarca(reader.leerString());
        System.out.println("- Color: ");
        coche2.setColor(reader.leerString());
        System.out.println("- Combustible: ");
        coche2.setCombustible(reader.leerString());
        System.out.println("- Potencia: ");
        coche2.setPotencia(reader.leerInt());
        reader.nextLine();
        System.out.println("- Cilindrada: ");
        coche2.setCilindrada(reader.leerInt());
        reader.nextLine();
        System.out.println("- Matrícula: ");
        coche2.setMatricula(reader.leerString());
        System.out.println("- ¿En que AÑO se matriculó?: ");
        coche2.setAnhoMatriculacion(reader.leerInt());
        reader.nextLine();
        System.out.println("- ¿En que MES se matriculó?: ");
        coche2.setMesMatriculacion(reader.leerInt());
        reader.nextLine();


        //TODO: Creamos coche3 utilizando el constructor parametrizado y pidiendo los datos a través del.
        vehiculo coche3 = new vehiculo("Serie 1", "BMW","Negro",
                "Gasolina",400,255,"7777",11,2020);


        //TODO: Mostramos los datos de los 3 coches.
        coche1.show(1);
        coche2.show(2);
        coche3.show(3);


        //TODO: Mostramos el funcionamiento del método "tiempo"
        System.out.println(coche1.tiempo(4,2022));
        System.out.println(coche2.tiempo(1,2022));
        System.out.println(coche3.tiempo(9,2022));


        reader.close();
    }


}