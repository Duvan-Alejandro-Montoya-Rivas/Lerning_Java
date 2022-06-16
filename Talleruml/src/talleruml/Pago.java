
package talleruml;


public class Pago {
    private int id;
    private String fecha_pago;
    private String detalles;

    public Pago(int id, String fecha_pago, String detalles) {
        this.id = id;
        this.fecha_pago = fecha_pago;
        this.detalles = detalles;
    }

    public Pago() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
}
