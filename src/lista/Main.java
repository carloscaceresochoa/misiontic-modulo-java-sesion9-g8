/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.List;



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
         
        List<Double> listaNumeros=new ArrayList<Double>();
        listaNumeros.add(4.5);
        listaNumeros.add(54.5);
        listaNumeros.add(89.9);
        listaNumeros.add(100.4);
        System.out.println(listaNumeros);
        for(Double n:listaNumeros){
            System.out.println(n);
        }
        
                
    }
    
}
