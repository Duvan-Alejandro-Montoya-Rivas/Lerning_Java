package centro_medico;

import centro_medico.Centro_medico.Citas.Cita;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Centro_medico {
    public class Citas {
        enum Cita{
            G("GENERAL"),D("DENTISTA"),N("NEFROLOGIA");

            private Cita(String seleccion) {
                this.seleccion = seleccion;
            }

            public String getSeleccion() {
                return seleccion;
            }
            
            
            private String seleccion;
        }
   
}
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        ArrayList<Pacientes>pac=new ArrayList <>();
       int op;
       do{
           System.out.println("Bienvenido al Centro de Salud Pijaos"
                   + "¿Que deseas hacer? \n"
                   + "1. Agregar Paciente \n"
                   + "2.Asignar cita \n"
                   + "3.Concsultar Citas \n"
                   + "4.Cancelar Citas \n"
                   + "5.Ver historial \n"
                   + "Ingrese la opcion: ");
           op=entrada.nextInt();
           switch(op){
               case 1:
                   String nombre;
                   String apellido;
                   String celular;
                   int id,edad;
                   Scanner entS = new Scanner(System.in);
                   Scanner entI= new Scanner(System.in);
                   System.out.println("Ingres nombre: ");
                   nombre=entS.nextLine();
                   System.out.println("Ingrese Apellido: ");
                   apellido=entS.nextLine();
                   System.out.println("Ingrese celular: ");
                   celular=entS.nextLine();
                   System.out.println("Ingrese edad: ");
                   edad=entI.nextInt();
                   System.out.println("Ingrese Cedula: ");
                   id=entI.nextInt();
                   pac.add(new Pacientes(nombre,apellido,edad,id,celular));
                   
                   break;
               case 2:
                   String opcion;
                   Scanner ent1=new Scanner(System.in);
                   System.out.println("Seleccione el tipo de cita\n ");
                   System.out.println("G.Medicina General \n"
                           + "D.Salud Oral \n"
                           + "N. Nefrologia\n"
                           + "Ingrese opcion: ");
                   opcion=ent1.next().toUpperCase();
                   Cita tucita= Enum.valueOf(Cita.class, opcion);
                   System.out.println("La cita asignada es: "+tucita.getSeleccion());
                   break;
               case 3:
                   break;
                   
               case 4:
                   break;
               case 5:
                    for (Pacientes paciente : pac){
                        System.out.println(paciente);
                    }
                   break;
               default:
                   System.out.println("Op incorrecta: ");
                   break;
           }
       }while(op!=5);
    }
    
}
