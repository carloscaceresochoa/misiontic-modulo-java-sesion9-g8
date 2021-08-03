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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1=new Persona("juan",22);
        Persona persona2=new Persona("pedro",44);
        Persona persona3=new Persona("Camilo",32);
        Persona persona4=new Persona("Santiago",35);
        Persona persona5=new Persona("Daniel",27);
        ListaPersona ps=new ListaPersona();
        ps.agregarPersona(persona1);
        ps.agregarPersona(persona2);
        ps.agregarPersona(persona3);
        ps.agregarPersona(persona4);
       // ps.eliminarPersona(persona3);
       // ps.actualizarPersona(3, persona5);
        ps.eliminarTodasPersonas();
        ps.mostrarPersonas();
        
    }
    
}
