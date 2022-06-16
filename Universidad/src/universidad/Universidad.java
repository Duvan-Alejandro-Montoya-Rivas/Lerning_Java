
package universidad;

import static java.lang.System.exit;
import java.util.Scanner;

public class Universidad {

    public static void main(String[] args) {
       Estudiante []est=new Estudiante[3];
        Estudiante est1=new Estudiante();
       
//       Estudiante est1=new Estudiante ();
       Profesor []prof=new Profesor[3];
       Administrativos[]admin=new Administrativos[3];
        Administrativos admin1=new Administrativos();
       int op=0;
       Scanner entrada=new Scanner(System.in);
               do{
            System.out.println("Desea agregar  "+"\n"+"\n"+ "1-estudiante"+"\n"+"2-profesor"+"\n"+"3-Administrativo"+"\n"+"4-imprimir Datos basicos \n + 5-imprimir todos los datos \n 6-salir \n "+"ingrese la opcion: ");
            op=entrada.nextInt();

            switch (op){
                
                case 1:{for (int i = 0; i < est.length; i++) {         
                  est[i]=est1;
                  est[i].AgregarE();
                }
              }break;
                case 2:{
                  for (int i = 0; i < prof.length; i++) {
                   Profesor prof1=new Profesor();
                   prof[i]=prof1;
                   prof[i].AgregarP();
                  
                }
                        
            }break;
                case 3:{
                for (int i = 0; i < admin.length; i++) {
                    admin[i]=admin1;
                    admin[i].AgregarA();
                    
                }
            }break;
                case 4: {
                    System.out.println("1-Imprimir datos de estudiante \n 2- imprimir datos de Profesor\n 3-imprimir datos de Administrativo\n 4-salr");
                    op=entrada.nextInt();
                    do{
                        switch(op){
                            case 1:{
                               for (int i = 0; i < est.length; i++) {
                                est[i].imprimirP();   
                                }
                            }break;
                            case 2:{
                                for (int i = 0; i < prof.length; i++) {
                                 prof[i].imprimirP();   
                                }
                            }break;
                            case 3:{
                                for (int i = 0; i < admin.length; i++) {
                                admin[i].imprimirP();
                                }
                            }break;
                            default:{
                                System.out.println("Salir");
                            }
                        }
                    }while(op!=4);               
            }break;
                case 5: {
                    System.out.println("1-Imprimir datos de estudiante \n 2- imprimir datos de Profesor\n 3-imprimir datos de Administrativo\n 4-salr");
                    op=entrada.nextInt();
                    do{
                    switch(op){
                        case 1:{
                               for (int i = 0; i < est.length; i++) {
                                est[i].imprimirP();
                                est[i].imprimir();
                               }
                            }break;
                        case 2:{
                            for (int i = 0; i < prof.length; i++) {
                                prof[i].imprimirP();
                                prof[i].imprimir();
                            }
                        }break;
                        case 3:{
                             for (int i = 0; i < admin.length; i++) {
                                    admin[i].imprimirP();
                                    admin[i].imprimir();
                    
                                }
                        }break;
                        default:{
                            System.out.println("Salir");
                        }break;
                            
                        }
                    }while(op!=4);
                
            }break;
                
                case 6:{
                System.out.println("Salir");
            }break;
            }
        }while(op!=6);
        
    }
    
}
