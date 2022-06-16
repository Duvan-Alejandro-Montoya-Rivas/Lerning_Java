package ejercicodeclase;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Perro {
  private String nombre;
  private String raza;
  private String sexo;
  private int edad;
  private Persona dueno;

    public Perro(String nombre, String raza, String sexo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        dueno=new Persona();
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public Perro() {
        dueno=new Persona();
    }

    String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    private void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }
    public void AgregarDueño(){
        Input("agregar nueño \n"+"agregar datos del dueño");
        dueno.entradaDatos();      
        this.nombre=Input("Agregar perro \n"+"Nombre: ");
        this.edad=Integer.parseInt(Input("edad: "));
        this.raza=Input("raza: ");
        this.sexo=Input("sexo: ");
    }
    public void ImprimirP(){
        Input("Nombre: "+this.nombre);
        Input("Edad: "+this.edad);
        Input("Sexo: "+this.sexo);
        Input("Raza: "+this.raza);
    }
}
