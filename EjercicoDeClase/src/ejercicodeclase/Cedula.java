package ejercicodeclase;
import java.util.Scanner;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cedula {
    private String nombre;
    private Date fehca_nac;
    private Date fecha_exp;
    private int num;
    public Cedula() {
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    public Cedula(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void AgregarCed(){
        this.nombre=Input("Agregar nombre: ");
        this.num=Integer.parseInt(Input("Numero de Cedula: "));
    }
    
}
