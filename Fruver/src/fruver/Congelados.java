package fruver;

public class Congelados extends Productos {
    private String fecha_cog;
    private String temp_man;
    private String lvl_sal;
    //conructores
    public Congelados(String fecha_cog, String temp_man, String lvl_sal, String fecha_venc, String num_lote, int num_unid, int valor_venta, int Valor_compra) {
        super(fecha_venc, num_lote, num_unid, valor_venta, Valor_compra);
        this.fecha_cog = fecha_cog;
        this.temp_man = temp_man;
        this.lvl_sal = lvl_sal;
    }

    public Congelados() {
    }
   //metodos
    public String getFecha_cog() {
        return fecha_cog;
    }

    public void setFecha_cog(String fecha_cog) {
        this.fecha_cog = fecha_cog;
    }

    public String getTemp_man() {
        return temp_man;
    }

    public void setTemp_man(String temp_man) {
        this.temp_man = temp_man;
    }

    public String getLvl_sal() {
        return lvl_sal;
    }

    public void setLvl_sal(String lvl_sal) {
        this.lvl_sal = lvl_sal;
    }

    @Override
    public void imprimir() {
        System.out.println("Productos Congelados");
        System.out.println("Fecha congelados: "+this.fecha_cog);
        System.out.println("Temperatura de Mantenimiento: "+this.temp_man);
        System.out.println("Nivel de Salinidad: "+this.lvl_sal);
    }
    
    
}
