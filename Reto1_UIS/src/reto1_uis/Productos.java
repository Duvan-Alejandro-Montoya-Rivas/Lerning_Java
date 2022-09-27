/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1_uis;

public class Productos {
   public float calcularCostoAlmacenamiento(boolean refrigerado, float valorBase){
       if(refrigerado == true){
           valorBase *=1.3; 
       }
       else{
           valorBase *=1.15;
       }
       return valorBase;
   } 
}
