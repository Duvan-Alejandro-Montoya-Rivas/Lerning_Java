package principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        ListaDeNumeros lista1 = new ListaDeNumeros();
        int opcion;
        do {
            System.out.println("          Taller con Archivos\n"
                    + "1. Ingresar datos\n"
                    + "2. Leer lista\n"
                    + "3. Salir\n"
                    + "Opcion: ");
            opcion = capturar.nextInt();
            switch (opcion) {
                case 1:
                    lista1.EscribirLista();
                    break;
                case 2:
                    lista1.LeerLista();
                    break;
                case 3:
                    break;
            }
        }while(opcion != 3);
    }  
}
