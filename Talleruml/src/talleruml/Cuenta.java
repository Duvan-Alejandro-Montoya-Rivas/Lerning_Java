package talleruml;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
    private String id;
    private Estado_cuenta estado;
    private String fecha_apertura;
    private String fecha_cierre;
    private String sucursal;
    private String direccion_facturacion;
    private ArrayList<Orden_compra> ord_com = new ArrayList();
    private ArrayList<Pedido> ped = new ArrayList();

    public Cuenta(String id, String fecha_apertura, String fecha_cierre, String sucursal, String direccion_facturacion) {
        this.id = id;
        this.fecha_apertura = fecha_apertura;
        this.fecha_cierre = fecha_cierre;
        this.sucursal = sucursal;
        this.direccion_facturacion = direccion_facturacion;
        this.ord_com = new ArrayList(); 
        this.ped = new ArrayList();
        this.estado = estado;
    }

    public Cuenta() {
        this.ord_com = new ArrayList();
        this.ped = new ArrayList();
        this.estado = estado;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public String getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(String fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccion_facturacion() {
        return direccion_facturacion;
    }

    public void setDireccion_facturacion(String direccion_facturacion) {
        this.direccion_facturacion = direccion_facturacion;
    }
    
    public void crear_orden_de_compra(){
        Scanner capturar = new Scanner(System.in);
        Orden_compra ord = new Orden_compra();
        ord.orden_compra();
    }
    
    public void crear_pedido(){
        Scanner capturar = new Scanner(System.in);
        Pedido ped = new Pedido();
        System.out.println("Agregar fecha de pedido: ");
        ped.setFecha(capturar.nextLine());
        System.out.println("Agregar numero de pedido: ");
        ped.setNumero(capturar.nextInt());
        System.out.println("Agregar valor de pedido: ");
        ped.setValor_pedido(capturar.nextFloat());
    }

}
