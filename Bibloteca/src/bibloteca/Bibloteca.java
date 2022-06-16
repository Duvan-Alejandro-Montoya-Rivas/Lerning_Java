
package bibloteca;

import java.util.Scanner;

public class Bibloteca {

    public static void main(String[] args) {
        Revista r1= new Revista ();
        Scanner entrada= new Scanner(System.in);
        System.out.print("Agregar titulo: ");
        r1.setTitulo(entrada.nextLine());
        
    }
    
}
