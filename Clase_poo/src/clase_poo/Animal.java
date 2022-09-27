/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_poo;

/**
 *
 * @author Juan Montoya}
 */
public abstract  class Animal {
    private String nombre;
    private int edad;
    private boolean pedigre;

    public Animal(String nombre, int edad, boolean pedigre) {
        this.nombre = nombre;
        this.edad = edad;
        this.pedigre = pedigre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPedigre() {
        return pedigre;
    }

    public void setPedigre(boolean pedigre) {
        this.pedigre = pedigre;
    }
    
    public abstract void Raza();
}
