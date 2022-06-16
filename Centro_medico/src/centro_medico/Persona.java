package centro_medico;
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int id;
    private String celular;

    public Persona(String nombre, String apellido, int id, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.celular = celular;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public abstract void imprimir();
}
