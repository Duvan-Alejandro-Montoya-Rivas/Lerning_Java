package calculos_nota;

import java.util.Scanner;

public class Calculos_nota {
    
    public static void main(String[] args) throws Caractares {
        Estudiante est = new Estudiante();
        Scanner entrada = new Scanner(System.in);
        int op=0;
        System.out.println("1.ingresar nombre de estudiante \n"
                + "2.Ingresar notas \n"
                + "Ingrese la opción a escoger: ");
        op=entrada.nextInt();
        if(op==1){
            est.AgregarNom();
        }
        if(op==2){
            est.agregarNot();
        }
    }
    
}
