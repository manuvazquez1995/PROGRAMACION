package JSON;
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TODO: funciona.

public class ClienteAFichero {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // Creamos el cliente.
        Cliente cliente = new Cliente("Manuel", "Vázquez",
                new phoneNumber(100, "600111222"),
                new phoneNumber(110, "900111222"));
        Cliente cliente2 = new Cliente("Carmen", "Míguez",
                new phoneNumber(100, "600111222"),
                new phoneNumber(110, "900111222"));
        Cliente cliente3 = new Cliente("Paula", "López",
                new phoneNumber(100, "600111222"),
                new phoneNumber(110, "900111222"));

        listaClientes lista = new listaClientes();
        lista.add(cliente);
        lista.add(cliente2);
        lista.add(cliente3);


        // Guardamos el objeto cliente en un archivo.
        try(FileWriter writer = new FileWriter("ficheros\\datos_cliente.json")){
            gson.toJson(lista, writer);

            // Generamos la cadena con formato fichero .json.
            String json = gson.toJson(lista);

            // Mostramos por pantalla el String que sería el json.
            System.out.println(json);

            // Volvamos la cadena con formato .json en forma de fichero de texto.
            GuardarClienteJSON(json);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    // Método que guarda un cliente en un fichero JSON
    public static void GuardarClienteJSON(String json){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros\\datos_cliente.json"))){
           bw.write(json);
           System.out.println("Cliente guardado en el fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}