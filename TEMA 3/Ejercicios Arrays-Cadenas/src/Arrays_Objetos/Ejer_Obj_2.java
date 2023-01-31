package Arrays_Objetos;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_Obj_2 {

    /*
    2. Array de objetos Empleado (por defecto se tomarán 10).
    La clase Empleado tendrá los atributos: nombre, apellido, edad y salario.
    Introducir los valores y sacar la suma y la media de los salarios.
     */
    public static void main(String[] args) throws IOException {

        //Creamos el array donde se guardarán los empleados.
        empleado[] empleados = new empleado[3];

        //Pedimos los datos del cada empleado.
        for(int i=0; i<empleados.length; i++){
            System.out.println("* EMPLEADO "+(i+1)+": *");
            System.out.println("- Nombre: ");
            String nombre = bufferReader.leerString();
            System.out.println("- Apellido: ");
            String apellido = bufferReader.leerString();
            System.out.println("- Edad: ");
            int edad = bufferReader.leerInt();

            //Pedimos los teléfonos, teniendo en cuenta que puede tener varios.TODO: CORREGIR
            int[] telefonos = new int[3];
            int telefono = bufferReader.leerInt();
            telefonos[0] = telefono;
            //Pedimos los corres de la misma forma que se hizo con los teléfonos.TODO: CORREGIR
            String[] correos = new String[3];
            String correo = bufferReader.leerString();
            correos[0] = correo;

            //Salario
            System.out.println(" - Salario: ");
            int salario = bufferReader.leerInt();

            //Creamos objeto de cada empleado y lo guardamos en el array empleados.
            empleado empleado = new empleado(nombre,apellido,edad,telefonos,correos,salario);
            empleados[i] = empleado;
            }

        //Mostramos los datos de todos los empleados.
        for(empleado e : empleados){
            System.out.print(e.getNombre()+"\t"+e.getApellido()+"\t"+e.getEdad()+"\t"+e.getTelefonos()+"" +
                    "\t"+e.getCorreos()+"\t"+e.getSalario());

        }




        }



    }




//TODO: clase empleado.
class empleado{

    private String nombre;
    private String apellido;
    private int edad;
    private int[] telefonos;
    private String[] correos;
    private int salario;

    public empleado(String nombre, String apellido, int edad, int[] telefonos, String[] correos, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefonos = telefonos;
        this.correos = correos;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int[] telefonos) {
        this.telefonos = telefonos;
    }

    public String[] getCorreos() {
        return correos;
    }

    public void setCorreos(String[] correos) {
        this.correos = correos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}