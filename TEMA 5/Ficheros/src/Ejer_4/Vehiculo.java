package Ejer_4;

public class Vehiculo {

    private String matricula;
    private String marca;
    private double tamDeposito;
    private String modelo;

    public Vehiculo(String matricula, String marca, double tamDeposito, String modelo)
    {
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

}