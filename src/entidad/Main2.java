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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica mat=new Matematica();
        System.out.println(mat.PI);
        System.out.println(Matematica.PI_ESTATICO);
        System.out.println(Matematica.potenciaMetodoEstatico(4, 2));
        System.out.println(mat.potencia(3, 2));
    }
    
}
