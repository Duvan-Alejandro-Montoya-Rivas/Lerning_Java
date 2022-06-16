package poo;

public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String cc;
    private int edad;
    private Mascota perro;
    //constructores

    public Persona(String nombre, String apellido, String cc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.edad=edad;
    }
    public Persona(){
        
   }
   //metodos

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

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    private void agregarM(Mascota perro){
       this.perro = new  Mascota();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cc=" + cc + ", edad=" + edad + ", perro=" + perro + '}';
    }
    
}
