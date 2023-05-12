/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON.ejemplos;
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// TODO IMPORTANTE: HAY QUE CAMBIAR ESTE FICHERO POR OTRO QUE SUBIÓ LA PROFESORA.

/**
 *
 * @author mrnov
 */
public class ObjetoAFichero {
    public static void main (String args []) throws IOException{
        Gson gson = new Gson();
 
        Persona persona = new Persona("Maria", "RN", 120);
        persona.getAsignaturas().add(new Asignatura(1,"AADD"));
        persona.getAsignaturas().add(new Asignatura(2,"CD"));

        // Java objects to File
        try (FileWriter writer = new FileWriter("ficheros\\datos_personaConAsig.json")) {
            gson.toJson(persona, writer);
            //directamente en una sentencia???
            //gson.toJson(persona, new FileWriter("datos_personaConAsig2.json"));

            //Generación de la cadena con formato fichero .json
            String json = gson.toJson(persona);

            System.out.println(json);

            //Volcado de la cadena con formato .json en forma de Fich.Texto
            GuardarJSON(json);
        }  
    }
    
    public static void GuardarJSON(String json){
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros\\datos_personaConAsig.json"))) {
            bw.write(json);
            System.out.println("Fichero creado");
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }
}
