
package solucion;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan Montoya}
 */
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int E, A, Matriz [][];
        
        double p, res;
        double Prob[];
        String a;
        ArrayList<Double>resultado = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        Scanner q = new Scanner(System.in);
        System.out.println("Ingrese cantidad de estados: ");
        E=entrada.nextInt();
        System.out.println("Ingrese cantidad de Anternativas: ");
        A=entrada.nextInt();
        Prob= new double[E];
        for (int i = 0; i < Prob.length; i++) {
            System.out.println("Ingrese la probabilidad: ");
            a=q.nextLine();
            p=parseDouble(a);
            Prob[i]=p;
        }
        
        
        Matriz= new int[A][E];
        Scanner entrada1 = new Scanner(System.in);
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < E; j++) {
                System.out.println("Pocicion ["+i+"]"+"["+j+"]: ");
                Matriz[i][j]= entrada1.nextInt();
            } 
        }
        int w;
        for (int i = 0; i < Matriz.length; i++) {
            res=0;
            for (int j = 0; j < Matriz.length; j++) {
                res+=Matriz[i][j]*Prob[j];
            }
            
            resultado.add(res);
        } 
        System.out.println("===================");
        resultado.forEach(itemsList->{
            System.out.println(itemsList);
        });
       double mayor = resultado.get(0);
        for (int i = 0; i < resultado.size(); i++) {
           if(mayor < resultado.get(i)){
               mayor=resultado.get(i);
           }
        }
        int cont = 0;
        for (int i = 0; i < resultado.size(); i++) {
            if(resultado.get(i)== mayor){
                cont = i +1;
            }
            
        }
        
        System.out.println(cont + " "+ mayor);*/
        
        int A = 0,E = 0, con1=0;
        double con =0;
        ArrayList<Double>prob = new ArrayList();
        ArrayList<Double>res = new ArrayList();
        String cad1, cad2;
        Scanner entrada = new Scanner(System.in);
        cad1=entrada.nextLine();
        cad2=entrada.nextLine();
        String[] srt1 = cad1.split(" ");
        String[]srt2 = cad2.split(" ");
        E= Integer.valueOf(srt1[0]);
        A= Integer.valueOf(srt1[1]);
        for (int i = 2; i < srt1.length; i++) {
            con= Double.valueOf(srt1[i]);
            prob.add(con);
        }
        int matriz [][]= new int [E][A];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=Integer.valueOf(srt2[con1]);
                con1++;
            }  
        }
        for (int i = 0; i < E; i++) {
            con=0;
            for (int j = 0; j < A; j++) {
                con+=matriz[i][j]*prob.get(j);
            }
            res.add(con);
        }
        con = res.get(0);
        for (int i = 0; i < res.size(); i++) {
           if(con < res.get(i)){
               con=res.get(i);
           }
        }
        con1=(int)con;
        for (int i = 0; i < res.size(); i++) {
            if(res.get(i)== con){
                E = i +1;
            }
        }
        System.out.println(E +" "+con1);
    }
    
}
