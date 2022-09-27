/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_poo;

/**
 *
 * @author Juan Montoya}
 */
public class Gato extends Animal implements Metodounion{
    private String raza;

    public Gato(String raza, String nombre, int edad, boolean pedigre) {
        super(nombre, edad, pedigre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Raza() {
        System.out.println("nombre del gato: "+super.getNombre());
        System.out.println("Edad del gato: "+super.getEdad());
        System.out.println("Raza del gato: "+this.raza);
    }

    @Override
    public void union() {
        System.out.println("Unidos");
    }

    @Override
    public void Hola() {
        System.out.println("Hola");
    }
    
    
}
