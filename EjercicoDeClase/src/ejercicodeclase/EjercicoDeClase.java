package ejercicodeclase;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EjercicoDeClase {
         
    public static void main(String[] args) {
         Persona p1= new Persona();
         Empresa emp=new Empresa();
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "1-Agregar persona"
                    + "\n 2-Agregar perro "
                    + "\n 3-agregar contrato "
                    + "\n 4-imprimir contrato Persona"
                    + "\n 5-agregar contrato Empresa  "
                    + "\n 6-imprimir contrato empresa "
                    + "\n 7-imprimir perros"
                    + "\n 8-agregar carro "
                    + "\n 9-salir"
                    + "Escoger opcion: "));
                        
            switch (op){
                    case 1:
                        p1.entradaDatos();
                    break;
                    case 2:
                        p1.AgregarPerro();
                    break;
                    case 3:
                        p1.AgregarContrato();
                    break;
                    case 4:
                        p1.ImprimirCP();
                    break;
                    case 5:
                        emp.AgregarEmp();
                    break;
                    case 6:
                    break;
                    case 7:
                        p1.ImprimirPerros();
                    break;
                    case 8:
                        p1.Agregarcarro();
                    break;
                    case 9:
                       JOptionPane.showInputDialog("Salir man") ;
                    break;
            }
        }while(op!=9);
        
    }
    
}
