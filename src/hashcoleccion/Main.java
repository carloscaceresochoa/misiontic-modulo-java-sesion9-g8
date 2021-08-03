/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcoleccion;

import entidad.Persona;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DicPersona diccionario=new DicPersona();
        Persona persona1=new Persona("juan",22);
        Persona persona2=new Persona("pedro",44);
        Persona persona3=new Persona("Camilo",32);
        Persona persona4=new Persona("Santiago",35);
        Persona persona5=new Persona("Daniel",27);
        diccionario.agregarPersona("p1", persona1);
        diccionario.agregarPersona("p2", persona2);
        diccionario.agregarPersona("p3", persona3);
        diccionario.agregarPersona("p4", persona4);
        diccionario.agregarPersona("p5", persona5);
       // diccionario.actualizarPersona("p1", persona5);
        diccionario.menorEdad();
        diccionario.mayorEdad();
    }
    
}
