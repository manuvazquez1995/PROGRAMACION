/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON.ejemplos;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mrnov
 */
public class FicheroAObjeto {
    public static void main (String args []){
        //Una vez lo tengamos importada librería GSON en proyecto
        //lo primero que haremos es crear una instancia de Gson:
        Gson gson = new Gson();
        
        //Ahora tenemos que leer ese fichero, os dejo como leerlo línea a línea:
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("ficheros\\datos_personaConAsig.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Lectura - Fichero Texto");
        System.out.println(fichero);
        
        System.out.println("Lectura - Serialización con GSON");
        LeerPersona(gson,fichero);
    }
       
    public static void LeerPersona(Gson gson, String fichero){
        Persona persona = gson.fromJson(fichero, Persona.class);
         
        System.out.println(persona);
    }
}
