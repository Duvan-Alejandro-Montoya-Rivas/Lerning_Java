package poo;

import java.util.Scanner;

public class Mascota {
    //atributos
    private String nombre;
    private String raza;
    private String edad;
    //Constructores 
    public Mascota(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public Mascota(){
        
    }
    //metodos
    public void Datos(){
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingresar datos");
        System.out.println("Nombre: ");
        this.nombre=entrada.nextLine();
        System.out.println("Raza: ");
        this.raza=entrada.nextLine();
        System.out.println("Edad: ");
        this.edad=entrada.nextLine();
    }
    
    
}
