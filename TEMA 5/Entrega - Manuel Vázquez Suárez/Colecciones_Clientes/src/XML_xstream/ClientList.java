package XML_xstream;
import java.util.ArrayList;
import java.util.List;

public class ClientList {

    private List<Cliente> lista = new ArrayList<Cliente>();

    public ClientList() {
        super();
    }

    public void add(Cliente cliente) {
        lista.add(cliente);
    }

    public List<Cliente> getList() {
        return lista;
    }

}