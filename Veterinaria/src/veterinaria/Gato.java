/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria ;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Gato extends Veterinaria implements Ingreso {
    private int cast;
    private int sal_cas;
    //constructores

    public Gato(int cast, int sal_cas, String codigo, String nombre, String edad, String raza, String sexo, String nombre_due, String id_due) {
        super(codigo, nombre, edad, raza, sexo, nombre_due, id_due);
        this.cast = cast;
        this.sal_cas = sal_cas;
    }

    public Gato() {
    }
    //metodos

    public int getCast() {
        return cast;
    }

    public void setCast(int cast) {
        this.cast = cast;
    }

    public int getSal_cas() {
        return sal_cas;
    }

    public void setSal_cas(int sal_cas) {
        this.sal_cas = sal_cas;
    }
    private void Castrado(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Es castrado\n 1-si\n 2-no");
        this.cast=entrada.nextInt();
//        if(this.cast==1){
//            System.out.println("Es castrado");
//        }else if(this.cast==2){
//            System.out.println("No es Castrado");
//        }else{
//            System.out.println("Opcion incorrecta");
//        }
        
    }
    private void Sale(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Sale de casa\n 1-si\n 2-no");
        this.sal_cas=entrada.nextInt();
//        if(this.sal_cas==1){
//            System.out.println("Sale de casa");
//            
//        }else if(this.sal_cas==2){
//            System.out.println("No sale de casa");
//        }else{
//            System.out.println("Opcion incorrecta");
//        }
    }

    @Override
    public void imprimirV() {
        if(this.cast==1){
            System.out.println("Es castrado");
        }else if(this.cast==2){
            System.out.println("No es Castrado");
        }else{
            System.out.println("Opcion incorrecta");
        }
        
        if(this.sal_cas==1){
            System.out.println("Sale de casa");
            
        }else if(this.sal_cas==2){
            System.out.println("No sale de casa");
        }else{
            System.out.println("Opcion incorrecta");
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
        System.out.println("nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("edad: ");
        super.setEdad(entrada.nextLine());
        System.out.println("sexo: ");
        super.setSexo(entrada.nextLine());
        System.out.println("raza: ");
        super.setRaza(entrada.nextLine());
        Sale();
        Castrado();
    }

    @Override
    public void Ing() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresar Gato");
        System.out.println("nombre: ");
        super.setNombre(entrada.nextLine());
        System.out.println("edad: ");
        super.setEdad(entrada.nextLine());
        System.out.println("sexo: ");
        super.setSexo(entrada.nextLine());
        System.out.println("raza: ");
        super.setRaza(entrada.nextLine());
        Sale();
        Castrado();
    }
    
}
