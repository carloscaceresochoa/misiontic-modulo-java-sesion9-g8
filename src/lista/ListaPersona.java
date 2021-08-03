/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import entidad.Persona;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DELL
 */
public class ListaPersona {
    
  private List<Persona> personas;
  
 public ListaPersona(){
     personas=new ArrayList<Persona>();
 }  
    
 public void agregarPersona(Persona persona){
     personas.add(persona);
 }   
 
 public void eliminarPersona(Persona persona){
     personas.remove(persona);
 }
 
 public void actualizarPersona(int pos,Persona persona){
     personas.set(pos, persona);
 }
 
 public void eliminarTodasPersonas(){
     personas.clear();
 }
 public void mostrarPersonas(){
     if(personas.isEmpty()){
         System.out.println("Lista No tiene personas");
     }
     else{
        for(Persona persona:personas){
            persona.mostrar();
        }
     }
 }
 
 
}
