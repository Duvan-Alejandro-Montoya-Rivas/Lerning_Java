/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_poo;

/**
 *
 * @author Juan Montoya}
 */
public class Perro extends Animal{
    private String raza;

    public Perro(String raza, String nombre, int edad, boolean pedigre) {
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
        System.out.println("Nombre perro: "+super.getNombre());
        System.out.println("La raza del perro es: "+this.raza);
        System.out.println("¿El perro tiene pedrigre? :"+super.isPedigre());
        System.out.println("================================================");
    }
    
}
