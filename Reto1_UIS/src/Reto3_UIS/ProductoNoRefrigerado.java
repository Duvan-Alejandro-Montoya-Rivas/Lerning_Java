/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_UIS;

/**
 *
 * @author Juan Montoya}
 */
public class ProductoNoRefrigerado extends Producto {

    public ProductoNoRefrigerado(String nombre, String id, double temperatura, double valorBase) {
        super(nombre, id, temperatura, valorBase);
    }

    public ProductoNoRefrigerado() {
    }
    
   public double calularCostoDeAlmacenamiento(){
       double retornar =0;
           retornar= super.getValorBase()*2.1;
       return retornar;
   }
}
