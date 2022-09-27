/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

/**
 *
 * @author Juan Montoya}
 */
public class Loco {
    
   
    /*public static int [] reporte(int [] participantes){
        int [] devuelta = new int[3];
        int cont = 0;
        for (int i = 0; i < participantes.length; i++) {
            cont++;
        }
        int mayor = 0;
        for (int i = 0; i < participantes.length; i++) {
            if(participantes[i]>mayor){// 1 mayor =0   1>0
                mayor = participantes[i];
            }
        }
        
        
        
        
        int menor;
        menor=mayor;
        for (int i = 0; i < participantes.length; i++) {
            if(participantes[i]<menor){
                menor=participantes[i];
            }
            
        }
        devuelta[0]=cont;//la cantidad de participantes
        devuelta[1]=menor; //el tuvo el menor tiempo ó el ganador
        devuelta[2]=mayor;// el ultimo en llegar
        
        return devuelta;
    }*/
    
    public static double[] reporte(double[] listaNotas) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        double lista[]=new double[3];
        int cont=0;
        for (int i=0;i<listaNotas.length;i++){
            cont++;
        }
        double resPromedio=0;
        for (int i = 0; i < listaNotas.length; i++) {
            resPromedio = (listaNotas[i]/cont);
            
        }
        double Mayor=0,Menor;
            
            Mayor = Menor= listaNotas[0];
            for (int i=0;i<listaNotas.length;i++){
                if(listaNotas[i]>Mayor){//8 > 10     mayor =listanumeros[6]{8}   
                Mayor = listaNotas[i];
                }
                if (listaNotas[i]<Menor){
                Menor=listaNotas[i];
                }
               
            }
            double[] Lista={resPromedio,Mayor,Menor};
            return Lista;

        }
}
