
package RetoDelaClase_2;

public class Persona {
    //Atributos
    private String nombre;
    private int id;
    private String puesto;
    private double salario;
    //Constructor
    public Persona(String nombre, int id, String puesto, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.salario = salario;
    }
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
