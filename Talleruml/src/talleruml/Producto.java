
package talleruml;

public class Producto {
    private int codigo;
    private String nombre;
    private float valor;

    public Producto(int codigo, String nombre, float valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public void Product(){
        
    }
    
}
