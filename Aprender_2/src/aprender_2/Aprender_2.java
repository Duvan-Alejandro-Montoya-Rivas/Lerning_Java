
package aprender_2;

import java.util.Scanner;

public class Aprender_2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo_empleados [] = new double[3]; // 0,1,2
        for (int i = 0; i < sueldo_empleados.length; i++) { //1,2,3
            System.out.println("Ingrese el sueldo del empleado: ");
            sueldo_empleados[i] = entrada.nextDouble();
        }
    }
    
}
