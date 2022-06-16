package universidad;

import java.util.Scanner;

public class Estudiante extends Persona implements Acion_estudio{
    //atributos
    private String carrera;
    private int semestre;
    private int materias;
    private double[]notas=new double[4];
   
    //constructores

    public Estudiante(String carrera, int semestre, String nombre, String id, String telefono) {
        super(nombre, id, telefono);
        this.carrera = carrera;
        this.semestre = semestre;
        this.materias= materias;
    }

    public Estudiante() {
        
    }
    
    //metodos

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public void imprimir() {
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Sesmtre: "+this.semestre);
        System.out.println("Materias agregadas: "+this.materias);
    }
    public void AgregarE(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Agregar nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("Agregar Cedula");
        super.setId(entrada.nextLine());
        System.out.println("Agregar Telefono: ");
        super.setTelefono(entrada.nextLine());
        System.out.println("Agregar Carrera: ");
        this.carrera=entrada.nextLine();
        System.out.println("Semestre: ");
        this.semestre=entrada.nextInt();
        Ins_materias();
        C_notas();
    }

    @Override
    public void Ins_materias() {
        int op=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Desea agregar materias");
        System.out.println("1-si");
        System.out.println("2-no");
        op=entrada.nextInt();
        while(op==1){
            System.out.println("materia agregada");
            materias++;
            System.out.println("¿Desea agregas mas materias?");
            System.out.println("1-si");
            System.out.println("2-no \n Ingrese opción:");
            op=entrada.nextInt();
            
        }
        
        
    }
    @Override
    public void C_notas() {
        for(double num: notas){
            System.out.println("Sus notas son: "+num);
        }
    }
    
}
