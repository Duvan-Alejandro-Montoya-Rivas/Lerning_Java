package fruver;

public class Refrigerados extends Productos {
    private String cod_inv;
    private String fecha_env;
    private String temp_man;
    private String ciud_orig;
    //contructores

    public Refrigerados(String cod_inv, String fecha_env, String temp_man, String ciud_orig, String fecha_venc, String num_lote, int num_unid, int valor_venta, int Valor_compra) {
        super(fecha_venc, num_lote, num_unid, valor_venta, Valor_compra);
        this.cod_inv = cod_inv;
        this.fecha_env = fecha_env;
        this.temp_man = temp_man;
        this.ciud_orig = ciud_orig;
    }

    public Refrigerados() {
    }
    //metodos

    public String getCod_inv() {
        return cod_inv;
    }

    public void setCod_inv(String cod_inv) {
        this.cod_inv = cod_inv;
    }

    public String getFecha_env() {
        return fecha_env;
    }

    public void setFecha_env(String fecha_env) {
        this.fecha_env = fecha_env;
    }

    public String getTemp_man() {
        return temp_man;
    }

    public void setTemp_man(String temp_man) {
        this.temp_man = temp_man;
    }

    public String getCiud_orig() {
        return ciud_orig;
    }

    public void setCiud_orig(String ciud_orig) {
        this.ciud_orig = ciud_orig;
    }

    @Override
    public void imprimir() {
        System.out.println("Productos Refrigerados");
        System.out.println("Codigo de Invima: "+this.cod_inv);
        System.out.println("Fecha de envio: "+this.fecha_env);
        System.out.println("Temperatura de mantenimiento: "+this.temp_man);
        System.out.println("Ciudad de origen: "+this.ciud_orig);
    }
    
    
}
