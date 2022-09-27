/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;
/**
 *
 * @author Juan Montoya}
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Pepito = new Persona("Andres");
        System.out.println(Pepito.toString());
        double[]pepito = {43000,20000,5,6,10,8,9};
        double []Compra = Loco.reporte(pepito);// objeto 
        for (int i = 0; i < Compra.length; i++) {
            System.out.print(Compra[i]+"\n");
        }
        
        
    }
    
    
}

