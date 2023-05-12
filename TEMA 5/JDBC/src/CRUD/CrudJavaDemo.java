package CRUD;
import CRUD.controller.ControllerCliente;
import CRUD.model.Cliente;
 
public class CrudJavaDemo {
    public static void main(String[] args) {
        // controlador
        ControllerCliente controller = new ControllerCliente();

        // ver clientes
        System.out.println("R_Clientes-tabla Ventas.Cliente (Read-CRUD)");
        controller.verClientes();
        
        Cliente cliente = new Cliente(99, "Maria", "Rodriguez","99999999X");			

        // guarda un cliente a través del controlador
        controller.registrar(cliente);

        // ver clientes de nuevo
        System.out.println("C_Clientes-tabla Ventas.Cliente (Create-CRUD)");
        controller.verClientes();

        // editar un cliente por medio del id
        cliente.setId(100);
        cliente.setNombre("Otro nombre");
        controller.actualizar(cliente);

         // ver clientes de nuevo
        System.out.println("U_Clientes-tabla Ventas.Cliente (Update-CRUD)");
        controller.verClientes();
        
        // eliminar un cliente por medio del id
        //cliente.setId(1);
        controller.eliminar(cliente);
        
         // ver clientes de nuevo
        System.out.println("D_Clientes-tabla Ventas.Cliente (Delete-CRUD)");
        controller.verClientes();
    }
}