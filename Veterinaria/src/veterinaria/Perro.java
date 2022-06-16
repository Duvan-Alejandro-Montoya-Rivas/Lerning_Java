/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Perro extends Veterinaria implements Ingreso{
    private int ped;
    private int Actividad;

    public Perro(int ped, int Actividad, String codigo, String nombre, String edad, String raza, String sexo, String nombre_due, String id_due) {
        super(codigo, nombre, edad, raza, sexo, nombre_due, id_due);
        this.ped = ped;
        this.Actividad = Actividad;
    }

    public Perro() {
    }
    
    //metodos

    public int isPed() {
        return ped;
    }

    public void setPed(int ped) {
        this.ped = ped;
    }

    public int isActividad() {
        return Actividad;
    }

    public void setActividad(int Actividad) {
        this.Actividad = Actividad;
    }
    private void Ped(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Tiede pedegree? \n 1-si \n 2-no");
        this.ped= entrada.nextInt();
//        if(this.ped==1){
//            System.out.println("Tiene pedegree");
//        }else if(this.ped==2){
//            System.out.println("No tiene pedegree");
//        }else{
//            System.out.println("Dato equivocado");
//        }
        
    }
    private void Activ(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Nivel Actividad \n 1- Alto \n 2- medio \n 3-bajo");
        this.Actividad=entrada.nextInt();
//        if(this.Actividad==1){
//            System.out.println("Alto");
//        }else if(this.Actividad==2){
//            System.out.println("Medio");
//        }else if(this.Actividad==3){
//            System.out.println("Bajo");
//        }else{
//            System.out.println("No existe");
//        }
    }

    @Override
    public void imprimirV() {
       if(this.ped==1){
            System.out.println("Tiene pedegree");
        }else if(this.ped==2){
            System.out.println("No tiene pedegree");
        }else{
            System.out.println("Dato equivocado");
        }
       if(this.Actividad==1){
            System.out.println("Alto");
        }else if(this.Actividad==2){
            System.out.println("Medio");
        }else if(this.Actividad==3){
            System.out.println("Bajo");
        }else{
            System.out.println("No existe");
        }
       
    }

    @Override
    public void reg_animal() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Registrar animal\n Agregue el ");
        System.out.println("nombre del dueño");
        super.setNombre_due(entrada.nextLine());
        System.out.println("Cedula del dueño: ");
        super.setId_due(entrada.nextLine());
        System.out.println("nombre Animal: ");
        super.setNombre(entrada.nextLine());
        System.out.println("edad: ");
        super.setEdad(entrada.nextLine());
        System.out.println("sexo: ");
        super.setSexo(entrada.nextLine());
        System.out.println("raza: ");
        super.setRaza(entrada.nextLine());
        Activ();
        Ped();
    }

    @Override
    public void Ing() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresar Perro");
        System.out.println("nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("edad: ");
        super.setEdad(entrada.nextLine());
        System.out.println("sexo: ");
        super.setSexo(entrada.nextLine());
        System.out.println("raza: ");
        super.setRaza(entrada.nextLine());
        Activ();
        Ped();
        
    }
    
    
    
}
