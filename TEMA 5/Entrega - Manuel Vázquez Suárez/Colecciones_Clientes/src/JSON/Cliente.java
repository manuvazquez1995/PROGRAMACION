package JSON;


public class Cliente {

    private String firstname;
    private String lastname;
    private phoneNumber phone;
    private phoneNumber fax;


    public Cliente(){};

    public Cliente(String firstname, String lastname, phoneNumber phone, phoneNumber fax){
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

    public phoneNumber getPhone() {
        return phone;
    }

    public void setPhone(phoneNumber phone) {
        this.phone = phone;
    }

    public phoneNumber getFax() {
        return fax;
    }

    public void setFax(phoneNumber fax) {
        this.fax = fax;
    }


    public String toString(){
        return "- Cliente{" + "nombre="+firstname+ ", lastname="+lastname+", phone="+phone+", fax="+fax+ '}';
    }


}