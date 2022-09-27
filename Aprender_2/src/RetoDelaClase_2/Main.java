/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetoDelaClase_2;

import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Montoya}
 */
public class Main {
    public static void main(String[] args) {
        /*ArrayList <Persona> arreglo_dePersonas = new ArrayList();
        Persona Jose = new Persona ("Jose",1213231,"Administrativo",1000000.0);
        arreglo_dePersonas.add(Jose);
        //arreglo_dePersonas.add(new Persona("Jose",1213231,"Administrativo",1000000.0));*/
        ArrayList <Double> p = new ArrayList();
        int a []={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int b[][]= new int[4][4];
        int cont;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(i==0){
                    b[i][j]= a[j];  
                }else if( i==1){
                    b[i][j]= a[j+4];
                }else if(i==2){
                    b[i][j]= a[j+8];
                }else if (i==3){
                    b[i][j]= a[j+12];
                }
            }  
        }
        
        for (int c[]: b){
            for(int n: c){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
