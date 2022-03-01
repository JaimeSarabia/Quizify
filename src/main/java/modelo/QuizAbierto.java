/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;

/**
 *
 * @author jaime
 */
public class QuizAbierto extends Quiz {

    @Override
    public Pregunta crearPregunta(String enunciado, String instrucciones, float puntuacion) throws IOException {
    Pregunta pregunta = new PreguntaAbierta (enunciado, instrucciones, puntuacion);
    return pregunta;        
    }
    
}
