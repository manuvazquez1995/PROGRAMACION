public class Perro extends Animal{

    private boolean raboLargo;


    public Perro(){}

    public Perro(String nombre, int edad, boolean raboLargo){
        super(nombre, edad);
        this.raboLargo = raboLargo;
    }


    public boolean isRaboLargo() {
        return raboLargo;
    }

    public void setRaboLargo(boolean raboLargo) {
        this.raboLargo = raboLargo;
    }

    @Override
    public String expresar(){
        return "GUAU GUAU";
    }

    @Override
    public String getTipo(){
        return "Perro";
    }

    @Override
    public String toString(){
        return "- TIPO: "+getTipo()+"\n" +
                "NOMBRE: "+getNombre()+"\n" +
                "EDAD:"+getEdad()+"\n" +
                "RABO LARGO: "+isRaboLargo();
    }


}