/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ayudareto1;

/**
 *
 * @author Juan Montoya}
 */
public class Solution {
    public static double [] reporte(double listaNotas[]){
        double [] Almacenamiento = new double[3];
        double suma=0;
        for (int i = 0; i < listaNotas.length; i++) {
            suma += listaNotas[i];  //1,2,1,3,4 =  1+2+3+4=10
        }
        
        double mayor =0;
        for (int i = 0; i < listaNotas.length; i++) {
            if(listaNotas[i]>mayor){//3 > mayor =3
                mayor=listaNotas[i];
            }
        }
        double menor = mayor;   //1,2,1,3,4
        for (int i = 0; i < listaNotas.length; i++) {
            if(listaNotas[i]<menor){  //4<menor= 1
                menor =listaNotas[i];
            }
        }
        
        Almacenamiento[0]=(suma/listaNotas.length);
        Almacenamiento[1]=menor;
        Almacenamiento[2]=mayor;
        return Almacenamiento;
    }
            
}
