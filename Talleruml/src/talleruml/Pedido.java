
package talleruml;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private String fecha;
    private float valor_pedido;
    private Cuenta cuen;
    private Orden_compra orde;
    private ArrayList<Articulo> arti = new ArrayList();

    public Pedido(int numero, String fecha, float valor_pedido) {
        this.numero = numero;
        this.fecha = fecha;
        this.valor_pedido = valor_pedido;
        cuen = new Cuenta();
        orde = new Orden_compra();
        Articulo art = new Articulo();
        
    }

    public Pedido() {
        cuen = new Cuenta();
        orde = new Orden_compra();
        Articulo art = new Articulo();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(float valor_pedido) {
        this.valor_pedido = valor_pedido;
    }
    
    
}
