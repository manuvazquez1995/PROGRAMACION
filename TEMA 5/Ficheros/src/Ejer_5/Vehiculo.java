package Ejer_5;
import java.io.Serializable;

public class Vehiculo implements Serializable {  // Para que un objeto de esta clase pueda ser volcado en un fichero de datos con la misma estructura.

    private String matricula;
    private String marca;
    private double tamDeposito;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, double tamDeposito, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tamDeposito = tamDeposito;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamDeposito() {
        return tamDeposito;
    }

    public void setTamDeposito(double tamDeposito) {
        this.tamDeposito = tamDeposito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void show() {
        System.out.println(matricula + "\t " + marca + "\t " + tamDeposito + "\t " + modelo);
    }

}