/*
Una vez creado el acceso a datos los DAO’s vamos a utilizar la arquitectura MVC para poder utilizar los métodos CRUD.

El modelo ya lo habíamos creado anteriormente, así que ahora sólo vamos a crear la vista y luego el controlador.

La vista es el lugar donde se va mostrar los datos del modelo, recuerda que en la arquitectura MVC la vista no interactua directamente con el modelo ni con el acceso a los datos, sino lo hace a través del controlador.
*/

package CRUD.vista;
 
import java.util.List;
 
import CRUD.model.Cliente;
 
public class ViewCliente {
    public void verCliente(Cliente cliente) {
        System.out.println("Datos del Cliente: "+cliente);
    }

    public void verClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
                System.out.println("Datos del Cliente: "+cliente);
        }		
    }
}