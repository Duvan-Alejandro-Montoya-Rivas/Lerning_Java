package ejercicodeclase;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Contrato {
  private String fecha;
private int id;
private Persona empleado;
private Empresa empresa;
    
    public Contrato(){
        empleado= new Persona();
        empresa= new Empresa();
    }   
    public Contrato(String fecha, int id) {
        this.fecha = fecha;
        this.id = id;
        empleado= new Persona();
        empresa= new Empresa();
    }
    private String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    public String getFecha() {
        return fecha;
    }
    private void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public void AgregarC(){
        this.id=Integer.parseInt(Input("Contrato \n"+"Datos de contrato \n"+"Numero de contrato: "));
        this.fecha=Input("\n Fecha de contrato: ");
        Input(" \n Datos de empresa");
        empresa.Agregar();
        Input("\n Agregar empleado: ");
        empleado.entradaDatos();    
    }
    
}
