
public class ordenador {

    private String marcaPc;
    private double precioInicial;
    private double precioFinal;
    private byte formaPago;
    private byte meses;
    private double mensualidad;

    //Constructor de la clase ordenador.
    public ordenador(String marcaPc, double precioInicial, byte formaPago) {
        this.marcaPc = marcaPc;
        this.precioInicial = precioInicial;
        this.formaPago = formaPago;
    }

    //Getters y setters.
    public String getMarcaPc() {
        return marcaPc;
    }

    public void setMarcaPc(String marcaPc) {
        this.marcaPc = marcaPc;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(double precioInicial) {
        this.precioInicial = precioInicial;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public byte getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(byte formaPago) {
        this.formaPago = formaPago;
    }

    public byte getMeses() {
        return meses;
    }

    public void setMeses(byte meses) {
        this.meses = meses;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }


    /*Método que calcula el método de pago dependiendo de la mensualidad que
        escoja el cliente. Para ello este método recibe un parámetro que es la
        forma de pago.*/
    public void calcular(){
        switch (formaPago){
            case 1:
                precioFinal = precioInicial;
                break;
            case 2:
                precioFinal = precioInicial + (precioInicial *0.08);
                meses = 6;
                mensualidad = precioFinal / meses;
                break;
            case 3:
                precioFinal = precioInicial + (precioInicial * 0.15);
                meses = 12;
                mensualidad = precioFinal / meses;
                break;
        }
    }


}
