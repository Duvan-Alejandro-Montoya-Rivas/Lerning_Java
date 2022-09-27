/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_UIS;

import java.util.ArrayList;
public class Lote {
    private final ArrayList <Producto> productos;

    public Lote() {
        productos= new ArrayList <> ();
    }
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    public void mostrarProductos(){
        for(Producto producto: productos){
            System.out.println(producto);
        }
    }
}
