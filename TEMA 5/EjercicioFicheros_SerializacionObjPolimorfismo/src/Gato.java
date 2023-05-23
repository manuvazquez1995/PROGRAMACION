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
    public String expresar(){
        return "MIAU MIAU";
    }

    @Override
    public String getTipo(){
        return "Gato";
    }

    @Override
    public String toString(){
        return "- TIPO: "+getTipo()+"\n" +
                "NOMBRE: "+getNombre()+"\n" +
                "EDAD:"+getEdad()+"\n" +
                "BIGOTE LARGO: "+isBigoteLargo();
    }

}