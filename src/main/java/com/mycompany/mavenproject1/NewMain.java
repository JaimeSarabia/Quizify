/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;


import com.mongodb.MongoClient;
public class NewMain {

   
    static ControladorPreguntas controlador;
    public static void main(String[] args) {
           
        Conexion c = new Conexion();
        MongoClient m = c.crearConexion();
        controlador = new ControladorPreguntas(m);
        if(m != null) {
            
           //Ejemplo de obtener una pregunta consultando el valor text = "Pregunta 1"
           Pregunta p = controlador.obtenerPregunta("text", "pregunta 1");
           System.out.println(p.getDificultad());
        }
    }
}
