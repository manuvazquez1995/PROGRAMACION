import com.thoughtworks.xstream.XStream;
import examen.Biblioteca.POJOS.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);



        //Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setCif("000000000A");
        biblioteca.setNombre("BibliosUnidas.S.A");
        biblioteca.setTf("666555444");
        LibrosTexto libroT = new LibrosTexto("Ciencia", "555555-AA", "Relatividad General", 50, true);
        LibrosOcio libroO = new LibrosOcio("666666-BB", "Blancanieves", 30, true);
        ArrayList<Libros> librosBiblioteca = new ArrayList<>();
        librosBiblioteca.add(libroO);
        librosBiblioteca.add(libroT);
        biblioteca.setL(librosBiblioteca);


        File fXML = new File("ficheros\\Fbiblioteca.xml");
        XStream xstream = new XStream();


        menu();
        int op = sc.nextInt();
        while (op!=0){
            switch (op){
                case 1 -> {
                    // Creamos un préstamos de libro de ocio que hemos creado anteriormente.
                    biblioteca = Methods.altaPrestamosOcio(biblioteca, LocalDate.now(), "77777787R", "Blancanieves");
                    menu();
                    op = sc.nextInt();
                }
                case 2 -> {
                     // Para que no de errores de acceso hacemos lo siguiente.
                    xstream.allowTypes(new Class[]{Biblioteca.class, Libros.class, LibrosOcio.class, LibrosTexto.class, Prestamos.class, Usuarios.class});

                    // Volcamos todo en un xml.
                    ObjetoAFicheroXML.GuardarXML(xstream, biblioteca, fXML);
                    menu();
                    op = sc.nextInt();
                }
                case 3 -> {
                    // Leemos todo el contenido del xml.
                    FicheroAObjetoXML.ficheroAObj(xstream, fXML);
                    menu();
                    op = sc.nextInt();
                }
                default -> {
                    System.out.println("Opcion incorrecta.");
                    menu();
                    op = sc.nextInt();
                }
            }
        }

    }


    // Opciones del menú.
    public static void menu(){
        System.out.println("""
                (1) Dar de alta un préstamo.
                (2) Guardar info en xml.
                (3) Visualizar info del xml.
                (0) Salir
                Escoja una opción.
                """);
    }


}