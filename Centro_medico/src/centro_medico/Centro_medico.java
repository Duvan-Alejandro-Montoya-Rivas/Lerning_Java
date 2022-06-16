package centro_medico;

import java.util.Scanner;

public class Centro_medico {
    public static void main(String[] args) {
       Pacientes p1= new Pacientes();
        Scanner entrada= new Scanner(System.in);
       int op;
       do{
           System.out.println("Bienvenido al Centro de Salud Pijaos"
                   + "¿Que deseas hacer? \n"
                   + "1. Agregar Paciente \n"
                   + "2.Asignar cita \n"
                   + "3.Concsultar Citas \n"
                   + "4.Cancelar Citas \n"
                   + "5.Ver historial \n"
                   + "Ingrese la opción: ");
           op=entrada.nextInt();
           switch(op){
               case 1:
                    p1.EntradaDP();
                   break;
               case 2:
                   break;
               case 3:
                   break;
                   
               case 4:
                   break;
               case 5:
                    p1.imprimir();
                   break;
               default:
                   System.out.println("Op incorrecta: ");
                   break;
           }
       }while(op!=5);
    }
    
}
