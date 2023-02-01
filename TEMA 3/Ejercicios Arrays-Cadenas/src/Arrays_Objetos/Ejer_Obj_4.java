package Arrays_Objetos;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_Obj_4 {

    /*
    4. Crear un array de objetos coche para simular un Concesionario.
    Se debe guardar del coche la siguiente info: marca, modelo,precio_base,
    aire_acondicionado,cierre_central,pintura_metalizada, tipo_motor.
     */
    public static void main(String[] args) throws IOException {

        //Array donde se guardarán los coches con su información.
        coche[] concesionario = new coche[5];

        //Variable que gestiona la opción escogida del menú.
        menu();
        int op = bufferReader.leerInt();

        while(op>=0) {
            switch (op) {
                case 1 -> {
                    coche c1 = new coche("BMW", "Serie 3", 25000, true,
                            true, false, "Diesel");
                    coche c2 = new coche("Audi", "A 3", 21000, true,
                            true, true, "Gasolina");
                    coche c3 = new coche("Peugeot", "308", 15000, true,
                            false, false, "Diesel");
                    coche c4 = new coche("Renault", "Modelo 5", 14000, true,
                            true, false, "Gasolina");
                    coche c5 = new coche("BMW", "Serie 1", 19000, true,
                            true, false, "Diesel");
                    concesionario[0] = c1;
                    concesionario[1] = c2;
                    concesionario[2] = c3;
                    concesionario[3] = c4;
                    concesionario[4] = c5;
                    menu();
                    op = bufferReader.leerInt();
                }
                case 2 -> {
                    System.out.println(" nada ");
                }
                case 3 -> {
                    System.out.println(" nadaaa ");
                }
                case 4 -> {
                    System.out.println(" nadaaaaa ");
                }
                case 5 -> {
                    for (coche c : concesionario) {
                        System.out.println("*****************************************\n" +
                                "- MARCA: " + c.getMarca() + "\n" +
                                "- MODELO: " + c.getModelo() + "\n" +
                                "- PRECIO BASE: " + c.getPrecio_base() + "\n" +
                                "- AIRE ACONDICIONADO: " + c.getAire_acondicionado() + "\n" +
                                "- CIERRE CENTRAL: " + c.getCierre_central() + "\n" +
                                "- PINTURA METALIZADA: " + c.getPintura_metalizada() + "\n" +
                                "- TIPO MOTOR: " + c.getTipo_motor());
                    }
                    menu();
                    op = bufferReader.leerInt();
                }
                case 0 -> {
                    System.out.println(" ADIÓS ");
                }
                default -> {
                    System.err.println("Opción no válida, introduzca una correcta.");
                    //op = bufferReader.leerInt();
                }
            } //FIN SWTH
        }



    }


    //Metodo que imprime el menú.
    static void menu(){
        System.out.println("""
                ********* CONCESIONARIO *********
                (1) Cargar coche.
                (2) Visualizar listado ordenado de coches.
                (3) Coche más caro.
                (4) Hacer búsqueda.
                (5) Ver todos los coches.
                (0) Salir.
                Introduce una opción:
                """);
    }


}


// CLASE COCHE.
class coche{

    private String marca;
    private String modelo;
    private double precio_base;
    private boolean aire_acondicionado;
    private boolean cierre_central;
    private boolean pintura_metalizada;
    private String tipo_motor;

    public coche(String marca,
                 String modelo,
                 double precio_base,
                 boolean aire_acondicionado,
                 boolean cierre_central,
                 boolean pintura_metalizada,
                 String tipo_motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio_base = precio_base;
        this.aire_acondicionado = aire_acondicionado;
        this.cierre_central = cierre_central;
        this.pintura_metalizada = pintura_metalizada;
        this.tipo_motor = tipo_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public boolean getAire_acondicionado() {
        return aire_acondicionado;
    }

    public void setAire_acondicionado(boolean aire_acondicionado) {
        this.aire_acondicionado = aire_acondicionado;
    }

    public boolean getCierre_central() {
        return cierre_central;
    }

    public void setCierre_central(boolean cierre_central) {
        this.cierre_central = cierre_central;
    }

    public boolean getPintura_metalizada() {
        return pintura_metalizada;
    }

    public void setPintura_metalizada(boolean pintura_metalizada) {
        this.pintura_metalizada = pintura_metalizada;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

}