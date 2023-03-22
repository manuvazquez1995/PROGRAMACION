import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class AltasVentas implements iTeclado{

    // Método que da de alta las ventas de un empleado temporal concreto.
    public static void altaVenta(ArrayList<Empleado> empleAct) throws IOException {

        if(empleAct.isEmpty()){
            System.out.println("** No hay empleados en activo.");
            System.out.println();

        }else{
             // Primero filtramos los empleados temporales guardándolos en un ArrayList auxiliar.
            ArrayList<EmpTemporal> auxEmpleTemp = new ArrayList<>();
            for(Empleado e : empleAct){
                if(e instanceof EmpTemporal){
                    auxEmpleTemp.add((EmpTemporal) e);
                }
            }

            if(auxEmpleTemp.isEmpty()){
                System.out.println("** No hay empleados temporales, tiene que añadirlos previamente.");
                System.out.println();

            }else{
                // Pedimos el NSS del empleado temporal al cual le añadiremos ventas.
                System.out.println("- Introduce el NSS del empleado para buscarlo: ");
                String nss = bf.readLine();
                while(!Validaciones.validadNs(nss)){
                    System.err.println("El número de la seguridad social no cumple con los requisitos de validación.");
                    System.out.println("Vuelva a introducirlo: ");
                    nss = bf.readLine();
                }

                // Buscamos el NSS para saber si existe un empleado con dicho NSS.
                EmpTemporal emp = null;
                for(EmpTemporal e : auxEmpleTemp){
                    if(Objects.equals(e.getNss(), nss)){
                        emp = e;
                        break;
                    }
                }

                // Comprobamos si lo encontró, en el caso afirmativo, se procede a las modificaciones.
                if(emp==null){
                    System.err.println("- No existe el NSS introducido.");
                    System.out.println();
                }else{
                    // Mostramos los datos del empleado que se quiere modificar.
                    System.out.println("- Empleado con NSS-"+nss+" encontrado: ");
                    System.out.println("- "+emp.getNombre()+"\t "+emp.getNss());
                    System.out.println();
                    System.out.println("¿Seguro que quiere modificarlo? (s -> aceptar, cualquier tecla -> cancela): ");
                    String op = bf.readLine();
                    char opc = op.charAt(0);
                    if(opc=='s'){
                        System.out.print(" - Introduce la fecha de la venta: ");
                        String fechaVenta = bf.readLine();
                        while (!Validaciones.validarFecha(fechaVenta)){
                            System.err.println("La fecha no cumple con los requisitos de validación.");
                            System.out.println("Vuelva a otra fecha: ");
                            fechaVenta = bf.readLine();
                        }
                        System.out.println("- Introduce el importe de la venta: ");
                        double importeVenta = Double.parseDouble(bf.readLine());

                        // Creamos un objeto venta con los datos que se pidieron.
                        Ventas venta = new Ventas(fechaVenta, importeVenta);

                        // Añadimos la venta al empleado.
                        ArrayList<Ventas> v = emp.getVentas();  // Traemos con get la lista de ventas del empleado.
                        v.add(venta);  // Añadimos a la lista auxiliar de ventas la nueva venta.
                        emp.setVentas(v);  // Devolvemos la venta al objeto del empleado.

                        // Sumamos las ventas que tiene en tota para actualizar el importe ventas del empleado.
                        double sumaVentas = 0; // Se guarda la suma para sumaVentas del empleado.
                        for(Ventas ve : emp.getVentas()){
                            sumaVentas = sumaVentas + ve.getImporteVenta();
                        }
                        int sumaV = (int) sumaVentas;
                        emp.setImporteVentas(sumaV);

                        // Lo añadimos a la lista de ventas del empleado temporal.
                        for(Empleado e : empleAct){
                            if(Objects.equals(e.getNss(), emp.getNss())){
                                e = emp;
                                break;
                            }
                        }
                        System.out.println("Venta añadida correctamente.");
                    }


                }



            }


        }




    }







}