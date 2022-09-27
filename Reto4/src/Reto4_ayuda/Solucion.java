/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4_ayuda;

import java.util.ArrayList;

/**
 *
 * @author Juan Montoya}
 */
public class Solucion {
    public static Object[] reportes(ArrayList<Estudiante>grupo){
        Object[] retorno = new Object[5];
        double promedio=0;
        for (int i = 0; i < grupo.size(); i++) {
            promedio +=grupo.get(i).getNota();   
        }
        String nombreMa="";
        String nombreMeno="";
        double  menor=0;
        for (int i = 0; i < grupo.size(); i++) {
            if(grupo.get(i).getNota()>menor){
                menor= grupo.get(i).getNota();
                nombreMeno= grupo.get(i).getNombrecompleto();
            } 
        }
        
        double mayor=menor;
        for (int i = 0; i < grupo.size(); i++) {
            if(grupo.get(i).getNota()<mayor){
                mayor = grupo.get(i).getNota();
                nombreMa=grupo.get(i).getNombrecompleto();
            } 
        }
        retorno[0]=(promedio/grupo.size());
        retorno[1]=nombreMa;
        retorno[2]=mayor;
        retorno[3]=nombreMeno;
        retorno[4]=menor;
        
        return retorno;
    }
}
