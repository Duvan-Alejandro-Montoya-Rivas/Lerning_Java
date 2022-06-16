package ejercicodeclase;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
public class Persona {
    private String nombre;
    private int edad;
    private Cedula cedula;
    private ArrayList <Perro>mascota;//pendeinte de programación
    private ArrayList<Contrato>empresa;
    private Carro carro;
    
    public Persona() {
        cedula= new Cedula();
        carro=new Carro();
        
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cedula= new Cedula();
        carro=new Carro();
        
        
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    private String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private int getEdad() {
        return edad;
    }
    private void setEdad(int edad) {
        this.edad = edad;
    }
   public void entradaDatos(){
       Scanner entrada= new Scanner(System.in);
       this.nombre= Input("Nombre: ");
       this.edad=Integer.parseInt(Input("Edad"));
       Input("Cedula");
       cedula.AgregarCed();
   }
    public void AgregarPerro(){
        String nombre= Input("Nombre de Perro: ");
        int edad= Integer.parseInt(Input("Edad: "));
        String raza= Input("Raza: ");
        String sexo= Input("sexo: ");
        Perro perro=new Perro();
        perro.AgregarDueño();
        mascota.add(perro);       
    }
    public void AgregarContrato(){
        Contrato contrato= new Contrato();
        contrato.AgregarC();
        empresa.add(contrato);
    }
    public void ImprimirCP(){
        String c="";
        for (int i = 0; i < empresa.size(); i++) {
            c+="contrato"+(i+1)+"\n";
            c+="Id: "+empresa.get(i).getId();
            c+="Fecha"+empresa.get(i).getFecha();
            c+="Nombre: "+getNombre();
            c+="edad: "+getEdad();          
        }
        JOptionPane.showMessageDialog(null, c);
    }
    public void ImprimirPerros(){
        String string="";
        for (int i = 0; i < mascota.size(); i++) {
            string+="Perro"+(i+1)+"\n";
            string+="nombre: "+mascota.get(i).getNombre();
            string+="edad: "+mascota.get(i).getEdad();
            string+="sexo: "+mascota.get(i).getSexo();
            string+="Raza: "+mascota.get(i).getRaza();
        }
        JOptionPane.showMessageDialog(null, string);
    }
    public void clearListPerro(){
        mascota.clear();
    }
    public void Agregarcarro(){
        Input("Agregar Persona:");
        entradaDatos();
        carro.AgregarCarro();
    }
}
