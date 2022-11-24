public class ver {

    /*Constructor de la clase ver. Recibe como parámetro una instancia de un seguro que
    trae consigo todos los datos del cliente.*/
    public ver() {
    }

    public void ver(seguro aseg){

        //Aquí sacamos los datos del asegurado mediante getters o llamando a los metodos.

        System.out.println("********** PRECIO TOTAL (precio base 300€) ************\n" +
                "- Nombre: "+aseg.getNombreAsegurado());
        System.out.println("- Aumentos de precio: ");
        switch(aseg.comprobarSuplemento()){
            case 1:
                System.out.println("    * Menor de 28 años y menos de 5 años de carnet: +100€");
                break;
            case 2:
                System.out.println("    * Menos de 5 años de carnet: +100€.");
                break;
            case 3:
                System.out.println("    * Menor de 28 años: +100€.");
                break;
            case 0:
                System.out.println("    * Ninguno.");
                break;

        }
        System.out.println("- Aumento por precio coche (¿+15000?): ");
        if(aseg.aumentoPorPrecioCoche()>0){
            System.out.println("    * + "+aseg.aumentoPorPrecioCoche());
        }else{
            System.out.println("    * NO");
        }
        System.out.println("TOTAL: "+aseg.precioTotal()+"€");

    }

}
