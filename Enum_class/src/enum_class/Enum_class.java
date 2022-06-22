package enum_class;

import enum_class.Enum_class.Num_inter.Talla;
import java.util.Scanner;

public class Enum_class {
    public class Num_inter {
    enum Talla{
        SMALL("S"),MEDIUM("M"),LONG("L"),EXTRA_LONG("XL");
        
        private Talla (String abreviatura){ //como esta en privado el constructor, no se puede instanciar
            this.abreviatura = abreviatura;
        }
        private String Tu_abreviatura(){
            return abreviatura;
        }
       private String abreviatura;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la talla seleccionada: (Small;Medium;Long;Extra Long) ");
        String Tu_talla = entrada.next().toUpperCase(); //toUpperCase() hace que todo lo que tu introduzcas por teclado, se comvierta en mayusculas
        Talla la_talla = Enum.valueOf(Talla.class, Tu_talla); //nos ayuda a entrar a metodos de enum, sin instanciarlo, por que el constructor esta en privado
        
        System.out.println("La talla escogida es: "+la_talla);
        System.out.println("Abreviatura: "+ la_talla.Tu_abreviatura());
    }
    
}
