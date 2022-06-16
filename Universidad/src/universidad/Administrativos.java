package universidad;

import java.util.Scanner;

public class Administrativos extends Persona implements Acion_estudio, Trabajar{
  private String profesion;
  private String dependencia;
  private String cargo;
  private int materias;
  private double []notas=new double[4];
  
  //constructores

    public Administrativos(String profesion, String dependencia, String cargo, String nombre, String id, String telefono) {
        super(nombre, id, telefono);
        this.profesion = profesion;
        this.dependencia = dependencia;
        this.cargo = cargo;
        this.materias=materias;
    }

    public Administrativos() {
       
    }
    
  //metodos

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimir() {
        System.out.println("Profesion: "+this.profesion);
        System.out.println("Dependencia: "+this.dependencia);
        System.out.println("Cargo: "+this.cargo);
    }
    public void AgregarA(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Agregar nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("Agregar Cedula");
        super.setId(entrada.nextLine());
        System.out.println("Agregar Telefono: ");
        super.setTelefono(entrada.nextLine());
        System.out.println("Agregar Profesion: ");
        this.profesion=entrada.nextLine();
        System.out.println("Agregar Dependencia ");
        this.dependencia=entrada.nextLine();
        System.out.println("Agregar el cargo: ");
        this.cargo=entrada.nextLine();
    }

    @Override
    public void Ins_materias() {
        int op=0;
        System.out.println("Desea agregar materias");
        System.out.println("1-si");
        System.out.println("2-no");
        while(op==1){
            System.out.println("materia agregada");
            materias++;
            System.out.println("¿Desea agregas mas materias?");
            System.out.println("1-si");
            System.out.println("2-no");
            trabajar();
            C_estudiantes() ;
            C_notas();
        }
    }

    @Override
    public void C_notas() {
        for(double num: notas){
            System.out.println("Sus notas son: "+num);
        }
    }

    @Override
    public void C_estudiantes() {
        System.out.println("Consulta de estudiantes: ");
        
    }

    @Override
    public void trabajar() {
        System.out.println("Trabajando en la universidad");
    }
  
}
