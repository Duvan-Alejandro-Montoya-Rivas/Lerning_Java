package talleruml;

public abstract class Tarjeta_compra {
    private int numero;
    private String fecha_apertura;
    private String fecha_cierre;

    public Tarjeta_compra(int numero, String fecha_apertura, String fecha_cierre) {
        this.numero = numero;
        this.fecha_apertura = fecha_apertura;
        this.fecha_cierre = fecha_cierre;
    }

    public Tarjeta_compra() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    
}
