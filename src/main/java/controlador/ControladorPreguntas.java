/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author nata2
 */

   

import modelo.Conexion;
import modelo.Pregunta;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Pregunta;
import org.bson.Document;
import static java.util.Arrays.asList;

public class ControladorPreguntas {
    
    MongoClient m;
    MongoDatabase db;
    MongoCollection preguntas;
    public ControladorPreguntas(){
        m = Conexion.obtenerInstanciaAccesoBD();
        db = m.getDatabase("Quizzify");
        preguntas = db.getCollection("Preguntas");
    }
     
    
    public Pregunta obtenerPregunta(String key, String valor) {
        Document findDocument = new Document(key, valor);
        FindIterable<Document> resultDocument = preguntas.find(findDocument);
        String json =  resultDocument.first().toJson();
        System.out.println(json);
        Pregunta p = new Gson().fromJson(json, Pregunta.class);
        return p;
    }
     
    
     public void insertPregunta(String text, String dificultad, String [] respuestas) {
         
       Document [] d  = new Document[respuestas.length]; 
       
       
       for(int i = 0; i< respuestas.length;i++){
           if(respuestas[i] != null){
               d[i] = new Document("resp",respuestas[i]);
              
           }
       }
       Document p = new Document();
          p.append("text", text)
                 .append("dificultad", dificultad)
                 .append("respuestas", asList(d));
        preguntas.insertOne(p);
    }

}
