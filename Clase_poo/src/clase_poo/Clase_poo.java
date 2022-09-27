/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_poo;

/**
 *
 * @author Juan Montoya}
 */
public class Clase_poo {

    
    public static void main(String[] args) {
       Perro p1 = new Perro("Pitbull","Juaquin",2,false);
        p1.Raza();
        Gato g1 =new Gato ("Persa","Pepito",1,true);
        g1.Raza();
        g1.setRaza("criollo");
        System.out.println("=====================");
        g1.Raza();
        
    }
    
}
