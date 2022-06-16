package fruver;

public abstract class Productos {
    private String fecha_venc;
    private String num_lote;
    private int num_unid;
    private int valor_venta;
    private int Valor_compra;
    //constructores

    public Productos(String fecha_venc, String num_lote, int num_unid, int valor_venta, int Valor_compra) {
        this.fecha_venc = fecha_venc;
        this.num_lote = num_lote;
        this.num_unid = num_unid;
        this.valor_venta = valor_venta;
        this.Valor_compra = Valor_compra;
        
    }
    

    public Productos() {
    }
    
    //metodos
    public String getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(String fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public int getNum_unid() {
        return num_unid;
    }

    public void setNum_unid(int num_unid) {
        if(this.num_unid>0) {
            this.num_unid = num_unid;
        } else {
            System.out.println("No existe esta cantidad de unidades");
        }
    }

    public int getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(int valor_venta) {
        this.valor_venta = valor_venta;
    }

    public int getValor_compra() {
        return Valor_compra;
    }

    public void setValor_compra(int Valor_compra) {
        this.Valor_compra = Valor_compra;
    }
    public abstract void imprimir();
    public void imprimirP(){
        System.out.println("Fecha vencimiento: "+this.fecha_venc);
        System.out.println("Numero de lote: "+this.num_lote);
        System.out.println("Unidades disponibles: "+this.num_unid);
        System.out.println("Valor de venta: "+this.valor_venta);
    }
    
}
