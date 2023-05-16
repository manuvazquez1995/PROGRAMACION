package JSON;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// TODO: funciona.

public class FicheroACliente {

    public static void main(String[] args) {

        // Creamos una instancia de Gson:
        Gson gson = new Gson();

        // Ahora tenemos que leer ese fichero.
        String fichero = "";

        try(BufferedReader br = new BufferedReader(new FileReader("ficheros\\datos_cliente.json"))){
            String linea;
            while((linea = br.readLine()) != null){
                fichero += linea;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //System.out.println("Lectura - Fechero texto");
        //System.out.println(fichero);

        System.out.println("Lectura - Serialización con GSON");
        LeerCliente(gson, fichero);

    }


    // Método que le un cliente de un archivo json.
    public static void LeerCliente(Gson gson, String fichero){
        Cliente cliente = gson.fromJson(fichero, Cliente.class);
        System.out.println(cliente);
    }


}