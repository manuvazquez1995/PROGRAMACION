public class empleado {

    private String nombre;
    private float sueldoBase;
    private float porcDescuento = 21;
    private byte nHorasExtTrabajadas;
    private float precioHora;
    private String mes;


    public void informe(){
        System.out.println("************ NÓMINA ************\n" +
                "- Mes: "+mes+"\n" +
                "- Nombre del empleado: "+nombre+"\n" +
                "- Sueldo Base: "+sueldoBase+"\n" +
                "- Porcentaje de descuento: 21%\n" +
                "- Horas extra: "+valorHorasExtra()+"\n" +
                "- Descuentos: "+calcularDescuentos()+"\n" +
                "- Diferencia: "+calcularDiferencia()+"\n" +
                "- Sueldo neto: "+calcularSueldoNeto());

    }


    //Método que se utiliza en el MAIN para crear un empleado introduciendo los atributos del mismo.
    public empleado(String nombre, float sueldoBase, byte nHorasExtTrabajadas, float precioHora, String mes) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.nHorasExtTrabajadas = nHorasExtTrabajadas;
        this.precioHora = precioHora;
        this.mes = mes;
    }

    //Método para calcular el valor total de las horas extra.
    public float valorHorasExtra(){return nHorasExtTrabajadas*precioHora;}

    //Método para calcular los descuentos.
    public float calcularDescuentos(){return porcDescuento*(sueldoBase+nHorasExtTrabajadas)/100;}

    //Método para calcular la diferencia.
    public float calcularDiferencia(){return sueldoBase-calcularDescuentos();}

    //Método para calcular el sueldo neto.
    public float calcularSueldoNeto(){return calcularDiferencia()+valorHorasExtra();}


}
