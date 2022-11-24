public class producto {

    private String nombreProducto;
    private int grado;
    private String nivelTox;

    // Constructores, getters y setters.
    public producto(String nombreProducto, int grado) {
        this.nombreProducto = nombreProducto;
        this.grado = grado;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getNivelTox() {
        return nivelTox;
    }

    public void setNivelTox(String nivelTox) {
        this.nivelTox = nivelTox;
    }

    //Método para asignar una toxicidad según el grado que tiene.
    public String toxicidad(){
        switch (grado){
            case 0,1,2,3,4,5,6,7,8,9,10:
                nivelTox = "NO TÓXICO";
                break;
            case 11:
                nivelTox = "BAJA TOXICIDAD";
                break;
            case 12:
                nivelTox = "MEDIA TOXICIDAD";
                break;
            case 13:
                nivelTox = "ALTA TOXICIDAD";
                break;
            default:
                nivelTox = "ALTAMENTE TÓXICO";

        }
        return nivelTox;
    }


}
