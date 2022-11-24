package EmpresaVentaDesinfectante;
import lectorDatos.reader;

public class principal {

    public static void main(String[] args) {
        /*
        Creamos un array de tipo factura (guarda objetos tipo factura),
        lo inicializamos en 6 porque en el bucle for empezamos a contar desde 1
        para que la enumeración de las facturas empiecen desde 1.
        */
        factura[] factura = new factura[6]; //TODO: ESTO ES MUY IMPORTANTE.

        /*
        En este bucle for lo que se hace es pedir los datos de cada factura.
        Por cada recorrido del for nos pide los datos y crea un objeto factura
        guardándolo en el array creado anteriormente.
        */
        for(int i = 1; i<factura.length; i++){ //TODO: Empieza desde 1 y acaba asta que 'i' sea igual al tamaño del array.
            System.out.println(i+"ª FACTURA: ");
            System.out.println("Introduce el id del articulo: ");
            String idArt = reader.leerString();
            System.out.println("Introduce la cantidad de litros adquiridos: ");
            double cantidadLitros = reader.leerDouble();
            reader.nextLine();
            System.out.println("Introduce el precio por litro: ");
            double precioLitro = reader.leerDouble();
            reader.nextLine();
            //TODO: Por cada recorrido que haga crea una factura y la guarda en el array.
            factura[i] = new factura(i, idArt, cantidadLitros, precioLitro);
            //TODO: Una vez creada la factura en el array, se invoca al método totalFactura() para calcular el total de esa factura.
            factura[i].TotalFactura();
        }

        //En este bucle for mostramos los datos de todas las facturas.
        for(int i=1;i<factura.length;i++){
            System.out.println("ID_FACTURA: "+ factura[i].getIdFactura() +"\n"+
                    "- id_art: "+factura[i].getIdArticulo() + "\n"+
                    "- cantidad"+factura[i].getCantidadLitros() + "\n"+
                    "- precio_litro: "+factura[i].getPrecioLitro() + "\n" +
                    "- **totalFactura**: "+factura[i].getTotalFactura());
        }

        /*En este bucle for llamamos al método que comprueba si la factura es de más de 600 €
        El método se ejecuta por cada factura guardada en el array.*/
        for(int i=1; i<factura.length; i++){
            factura[i].supSeisc();
        }


        reader.close();
    }


}
