
package Reto4_Carrera;

import java.util.ArrayList;


public class Solucion {
    public static Object[] reporte(ArrayList<Corredor> carrera) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        Object [] solucion = new Object[5];
        double promedio=0;
        for (int i = 0; i < carrera.size(); i++) {
            promedio+=carrera.get(i).getTiempoMeta();
        }
        String nombreM="",NombreMen="";
        double mayor =0;
        for (int i = 0; i < carrera.size(); i++) {
            if(carrera.get(i).getTiempoMeta()>mayor){
                mayor=carrera.get(i).getTiempoMeta();
                nombreM=carrera.get(i).getNombreCompleto();
            }
        }
        
        double menor=mayor;
        for (int i = 0; i < carrera.size(); i++) {
            if(carrera.get(i).getTiempoMeta()<menor){
                menor=carrera.get(i).getTiempoMeta();
                NombreMen=carrera.get(i).getNombreCompleto();
            }
            
        }
        
        
        solucion[0]= (promedio/carrera.size());
        solucion[3]=nombreM;
        solucion[4]=mayor;
        solucion[1]=NombreMen;
        solucion[2]=menor;
        return solucion;
    }
}
