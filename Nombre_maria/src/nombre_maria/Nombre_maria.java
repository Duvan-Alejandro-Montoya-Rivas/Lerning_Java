/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombre_maria;

import java.util.Scanner;

/**
 *
 * @author Juan Montoya}
 */
public class Nombre_maria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, id;
        String b;
        float c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una edad: ");
        a=entrada.nextInt();
        Scanner cin = new Scanner(System.in);
       System.out.println("Ingrese Nombre: ");
        b=cin.nextLine();
        System.out.println("Ingrese id");
        id=entrada.nextInt();
        /*System.out.println("Ingres Numero con decimal");
        c=entrada.nextFloat();*/
        
        Persona maria = new Persona("maria",17,12413,"Mujer");
        maria.setEdad(a);
        maria.setNombre(b);
        //maria.setId(id);
        System.out.println("Edad sola: "+maria.getEdad());
        System.out.println("Nombre solo: "+ maria.getNombre());
        System.out.println("ID solo: "+maria.getId());
        System.out.println(maria.toString());
        
        
    }
    
}
