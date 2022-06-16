package universidad;

import java.util.Scanner;

public class Profesor extends Persona implements Trabajar{
    //atributos
    private String profesión;
    private String facultad;
    private int Vin;
    private double [] notas= new double[4];
    
    //contructores

    public Profesor(String profesión, String facultad, int Vin, String nombre, String id, String telefono) {
        super(nombre, id, telefono);
        this.profesión = profesión;
        this.facultad = facultad;
        this.Vin = Vin;
        
    }

    public Profesor() {
        
    }
    //metodos

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getVin() {
        return Vin;
    }

    public void setVin(int Vin) {
        this.Vin = Vin;
    }

    @Override
    public void imprimir() {
        System.out.println("Prfesión: "+this.profesión);
        System.out.println("Facultad: "+this.facultad);
        System.out.println("Vinculación: "+this.Vin);
    }
    public void AgregarP(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Agregar nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("Agregar Cedula");
        super.setId(entrada.nextLine());
        System.out.println("Agregar Telefono: ");
        super.setTelefono(entrada.nextLine());
        System.out.println("Agregar Profesion: ");
        this.profesión=entrada.nextLine();
        System.out.println("Agregar Facultad: ");
        this.facultad=entrada.nextLine();
        trabajar(); 
        Agregarnotas();
    }

    @Override
    public void C_estudiantes() {
        System.out.println("Consulta de estudiantes ");
    }

    @Override
    public void trabajar() {
        Scanner entrada= new Scanner (System.in);
        System.out.println("Trabaja en la universidad");
        System.out.println("Agregar la vinculación(1- Catedra, 2- medio tiempo, 3- tiempo completo)");
        this.Vin=entrada.nextInt();
        if(this.Vin==1)
        {
            System.out.println("Catedra");
        }else if(this.Vin==2){
            System.out.println("Medio tiempo");
        }else if(this.Vin==3){
            System.out.println("Tiempo completo");
        }
    }
    private void Agregarnotas(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Agregar notas: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i]=entrada.nextDouble();
        }
    }
    
}
