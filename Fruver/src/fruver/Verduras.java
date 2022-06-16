package fruver;

public class Verduras extends Productos {
    private String fecha_ing;
    private String tipo;
    private String ciud_orig;
   
    //constructores
    public Verduras(String fecha_ing, String tipo, String ciud_orig, String fecha_venc, String num_lote, int num_unid, int valor_venta, int Valor_compra) {
        super(fecha_venc, num_lote, num_unid, valor_venta, Valor_compra);
        this.fecha_ing = fecha_ing;
        this.tipo = tipo;
        this.ciud_orig = ciud_orig;
    }

    public Verduras() {
    }
    //metodos
    public String getFecha_ing() {
        return fecha_ing;
    }

    public void setFecha_ing(String fecha_ing) {
        this.fecha_ing = fecha_ing;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCiud_orig() {
        return ciud_orig;
    }

    public void setCiud_orig(String ciud_orig) {
        this.ciud_orig = ciud_orig;
    }

    @Override
    public void imprimir() {
        System.out.println("Verduras frescas ");
        System.out.println("Fecha de Ingreso: "+this.fecha_ing);
        System.out.println("Ciudad de origen:"+this.ciud_orig);
        System.out.println("Tipo de Verdura: "+this.tipo);
    }
    
}
