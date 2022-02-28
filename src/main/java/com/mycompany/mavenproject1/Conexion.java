/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Conexion {
   
    
    MongoClient mongo = null;
    public MongoClient crearConexion() {
        
        String url = "cluster0-shard-00-00.auadv.mongodb.net:27017";
        String url1 ="localhost:27017";
        
        //MongoClientURI uri = new MongoClientURI("mongodb+srv://quizzifyAdmin:admin123@cluster0.auadv.mongodb.net/test?authSource=admin&replicaSet=atlas-v54e0w-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true");
           
        try {
            mongo = new MongoClient(url1);
            // mongo = new MongoClient(new MongoClientURI(url));
        }catch(MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en conexión a MONGODB " + e.toString());
        }
        return mongo;
    }
    
}
