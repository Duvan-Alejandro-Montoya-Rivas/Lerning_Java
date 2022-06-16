
package talleruml;

import java.util.ArrayList;
import java.util.Scanner;

public class Orden_compra{
    private int serial;
    private String fecha_compra;
    private String fecha_envio;
    private String direccion_envio;
    private String empresa_mensajeria;
    private Estado_orden estado_envio;
    private float valor_orden;
    private Pago pago;
    private Cuenta cuenta;
    private ArrayList<Pedido> ped = new ArrayList();

    public Orden_compra(int serial, String fecha_compra, String fecha_envio, String direccion_envio, String empresa_mensajeria, float valor_orden) {
        this.serial = serial;
        this.fecha_compra = fecha_compra;
        this.fecha_envio = fecha_envio;
        this.direccion_envio = direccion_envio;
        this.empresa_mensajeria = empresa_mensajeria;
        this.valor_orden = valor_orden;
        cuenta = new Cuenta();
        Pedido pedi = new Pedido();
    }

    public Orden_compra() {
        cuenta = new Cuenta();
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public String getEmpresa_mensajeria() {
        return empresa_mensajeria;
    }

    public void setEmpresa_mensajeria(String empresa_mensajeria) {
        this.empresa_mensajeria = empresa_mensajeria;
    }
    
    public void orden_compra(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Agregar serial: ");
        this.serial = capturar.nextInt();
        System.out.println("Agregar fecha de compra: ");
        this.fecha_compra = capturar.nextLine();
        System.out.println("Agregar fecha de envio: ");
        this.fecha_envio = capturar.nextLine();
        System.out.println("Agregar direccion de envio: ");
        this.direccion_envio = capturar.nextLine();
        System.out.println("Agregar valor de ordenes: ");
        this.valor_orden = capturar.nextFloat();
        System.out.println("Agregar empresa de mensajeria: ");
        this.empresa_mensajeria = capturar.nextLine();
    }
    
}
