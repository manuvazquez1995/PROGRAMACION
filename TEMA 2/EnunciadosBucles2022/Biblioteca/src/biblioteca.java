import java.util.*;

public class biblioteca {

    //Definimos los atributos de la biblioteca.
    private String mes;
    private int cantidadLibrosPrestados;
    private String titulo;
    private byte numConsultasMes;
    private int totalPrestamosMes;


    //Introducir datos.
    public void entradaDatos(){
        Scanner reader = new Scanner(System.in);
        System.out.println("****** INTRODUCE LOS DATOS DE LA BIBLIOTECA *****");
        System.out.print("- Introduce el título: ");
        titulo = reader.nextLine();
        System.out.println("- Introduce el mes: ");
        mes = reader.nextLine();
        System.out.println("- Cantidad de libros prestados: ");
        cantidadLibrosPrestados = reader.nextInt();
        reader.nextLine();
        System.out.println("- Numero de consultas en el mes: ");
        numConsultasMes = reader.nextByte();
        reader.nextLine();
        System.out.println("- Total de prestamos al mes: ");
        totalPrestamosMes = reader.nextInt();
        reader.close();
        System.out.println("*************************************************");
    }


    //Motrar los datos del objeto.
    public void visualizar(){

        System.out.println("El libro "+titulo+" se consultó "+numConsultasMes+".\n" +
                "La tasa de consulta en el mes de "+mes+" es "+formulaTasa()+".");

    }


    //Método para calcular la tasa de consultas del libro durante el mes.(Función).
    public double formulaTasa(){
        return (numConsultasMes * 100)/totalPrestamosMes;
    }


    //Constructores.
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getCantidadLibrosPrestados() {
        return cantidadLibrosPrestados;
    }

    public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
        this.cantidadLibrosPrestados = cantidadLibrosPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public byte getNumConsultasMes() {
        return numConsultasMes;
    }

    public void setNumConsultasMes(byte numConsultasMes) {
        this.numConsultasMes = numConsultasMes;
    }

    public int getTotalPrestamosMes() {
        return totalPrestamosMes;
    }

    public void setTotalPrestamosMes(int totalPrestamosMes) {
        this.totalPrestamosMes = totalPrestamosMes;
    }


}
