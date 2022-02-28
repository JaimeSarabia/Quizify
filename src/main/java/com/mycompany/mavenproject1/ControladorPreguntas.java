
package com.mycompany.mavenproject1;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

public class ControladorPreguntas {
    
    MongoClient m;
    MongoDatabase db;
    MongoCollection preguntas;
    public ControladorPreguntas(MongoClient m){
        m = m;
        db = m.getDatabase("Quizzify");
        preguntas = db.getCollection("Preguntas");
    }
     
    
    public Pregunta obtenerPregunta(String key, String valor) {
        Document findDocument = new Document(key, valor);
        FindIterable<Document> resultDocument = preguntas.find(findDocument);
        String json =  resultDocument.first().toJson();
        
        Pregunta p = new Gson().fromJson(json, Pregunta.class);
        return p;
    }
     
    
    /*public ArrayList obtenerPreguntas() {
        
    }*/
}
