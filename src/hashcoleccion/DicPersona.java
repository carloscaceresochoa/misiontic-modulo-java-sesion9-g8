/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcoleccion;

import java.util.HashMap;
import entidad.Persona;

/**
 *
 * @author DELL
 */
public class DicPersona  {
    
    private HashMap personas;
    
    public DicPersona(){
        personas=new HashMap<String,Persona>();
    }
    
    public void agregarPersona(String key,Persona persona){
        personas.put(key, persona);
    }
    
    public void mostrarPersona(String key){
        Persona persona=(Persona)personas.get(key);
        persona.mostrar();
    }
    
    public void mostrarPersonas(){
        Object[] keys=personas.keySet().toArray();
        for(int i=0;i<keys.length;i++){
            Persona persona=(Persona)personas.get(keys[i]);
            persona.mostrar();
        }
    }
    
    public void eliminarPersona(Persona persona){
        personas.remove(persona);
    }
    
    public void actualizarPersona(String key,Persona persona){
        personas.replace(key, persona);
    }
    
    public void menorEdad(){
        
        int menor=10000000;
        Object key=null;
        Object[] keys=personas.keySet().toArray();
        Persona persona;
        for(int i=0;i<keys.length;i++){
          persona=(Persona)personas.get(keys[i]);
          if(persona.getEdad()<menor){
              menor=persona.getEdad();
              key=keys[i];
          }
            
        }    
        System.out.println("La persona de menor edad es ");
        persona=(Persona)personas.get(key);
        persona.mostrar();
    }
    
       public void mayorEdad(){
        
        int mayor=0;
        Object key=null;
        Object[] keys=personas.keySet().toArray();
        Persona persona;
        for(int i=0;i<keys.length;i++){
          persona=(Persona)personas.get(keys[i]);
          if(persona.getEdad()>mayor){
              mayor=persona.getEdad();
              key=keys[i];
          }
            
        }    
        System.out.println("La persona de mayor edad es ");
        persona=(Persona)personas.get(key);
        persona.mostrar();
    }
    
}
