
package com.mycompany.mavenproject1;

/**
 *
 * @author PC
 */
public class Pregunta {
    
    private String text;
    private String dificultad;
    
    
    public Pregunta() {
        
    }
    
    public Pregunta(String text, String dificultad){
        this.text = text;
        this.dificultad = dificultad;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getText() {
        return text;
    }

    public String getDificultad() {
        return dificultad;
    }
    
    
}
