public class Gato extends Animal{

    private boolean bigoteLargo;


    public Gato(){}

    public Gato(String nombre, int edad, boolean bigoteLargo){
        super(nombre, edad);
        this.bigoteLargo = bigoteLargo;
    }

    public boolean isBigoteLargo() {
        return bigoteLargo;
    }

    public void setBigoteLargo(boolean bigoteLargo) {
        this.bigoteLargo = bigoteLargo;
    }

    @Override
    public void expresar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String getTipo(){
        return "Gato";
    }

}