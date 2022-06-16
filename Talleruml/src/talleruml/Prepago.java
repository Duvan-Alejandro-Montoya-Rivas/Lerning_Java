
package talleruml;

import java.util.Scanner;


public class Prepago extends Tarjeta_compra{
    private float saldo;

    public Prepago(float saldo, int numero, String fecha_apertura, String fecha_cierre) {
        super(numero, fecha_apertura, fecha_cierre);
        this.saldo = saldo;
    }

    public Prepago() {
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void saldo_ingresar(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingresar cantidad: ");
        this.saldo = capturar.nextFloat();
    }
    
}
