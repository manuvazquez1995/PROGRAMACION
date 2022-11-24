package EstaturaPromedio;

import lectorDatos.reader;


public class Principal {

    public static void main(String[] args) {

        int suma=0;
        int nAlumnos;
        int estatura;

        System.out.println("Nalumnos: ");
        nAlumnos= reader.leerInt();
        reader.nextLine();

        for(int i=0; i<nAlumnos; i++){
            System.out.println("Introduce estatura: ");
            estatura=reader.leerInt();
            reader.nextLine();
            while(estatura<=0){
                System.out.println("estatura mala: ");
                estatura=reader.leerInt();
                reader.nextLine();
            }
            suma=suma+estatura;
        }


        if(nAlumnos<=0){
            System.out.println("NO HAY ALUMNOS");
        }else{
            int promedio=suma/nAlumnos;
            System.out.println(promedio);
        }


    }


}
