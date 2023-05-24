package CRUD.idao;
 /*creamos la Interface IClienteDAO.java que registra los métodos CRUD, al ser una interface solo contiene la firma de los métodos.*/
import java.util.List;
 
import CRUD.model.Cliente;
 
public interface IClienteDao {	
	public boolean registrar(Cliente cliente);
	public List<Cliente> obtener();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar(Cliente cliente);
}