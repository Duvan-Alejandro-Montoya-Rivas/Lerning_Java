package calculos_nota;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Estudiante{
        private String nombre;
        private String cod;
        private int [] notas = new int[4];
        public Estudiante() {
            this.cod = cod;
        }

        public String getCod() {
            return cod;
        }

        public void setCod(String cod) {
            this.cod = cod;
        }
        public void AgregarNom() throws Caractares {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese nombre: ");
        nombre = entrada.nextLine();
            if (nombre.length()< 30)
            {
        System.out.println("Agregar codigo: ");
                this.cod = entrada.nextLine();
                agregarNot();
            }
    }
     public void agregarNot() {
        Scanner entrada = new Scanner(System.in);
        float cor1 = (float) 0.2, cort2= (float) 0.25, cort4 = (float) 0.3;
        float def=0;
        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese las notas de semestre "+ i);
                 notas[i]=entrada.nextInt();      
            }
            def= ((notas[0]*20)+(notas[1]*25)+(notas[2]*25)+(notas[3]*30))/100;
            System.out.println("Su definitiva es: "+def);
        } catch (Exception ex) {
            System.out.println("Caracter no valido");
        }
    }

}
