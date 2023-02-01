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
        empleado[] empleados = new empleado[10];
        //Variable para guardar la suma de todos los sueldos.
        double sumaSueldos = 0;
        //Variable para guardar la media de los sueldos existentes.
        double mediaSueldos = 0;


        //Pedimos los datos del cada empleado.
        for(int i=0; i<empleados.length; i++){
            System.out.println("* EMPLEADO "+(i+1)+": *");
            System.out.println("- Nombre: ");
            String nombre = bufferReader.leerString();
            System.out.println("- Apellido: ");
            String apellido = bufferReader.leerString();
            System.out.println("- Edad: ");
            int edad = bufferReader.leerInt();

            //Pedimos los teléfonos, teniendo en cuenta que puede tener varios.
            int[] telefonos = new int[3];
            boolean masT = true;
            int contT = 0;      //Para contar los números que ya se introdujeron.
            for(int t = 0; t<telefonos.length & masT; t++){
                System.out.println("- Introduzca el nº de telefono del empleado: ");
                telefonos[t] = bufferReader.leerInt();
                contT++;
                if(contT < telefonos.length) {        //Esto sirve para saber si ya se rellenó el array usando un contador. Si no se rellenó, le pregunta al usuario qué hacer.
                    System.out.println("- ¿Desea introducir más telefonos?(1=si/0=no):");
                    int opT = bufferReader.leerInt();
                    while (opT < 0 | opT > 1) {
                        System.err.println("- Opción incorrecta, debe introducir 1(si) o 0(no).");
                        System.out.println("- Introduzca una opción correcta: ");
                        opT = bufferReader.leerInt();
                    }
                    if (opT == 0) {
                        masT = false;
                    }
                }else{
                   System.out.println("- No se puede introducir más números, limite de 3.");
                }
            }

            //Pedimos los corres de la misma forma que se hizo con los teléfonos.
            String[] correos = new String[3];
            boolean masC = true;
            int contC = 0;      //Para contar los correos que ya se introdujeron.
            for(int c=0; c<correos.length & masC; c++){
                System.out.println("- Introduzca un correo del empleado: ");
                correos[c] = bufferReader.leerString();
                contC++;
                if(contC < correos.length) {      //Esto sirve para saber si ya se rellenó el array usando un contador. Si no se rellenó, le pregunta al usuario qué hacer.
                    System.out.println("- ¿Desea introducir más correos?(1=si/0=no):");
                    int opC = bufferReader.leerInt();
                    while (opC < 0 | opC > 1) {
                        System.err.println("- Opción incorrecta, debe introducir 1(si) o 0(no).");
                        System.out.println("- Introduzca una opción correcta: ");
                        opC = bufferReader.leerInt();
                    }
                    if (opC == 0) {
                        masC = false;
                    }
                }else{
                    System.out.println("- No se puede introducir más correos, limite de 3.");
                }
            }

            //Salario
            System.out.println(" - Salario: ");
            double salario = bufferReader.leerDouble();

            //Creamos objeto de cada empleado y lo guardamos en el array empleados.
            empleado empleado = new empleado(nombre,apellido,edad,telefonos,correos,salario);
            empleados[i] = empleado;
        }



        //Mostramos los datos de todos los empleados.
        for(empleado e : empleados){
            System.out.println("************************************************");
            System.out.println("- NOMBRE: "+e.getNombre());
            System.out.println("- APELLIDO: "+e.getApellido());
            System.out.println("- EDAD: "+e.getEdad());
            System.out.println("- TELÉFONOS: ");
                for(int t : e.getTelefonos()){
                    System.out.print(t+" |\t");   //Para mostrar cada uno de los teléfonos de cada empleado.
                }
                System.out.println();
            System.out.println("- CORREOS: ");
                for(String c : e.getCorreos()){  //Para mostrar cada uno de los correos de cada empleado.
                    System.out.print(c+" |\t");
                }
                System.out.println();
            System.out.println("- SALARIO: "+e.getSalario());
            System.out.println(" ");
        }



        //Calculamos la suma total de sueldos y la respectiva media de estos. Luego lo mostramos por pantalla.
        for(empleado n : empleados){
            sumaSueldos = sumaSueldos + n.getSalario();
            mediaSueldos = sumaSueldos / empleados.length;
        }
        System.out.println("############### DATOS SUELDOS ###############");
        System.out.println("- TOTAL SUELDOS: "+sumaSueldos+"\n" +
                "- MEDIA SUELDOS: "+mediaSueldos);



    }


}



//TODO: clase empleado.
class empleado{

    private String nombre;
    private String apellido;
    private int edad;
    private int[] telefonos;
    private String[] correos;
    private double salario;

    public empleado(String nombre, String apellido, int edad, int[] telefonos, String[] correos, double salario) {
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}