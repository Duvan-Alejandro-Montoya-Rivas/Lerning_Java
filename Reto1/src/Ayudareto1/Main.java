
package Ayudareto1;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        double ListaNotas[]={
            4.1,4.8,1.5,2.3,0.1,0.9,1.4,1.8,1.5,3.0
        };
        double muestra[]=Solution.reporte(ListaNotas);
        for (int i = 0; i < muestra.length; i++) {
            System.out.println("Pocion"+i+":"+muestra[i]);
        }
    }
}
