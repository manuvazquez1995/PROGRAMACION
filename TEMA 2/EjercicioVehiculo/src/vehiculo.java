public class vehiculo {

    //Atributos
    private String modelo;
    private String marca;
    private String color;
    private String combustible;
    private int potencia;
    private int cilindrada;
    private String matricula;
    private int anhoMatriculacion;
    private int mesMatriculacion;
    private static  String tipo;

    //Constructor por defecto (Sin parámetros para coche2).
    public vehiculo(){

    }

    //Constructor parametrizado para coche1 (no le pasamos el tipo)
    public vehiculo(String modelo, String marca, String color, String combustible, int potencia,
                    int cilindrada, String matricula, int mesMatriculacion, int anhoMatriculacion){
        this.modelo=modelo;
        this.marca=marca;
        this.color=color;
        this.combustible=combustible;
        this.potencia=potencia;
        this.cilindrada=cilindrada;
        this.matricula=matricula;
        this.anhoMatriculacion=anhoMatriculacion;
        this.mesMatriculacion=mesMatriculacion;
    }

    //Getters y Setters.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnhoMatriculacion() {
        return anhoMatriculacion;
    }

    public void setAnhoMatriculacion(int anhoMatriculacion) {
        this.anhoMatriculacion = anhoMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public void setMesMatriculacion(int mesMatriculacion) {
        this.mesMatriculacion = mesMatriculacion;
    }

    public String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        vehiculo.tipo = tipo;
    }

    //Método SHOW para mostrar los datos del vehiculo.
    public void show(int nCoche){ //TODO: recibe el nº de recorrido del for para enumerar los datos de cada vehículo.
        System.out.println("********* DATOS VEHÍCULO nº"+nCoche+ "*********\n" +
                "- MODELO: "+modelo+"\n" +
                "- MARCA: "+marca+"\n" +
                "- COLOR: "+color+"\n" +
                "- COMBUSTIBLE: "+combustible+"\n" +
                "- POTENCIA: "+potencia+"\n" +
                "- CILINDRADA: "+cilindrada+"\n" +
                "- MATRÍCULA: "+matricula+"\n" +
                "- FECHA DE MATRICULACIÓN: "+mesMatriculacion+"/"+anhoMatriculacion+"\n" +
                "- TIPO: "+tipo);
    }

    //Método tiempo para que devuelva en un string los años y meses que tiene el vehículo.
    public String tiempo(int mesActual, int anhoActual){
        int anhos = anhoActual - anhoMatriculacion;  //Para saber los años totales que puede haber.
        int meses = mesActual;                      //Por defecto, inicializamos meses con el mes actual.
        if(mesActual<mesMatriculacion){            //Con este comprobamos el número de meses sobrantes para saber si hay que restarle 1 año.
            anhos--;                              //Restamos un año si el mes actual es menor que el més de matriculación.
            int mesesSobrantesUltAnho = 12 - mesMatriculacion;     //Comprobamos los meses sobrantes del último año.
            meses = meses + mesesSobrantesUltAnho;                //Sumamos a los mesesActuales más los meses sobrantes del último año.
        }else{                                     //Si el mes actual es mayor que el mes de matriculación.
            meses = mesActual - mesMatriculacion; //Le restamos al mesActual los meses de mesMatriculacion.
        }
        return "El "+marca+" "+modelo+" "+color+", "+anhos+" años y "+meses+" meses.";
    }


}