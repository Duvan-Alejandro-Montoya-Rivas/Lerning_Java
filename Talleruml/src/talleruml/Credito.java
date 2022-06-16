
package talleruml;

import java.util.Scanner;


public class Credito extends Tarjeta_compra{
    private float cupo = 2500000;
    private float saldo = 500000;

    public Credito(float cupo, float saldo, int numero, String fecha_apertura, String fecha_cierre) {
        super(numero, fecha_apertura, fecha_cierre);
        this.cupo = cupo;
        this.saldo = saldo;
    }

    public Credito() {
        
    }

    public float getCupo() {
        return cupo;
    }

    public void setCupo(float cupo) {
        this.cupo = cupo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void credito(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Su saldo actual es: "+this.saldo);
        System.out.println("Su cupo actual es: "+this.cupo);
    }
}