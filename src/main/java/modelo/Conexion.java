/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import javax.swing.JOptionPane;

/**
 *
 * @author nata2
 */
public class Conexion {
     
    private static MongoClient instanciaMongo = null;
    //private String url = "cluster0-shard-00-00.auadv.mongodb.net:27017";
    private static String url1 ="localhost:27017";
        
    private Conexion() {
        
    }
    private static MongoClient obtenerConexion() {
        
        try {
            instanciaMongo = new MongoClient(url1);
            
        }catch(MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en conexión a MONGODB " + e.toString());
        }
        return instanciaMongo;
    }
    
    public static MongoClient obtenerInstanciaAccesoBD() {
        if(instanciaMongo == null) {
            instanciaMongo = obtenerConexion();
        }
        return instanciaMongo;
    }
}
