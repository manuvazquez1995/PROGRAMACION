/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML_xstream;

/**
 *
 * @author mrnov
 */
public class PhoneNumber {
  private int code;
  private String number;
  // ... constructores y métodos 

    public PhoneNumber(int code, String number) {
        this.code = code;
        this.number = number;
    }

    public PhoneNumber() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
  
}
