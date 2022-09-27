/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

import java.util.ArrayList;

/**
 *
 * @author Juan Montoya}
 */
public class Solucion {
     public static Object[] reportes(ArrayList<Estudiante> grupo) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        Object [] resultado = new Object[5];
        
        double promedio=0;
        for (int i = 0; i < grupo.size(); i++) {
            promedio+= grupo.get(i).getNota();
        }
        String r="";
        String a="";
        double mayor=0;
         for (int i = 0; i < grupo.size(); i++) {
             if(grupo.get(i).getNota()>mayor){
                 a=grupo.get(i).getNombreCompleto();
                 mayor=grupo.get(i).getNota();
             }
         }
         
        double menor=mayor;
        for (int i = 0; i < grupo.size(); i++) {
           if(grupo.get(i).getNota()< menor){
               r=grupo.get(i).getNombreCompleto();//nombre de estudiante de nota menor
               menor=grupo.get(i).getNota();
           }
        }
        
        
        //String primera=Double.toString(promedio/grupo.size());
        resultado[0]=(promedio/grupo.size());
        resultado[1]=r;
        resultado[2]=menor;
        resultado[3]=a;
        resultado[4]=mayor;
        
        
      return resultado;  
    }
}
