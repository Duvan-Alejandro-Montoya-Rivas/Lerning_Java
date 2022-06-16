
package universidad_uan;

public abstract class Persona {
  private  String nombre;
  private int cc;
  private int tel;
    public Persona(String nombre, int cc, int tel) {
        this.nombre = nombre;
        this.cc = cc;
        this.tel = tel;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public  void Imp_NyTel(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Telefono: "+this.tel);
    }
  
}
