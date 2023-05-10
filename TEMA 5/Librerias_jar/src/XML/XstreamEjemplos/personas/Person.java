/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.XstreamEjemplos.personas;

import java.io.Serializable;

/**
 *
 * @author mrnov
 */
public class Person implements Serializable{
  private String firstname;
  private String lastname;
  private PhoneNumber phone;
  private PhoneNumber fax;
  
  private String dni;
  // ... constructores y métodos

    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
//        this.phone = phone;
//        this.fax = fax;
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
  
     public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }
}
