import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validaciones {

    // TODO: esta clase contendrá los métodos que sirven para hacer diversas validaciones.

    // Para validar el número de la seguridad social.
    public static boolean validadNs(String ns){
        return ns.matches("^(?i)\\d{9}[TRWAGMYFPDXBNJZSQVHLCKE]$");
    }


    // Para validar el formato de las fechas.
    public static boolean validarFecha(String fecha){
        return fecha.matches("^([0][1-9]|[12][0-9]|3[01])(/)([0][1-9]|[1][0-2])\\2(\\d{4})$");
    }


    // Validar el sexo (H/M)
    public static boolean validarSexo(char s){
        boolean ok = false;
        if(s=='H'|s=='M'){
            ok = true;
        }
        return ok;
    }


    // Validar que la fecha de una venta está comprendida entre la fecha de inicio de contrato y final de contrato.
    public static boolean validarFechaVenta(String fechaIni, String fechaFin, String fechaVen) throws ParseException {
        boolean ok = true;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date fIni = sdf.parse(fechaIni);
        Date fFin = sdf.parse(fechaFin);
        Date fVen = sdf.parse(fechaVen);

        if(fVen.before(fIni) | fVen.after(fFin)){
            ok = false;
        }

        return ok;
    }




}