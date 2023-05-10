package XML.clientes;
import XML.XstreamEjemplos.personas.PhoneNumber;

public class Cliente {

    private String firstname;
    private String lastname;
    private PhoneNumber phone;  // Se utiliza la clase PhoneNumber de personas.
    private PhoneNumber fax;


    public Cliente(){};

    public Cliente(String firstname, String lastname, PhoneNumber phone, PhoneNumber fax){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.fax = fax;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public PhoneNumber getFax() {
        return fax;
    }

    public void setFax(PhoneNumber fax) {
        this.fax = fax;
    }


    public String toString(){
        return "- Cliente{" + "nombre="+firstname+ ", lastname="+lastname+", phone="+phone+", fax="+fax+ '}';
    }

}