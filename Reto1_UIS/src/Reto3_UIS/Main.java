/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_UIS;

import java.util.Arrays;

/**
 *
 * @author Juan Montoya}
 */
public class Main {
    public static void main(String[] args) {
        Lote l = new Lote();
        l.agregarProducto(new ProductoNoRefrigerado("Acetaminofen", "123456", 25, 1000) );
        l.agregarProducto(new ProductoNoRefrigerado("Dolex", "654321", 25, 2000) );
        
        l.mostrarProductos();
    }
}
