package veterinaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vet {

    public static void main(String[] args) {
        Animal [] anim= new Animal[3];
        Animal anim1 =new Animal();
        Perro [] per=new Perro[3];
        Perro per1=new Perro();
        Gato [] cat= new Gato[3];
        Gato cat1= new Gato();
        int op;
        Scanner entrada=new Scanner (System.in);
        System.out.println("1- registrar Perro\n 2- Registrar gato \n 3- Ingresar Animal \n 4- ingresar Perro \n 5- ingresar\n 6- imprimir Gato Escoge la opcion:");
        
        try{
            op=entrada.nextInt();
        
            switch(op){
                case 1: {
            for (int i = 0; i < per.length; i++) {
                    per[i]=per1;
                    per[i].reg_animal();           
                }
            }break;
                
                case 2: {
                for (int i = 0; i < cat.length; i++) {
                    cat[i]=cat1;
                    cat[i].reg_animal();
                    
                }
            }break;
                case 3 :{
                for (int i = 0; i < anim.length; i++) {
                    anim[i]=anim1;
                    anim[i].reg_animal();
                    
                }
            }break;
                case 4: {
                for (int i = 0; i < per.length; i++) {
                    per[i]=per1;
                    per[i].Ing();
                    
                }
            }break;
                case 5: {
                for (int i = 0; i < cat.length; i++) {
                    cat[i]=cat1;
                    cat[i].Ing();
                    
                }
            }break;
                case 6: {
                    
                }break;
    }
            
        
     
        }
        catch(InputMismatchException ex){
            System.out.println("Opción incorrecta...");
            System.out.println("Intente de nuevo");
            
        
        } 
    }  
    
}
