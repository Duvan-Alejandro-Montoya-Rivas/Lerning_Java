/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_UIS;

public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;
    private String laboratorio;
    private boolean cotizante;

    public Producto(String nombre, String codigo, String categoria, String laboratorio, boolean cotizante) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.laboratorio = laboratorio;
        this.cotizante = cotizante;
    }
    
    public float costo(){
        float costos;
       if(this.cotizante == true){
           costos = 3500;
       }else{
           costos=14000;
       }
       return costos;
    }
    
    public void info(){
        System.out.println("Aca va todo el codigo que muestra");
    }
}
