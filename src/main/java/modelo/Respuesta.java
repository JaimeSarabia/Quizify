/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author crivi
 */
public abstract class Respuesta {
    protected String descripcion;
    
    public Respuesta(){
        
    }
     public String obtenerDescricpion(){
         return this.descripcion;
     }
}
