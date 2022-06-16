package centro_medico;

import java.util.Scanner;

public class Pacientes extends Persona {
    private int edad;

    public Pacientes(int edad, String nombre, String apellido, int id, String celular) {
        super(nombre, apellido, id, celular);
        this.edad = edad;
    }

    public Pacientes() {
        
    }

    private int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }
    public void EntradaDP(){
        Scanner entrada= new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);
        System.out.println("Agregar Nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("Agregar Apellido: ");
        super.setApellido(entrada.nextLine());
        System.out.println("Agregar Edad: ");
        this.edad= entrada.nextInt();
        System.out.println("Agregar Cedula: ");
        super.setId(entrada.nextInt());
        System.out.println("Agregar Celular:");
        super.setCelular(ent1.nextLine());       
    }
    @Override
    public void imprimir() {
        System.out.println("Datos de paciente"
                + "\n Nombre: "+super.getNombre()
                + "\n Apellido: "+super.getApellido()
                + "\n Edad: "+this.edad
                + "\n Cedula: "+super.getId()
                + "\n Celular: "+super.getCelular());
    }
    
}
