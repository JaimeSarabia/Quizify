package controlador;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import modelo.UsuarioAlumno;
import org.bson.Document;

public class ControladorUsuarios {
    
    MongoCollection usuariosAlumno;
    
    public ControladorUsuarios(MongoCollection collection){
        usuariosAlumno = collection;
    }

    public UsuarioAlumno login(String email, String contraseña) {
        UsuarioAlumno u = null;
        /*Document findDocument = new Document("email", email);
        
        
        FindIterable<Document> resultDocument = usuariosAlumno.find(query);
        String json =  resultDocument.first().toJson();
        System.out.println(json);
        UsuarioAlumno u = new Gson().fromJson(json, UsuarioAlumno.class);*/
        return u;
    }
    
    public ArrayList<UsuarioAlumno> obtenerTodosUsuariosAlumno() {
        ArrayList<UsuarioAlumno> lista = new ArrayList();
        MongoCursor<Document> cursor = usuariosAlumno.find().iterator();
        try {
            while (cursor.hasNext()) {
              Document otro = (Document) cursor.next();
              String json =  otro.toJson();
              UsuarioAlumno u = new Gson().fromJson(json, UsuarioAlumno.class);
              lista.add(u);
            }
        } finally {
          cursor.close();
        }
        return lista;
    }
    
}
