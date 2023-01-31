package Arrays_Objetos;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_Obj_1 {

    /*
    1. Crear un array de objetos Producto, que será instancia de una clase
    que tiene dos atributos (IdProducto y NombreProducto).
    Introducir valores en el array y después visualizarlo.
     */
    public static void main(String[] args) throws IOException {

        // Creamos el array que guardará objetos (para 5 productos).
        producto[] productos = new producto[5];

        //Pedimos los datos de los productos, instanciandolos cada uno.
        for(int i=0; i<productos.length; i++){
            producto producto = new producto();
            System.out.println("- PRODUCTO "+(i+1)+": ");
            System.out.println("- Introduce su id(solo ints): ");
            producto.setIdProducto(bufferReader.leerInt());
            System.out.println("- Introduce su nombre: ");
            producto.setNombreProducto(bufferReader.leerString());
            productos[i] = producto;
        }

        //Mostramos los datos del todos los productos introducidos.
        System.out.println("****** PRODUCTOS *****");
        for(int i=0; i<productos.length; i++){
            System.out.print("- Producto "+(i+1)+">>>  Id: "+productos[i].getIdProducto()+"    " +
                    "Nombre: "+productos[i].getNombreProducto());
            System.out.println();
        }

    }

}


// TODO: clase para crear los objetos producto en el main de arriba.
class producto{

    private int idProducto;
    private String nombreProducto;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}