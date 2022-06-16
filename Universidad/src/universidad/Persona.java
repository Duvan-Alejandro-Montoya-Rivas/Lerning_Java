package universidad;

public abstract class Persona {
    private String nombre;
    private String id;
    private String telefono;
    //constructores

    public Persona(String nombre, String id, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }

    public Persona() {
    }
    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public final void imprimirP(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cedula: "+this.id);
        System.out.println("Telefono: "+this.telefono);
    }
    public abstract void imprimir();
    
}
