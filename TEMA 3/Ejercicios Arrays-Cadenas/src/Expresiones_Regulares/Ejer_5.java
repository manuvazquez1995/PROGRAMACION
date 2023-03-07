package Expresiones_Regulares;
import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Ejer_5 {

    // 5. Valida si una cadena tiene formato de telefono (9 numeros)

    public static void main(String[] args) throws IOException {

        System.out.println("- Introduce un nº de teléfono: ");
        String tlf = bufferReader.leerString();

        if(validaciones.validarNumTel(tlf)){
            System.out.println("Teléfono válido.");
        }else{
            System.out.println("Teléfono NO válido.");
        }

    }

}
