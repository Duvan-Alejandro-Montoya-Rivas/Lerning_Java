/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_nueva;

import java.util.Scanner;

/**
 *
 * @author Juan Montoya}
 */
public class Prueba_nueva {

    /**
     * @param args the command line arguments
     */
    //public static final int I = (int) 3.1416; //estamos casteando la constante
    public static final double I = 3.1416;
    public static void main(String[] args) {
        /*int a = 64, b =63;
        // es lo mismo que un if, puedo irlo agramdamdo si quiero 
        String rest = (a<b)? "a es mayor a b ": "b es mayor a a";
        System.out.println(rest);
        
        System.out.println("Hola");
        
        
        System.out.println(1*I);//usas la constante normal
        */
        System.out.println("Intrese el valor del array: ");
        Scanner entrada = new Scanner(System.in);
        int b = entrada.nextInt();
        int a[] = new int [b];
        
        for (int i = 0; i < a.length; i++) { //escritura
            System.out.println("Ingrese el valor "+(i+1)+":");
            int j =entrada.nextInt();
            a[i] =  j;   
        }
        for (int i = 0; i < a.length; i++) { //lectura
            System.out.println(a[i]);
            
        }
        
    }
    
}
