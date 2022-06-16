package fruver;

public class Empacados extends Productos {
    private String cod_inv;
    private String fecha_emp;
    private String pais_orig;
    //constructores

    public Empacados(String cod_inv, String fecha_emp, String pais_orig, String fecha_venc, String num_lote, int num_unid, int valor_venta, int Valor_compra) {
        super(fecha_venc, num_lote, num_unid, valor_venta, Valor_compra);
        this.cod_inv = cod_inv;
        this.fecha_emp = fecha_emp;
        this.pais_orig = pais_orig;
    }

    public Empacados() {
    }
    //metodos

    public String getCod_inv() {
        return cod_inv;
    }

    public void setCod_inv(String cod_inv) {
        this.cod_inv = cod_inv;
    }

    public String getFecha_emp() {
        return fecha_emp;
    }

    public void setFecha_emp(String fecha_emp) {
        this.fecha_emp = fecha_emp;
    }

    public String getPais_orig() {
        return pais_orig;
    }

    public void setPais_orig(String pais_orig) {
        this.pais_orig = pais_orig;
    }

    @Override
    public void imprimir() {
        System.out.println("Productos empacados");
        System.out.println("Codigo de Invima: "+this.cod_inv);
        System.out.println("Fecha de empaque: "+this.fecha_emp);
        System.out.println("Pais dde origen: "+this.pais_orig);
    }
    
    
}
