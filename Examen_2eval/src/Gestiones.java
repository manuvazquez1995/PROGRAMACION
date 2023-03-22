import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Gestiones implements iTeclado{

    // Métodos para gestionar la aplicación desde el menú principal

    // Método que muestra las opciones del menú principal.
    public static void menu(){
        System.out.println("""
                ************** MENÚ PRINCIPAL ************
                (1) Visualización de trabajos.
                (2) Baja veterinario.
                (3) Alta paciente.
                (0) Salir
                
                - Introduce una opción:
                
                """);
    }


    // Método que busca si un paciente está en la lista por su DNI de su dueño.
    public static boolean  buscarDuenho(ArrayList<Persona> listadoP, String dni){
        boolean ok = false;

        // Como solo son los veterinarios los que tienen pacientes, creo un array list auxiliar donde solo guardo veterinarios.
        ArrayList<Veterinario> auxListVet = new ArrayList<>();
        for(Persona p : listadoP){
            if(p instanceof Veterinario){
                auxListVet.add((Veterinario) p);
            }
        }

        // Una vez filtrado los veterinarios, buscamos entre ellos el que contenga el DNI del dueño a buscar.
        for(Veterinario v : auxListVet){
            // Como cada veterinario tiene su propia lista de pacientes, hacemos lo siguiente.
            ArrayList<Paciente> listaPacientes = v.getP();
            for(Paciente l : listaPacientes){
                if(Objects.equals(l.getDniDuenho(), dni)){
                    ok = true;
                }
            }
        }
        return ok;
    }


    // Método que indique si existe un veterinario.
    public static boolean buscarVet(ArrayList<Veterinario> vet, String dniV){
        boolean ok = false;
        for(Veterinario v : vet){
            if(Objects.equals(v.getDni(), dniV)){
                ok = true;
                break;
            }
        }
        return ok;
    }



    // Método "Visualización trabajos" (OPCIÓN 1).
    public static void visualizacionTrabajos(ArrayList<Persona> listadoP) throws IOException {
        System.out.println("***** Visualización de trabajos *****");
        System.out.println("- Introduce el DNI del dueño del paciente: ");

        //Pedimos un dni.
        String dniB = bf.readLine();

        //Validamos con un método de validación.
        while(!Validaciones.validarDNI(dniB)){
            System.err.println("- El DNI no cumple con los requisitos de validación.");
            System.out.println("- Vuelva a introducirlo: ");
            dniB = bf.readLine();
        }

        // Comprobamos si existe dicho DNI entre los dueños de los animales de algún veterinario.
        if(!buscarDuenho(listadoP, dniB)){
            // Si no existe vuelve al menú principal.
            System.out.println("- No existe ningún dueño con este DNI.");
            System.out.println();
        }else{
            System.out.println("TRABAJOS DEL PACIENTE: ");
            for(Persona v : listadoP){
                if(v instanceof Veterinario){
                    System.out.println("- Nombre veterinario: "+v.getNombre());
                    for(Paciente p : ((Veterinario) v).getP()){
                        System.out.println("- Nombre Animal:"+p.getNombreAnimal());
                        System.out.println("- Raza animal: "+p.getRazaAnimal());
                        for(Historial h : p.getH()){
                            System.out.println("- Hora:"+h.getFechaConsulta()+"\t   -Trabajo: "+h.getTipoTrabajo()+"\t   - Importe: "+h.getImporte());
                        }
                    }
                }
            }

        }
        System.out.println();
    }


    // Método que da de baja un veterinario. (Apartado 2).
    public static void bajaVeterinario(ArrayList<Persona> listadoP) throws IOException {
        System.out.println("****** BAJA VETERINARIO *******");
        System.out.println("- Introduce el DNI del veterinario: ");

        //Pedimos un dni.
        String dniV = bf.readLine();

        //Validamos con un método de validación.
        while(!Validaciones.validarDNI(dniV)){
            System.err.println("- El DNI no cumple con los requisitos de validación.");
            System.out.println("- Vuelva a introducirlo: ");
            dniV = bf.readLine();
        }

        //Antes de buscar, se filtran los veteriarios guardandolos en un ArrayList
        ArrayList<Veterinario> vet = new ArrayList<>();
        for(Persona p : listadoP){
            if(p instanceof Veterinario){
                vet.add((Veterinario) p);
            }
        }

        // Ahora lo buscamos con un algoritmo de búsqueda.
        while(!buscarVet(vet, dniV)){
            System.err.println("No existe veterinario con ese DNI.");
            System.out.println("- Introduce el DNI del veterinario: ");

            //Pedimos un dni nuevamente.
            dniV = bf.readLine();

            //Validamos con un método de validación.
            while(!Validaciones.validarDNI(dniV)){
                System.err.println("- El DNI no cumple con los requisitos de validación.");
                System.out.println("- Vuelva a introducirlo: ");
                dniV = bf.readLine();
            }
        }

        System.out.println("- El veterinario con DNI:"+dniV+" existe. ¿Desea borrarlo? (s -> afirmar, cualquier tecla -> cancelar):");
        String op = bf.readLine();
        char opt = op.charAt(0);
        if(opt=='s'){
            String finalDniV = dniV;
            listadoP.removeIf(Veterinario -> Veterinario.getDni().equals(finalDniV));
            System.out.println("- El veterinario fue borrado correctamente.");
        }else{
            System.err.println("- Opción cancelada.");
        }

    }



}