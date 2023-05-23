package JSON;
import  java.util.ArrayList;
import java.util.List;

public class listaClientes {

    private List<Cliente> lista = new ArrayList<Cliente>();

    public listaClientes() {
        super();
    }

    public void add(Cliente cliente) {
        lista.add(cliente);
    }

    public List<Cliente> getList() {
        return lista;
    }


}