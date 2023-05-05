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
    public void expresar(){
        System.out.println("GUAU GUAU");
    }

    @Override
    public String getTipo(){
        return "Perro";
    }


}