package ejercicodeclase;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Carro {
   private String marca;
   private String tipo;
   private int modelo;

    public Carro(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
   
    public Carro() {
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private int getModelo() {
        return modelo;
    }

    private void setModelo(int modelo) {
        this.modelo = modelo;
    }
   public void AgregarCarro(){
       this.marca=Input("Agrgar carro: "
               + "Marca: ");
       this.tipo=Input("Tipo: ");
       this.modelo=Integer.parseInt(Input("Modelo: "));
   }
}
