package CRUD.dao;
 /*
 Lo siguiente es crear la implementación de la interface anterior, para esto lo hacemos en la clase ClienteDaoImpl.java, nota que también utilizamos la clase Conexion.java, para la ejecución de comandos SQL.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import CRUD.Connection.*;
import CRUD.Connection.singleton.EjemploSingletonMySQL;
import CRUD.idao.IClienteDao;
import CRUD.model.Cliente;
 
public class ClienteDaoImpl implements IClienteDao {	
	
    @Override
    public boolean registrar(Cliente cliente) {
        boolean registrar = false;

        Statement stm= null;
        Connection con=null;

        //String sql="INSERT INTO cliente values (NULL,'"+cliente.getDni()+"','"+cliente.getNombre()+"','"+cliente.getApellido()+"')";
        String sql="INSERT INTO cliente (id,nombre,apellido1,dni) values ('"+cliente.getId()+"','"+cliente.getNombre()+"','"+cliente.getApellido()+"','"+cliente.getDni()+"')";

        try {			
            con=Conexion.conectar();//Sin usar Patrón Sigleton
            
            stm= con.createStatement();
            stm.execute(sql);
            registrar=true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImpl, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Cliente> obtener() {
        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT * FROM CLIENTE ORDER BY ID";

        List<Cliente> listaCliente= new ArrayList<Cliente>();

        try {			
            //co= Conexion.conectar();
            
            //Usando Singleton
            co = EjemploSingletonMySQL.getConnection();
            if (co != null) {
                System.out.println("Conexión 1: Conexión a BD-" + co.getCatalog()+" satisfacoria");
            }
            
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Cliente c=new Cliente();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDni(rs.getString(2));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            //co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }

        return listaCliente;
    }

    @Override
    public boolean actualizar(Cliente cliente) {
        Connection connect= null;
        Statement stm= null;

        boolean actualizar=false;

        String sql="UPDATE CLIENTE SET id='"+cliente.getId()+"', nombre='"+cliente.getNombre()+"', apellido1='"+cliente.getApellido()+"'" +" WHERE dni='"+cliente.getDni()+"'";
        try {
            connect=Conexion.conectar();
            
            stm=connect.createStatement();
            stm.execute(sql);
            actualizar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }		
        return actualizar;
    }

    @Override
    public boolean eliminar(Cliente cliente) {
        Connection connect= null;
        Statement stm= null;

        boolean eliminar=false;

        String sql="DELETE FROM CLIENTE WHERE dni='"+cliente.getDni()+"'";
        try {
            connect=Conexion.conectar();
            stm=connect.createStatement();
            stm.execute(sql);
            eliminar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }		
        return eliminar;
    }

}