package CalcetinesNavidad;

public class calcetines {

    //Atributo donde guardamos la altura de los calcetines.
    private int altura;

    //Constructor parametrizado.
    public calcetines(int altura){
        this.altura=altura;
    }

    //Getter y setter de altura (único atributo)
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Método que imprime los calcetines basándose en la altura.
    public void dibujarCalcetines(){
        for(int i=1; i<(altura+1); i++){
            if(i<(altura-1)){
                System.out.println("***     ***");
            }else{
                System.out.println("******  ******");
            }
        }
    }


}//Fin clase calcetines
