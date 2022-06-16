
package talleruml;

import static java.lang.System.exit;
import java.util.Scanner;


public class Principal {


    public static void main(String[] args) throws InterruptedException {
        Scanner capturar = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Prepago prepago = new Prepago();
        Credito credito = new Credito();
        Cuenta cuenta = new Cuenta();
        int opcion;
        do{
            System.out.println("        Transformacion diagrama UML \n1. Crear un cliente \n2. Crear un pedido \n3. Crear una orden de compra \n4. Pagar una orden de compra \n5. Salir \nOpcion >> ");
            opcion = capturar.nextInt();
            switch(opcion){
                    case 1:
                            cliente.crear_persona();
                            cliente.crear_cuenta();
                            break;
                    case 2:
                            cuenta.crear_pedido();
                            break;
                    case 3:

                            break;
                    case 4: 

                            break;
                    case 5:
                            exit(0);
                            break;
                    default:
                            System.out.println(" Ingrese una opcion valida...\n\n");
                            Thread.sleep(5000);
            }
        }while(opcion != 5);
    }

}
