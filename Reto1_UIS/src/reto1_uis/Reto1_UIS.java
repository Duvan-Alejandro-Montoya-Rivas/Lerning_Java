/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1_uis;

/**
 *
 * @author Juan Montoya}
 */
public class Reto1_UIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos producto = new Productos();
        producto.calcularCostoAlmacenamiento(true, (float) 1.000);
        System.out.println(producto);
    }
    
}
