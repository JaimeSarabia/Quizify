/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Conexion;
import modelo.Pregunta;
import controlador.ControladorPreguntas;
import com.mongodb.MongoClient;
import org.bson.Document;

/**
 *
 * @author nata2
 */
public class NewMain {

    static ControladorPreguntas controlador;
    public static void main(String[] args) {
        
        Conexion c = Conexion.obtenerConexion(); 
        if(c != null) {
            
           Pregunta p = c.obtenerPregunta("text", "pregunta 2");
           System.out.println(p.getDificultad());
           
           /*Document [] d = p.getRespuestas();
           System.out.println("a" + d.length);
           System.out.println(d[0]);
           System.out.println(d[1]);*/
           
           String [] respe = {"Verdadero","Falso"};
           //controlador.insertPregunta("Responda si la afirmacion siguiente es cierta: Hola que tal", "alta", respe);
        }
    }

}
