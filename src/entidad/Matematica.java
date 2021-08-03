/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author DELL
 */
public class Matematica {
    
    public static double PI_ESTATICO=3.1416;
    public double PI=3.1416;
    
    
    public static double potenciaMetodoEstatico(double base,double exponente){
        return Math.pow(base,exponente);
    }
     public double potencia(double base,double exponente){
        return Math.pow(base,exponente);
    }
    
    
}
