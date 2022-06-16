package poo;

import java.util.Scanner;

public class Poo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Persona p1=new Persona();
        System.out.println("ingrese Nombre: ");
        p1.setNombre(entrada.nextLine());
        System.out.println("Igrese Edad: ");
        p1.setApellido(entrada.nextLine());
        System.out.println("Ingrese Cedula: ");
        p1.setCc(entrada.nextLine());
        System.out.println("Ingrese Edad: ");
        p1.setEdad(entrada.nextInt());
        
        /*System.out.println("====================================");
        System.out.println("los datos: "+"\n"+"Nombre y apellido: "+p1.getNombre()+p1.getApellido()+"\n"+"Cedula: "+p1.getCc()+"\n"+"Edad: "+p1.getEdad());
        System.out.println("====================================");*/
        p1.toString();
        
       
    }
    
}
