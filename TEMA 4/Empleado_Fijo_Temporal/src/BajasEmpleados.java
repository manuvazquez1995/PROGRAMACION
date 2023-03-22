import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

    // TODO: ESTÁ BIEN, NO HAY NADA QUE CORREGIR.

public class BajasEmpleados implements iTeclado{

    // Método para dar de baja un empleado.
    public static void baja(ArrayList<Empleado> empleAct, ArrayList<Empleado> empleBaja) throws IOException {
        if(empleAct.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();
        }else{

            // Primero ordenamos el arrayList empleAct para luego hacer la búsqueda.
            Gestiones.ordenarEmpNombre(empleAct);

            // Se le pide al usuario el NSS del empleado que quiere dar de baja.
            System.out.println("- Introduce el NSS del empleado para darlo de baja: ");
            String nss = bf.readLine();
            while(!Validaciones.validadNs(nss)){
                System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
                System.out.println("Vuelva a introducirlo: ");
                nss = bf.readLine();
            }

            // Buscamos si existe el NSS introducido (no se emplea la búsqueda binaria).
            // Para ello, una vez que se encuentra, se guarda el objeto para su posterior tratamiento.
            Empleado emp = null;
            for(Empleado e : empleAct){
                if(Objects.equals(e.getNss(), nss)){
                    emp = e;
                    break;
                }
            }

            // Mostramos los datos del empleado encontrado, si no lo encontró da un mensaje de error.
            if(emp==null){
                System.out.println("- No se encontró ningún empleado con NSS-"+nss);
            }else{
                System.out.println("- Empleado con NSS-"+nss+" encontrado: ");
                System.out.println("- "+emp.getNombre()+"\t "+emp.getNss());
                System.out.println();
                System.out.println("- Seguro que quiere dar el empleado de baja? (s para afirmar, otra tecla para cancelar):");
                String op = bf.readLine();
                char opc = op.charAt(0);
                //Si decidimos que vamos a dar de baja al empleado, hacemos lo siguiente.
                if(opc=='s'){
                    //Primero guardamos al empleado guardado en la variable en el arrayList empleBaja.
                    empleBaja.add(emp);
                    //Luego lo borramos del arrayList empleAct.
                    String finalNss = nss;
                    empleAct.removeIf(Empleado -> Empleado.getNss().equals(finalNss));
                    //Indicamos que el empleado fué dado de baja.
                    System.out.println("- El empleado fué dado de baja correctamente.");
                }else{
                    System.out.println("- Operación cancelada.");
                }
            }
            System.out.println();
        }
    }


}