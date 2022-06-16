package ejercicodeclase;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Empresa {
   private String nombre;
   private int NIT;
   private ArrayList<Contrato>empleado;
    public Empresa(String nombre, int NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
        Contrato contrato=new Contrato();
    }
    public Empresa() {
      Contrato contrato=new Contrato();  
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNIT() {
        return NIT;
    }
    private void setNIT(int NIT) {
        this.NIT = NIT;
    }
   public void Agregar(){
       this.nombre=Input("nombre: ");
       this.NIT=Integer.parseInt(Input("Nit:"));
   }
   public void AgregarEmp(){
       Contrato contrato=new Contrato();
       contrato.AgregarC();
       empleado.add(contrato);
   }
   
}
