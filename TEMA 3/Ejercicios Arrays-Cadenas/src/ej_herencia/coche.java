package ej_herencia;

public class coche extends vehiculo implements interfaz1{

    public coche(String nombre, int cv, String combustible){
        super.nombre = nombre;
        super.cv = cv;
        super.combustible= combustible;
    }

    @Override
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(cv);
        System.out.println(combustible);
        //interfaz1.calculaConsumo(cv);
    }


}
