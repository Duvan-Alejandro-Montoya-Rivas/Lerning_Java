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
public class Animal extends Veterinaria  {
    private String tip_animal;

    public Animal(String tip_animal, String codigo, String nombre, String edad, String raza, String sexo, String nombre_due, String id_due) {
        super(codigo, nombre, edad, raza, sexo, nombre_due, id_due);
        this.tip_animal = tip_animal;
    }
    public Animal() {
    }
    //metodos

    public String getTip_animal() {
        return tip_animal;
    }

    public void setTip_animal(String tip_animal) {
        this.tip_animal = tip_animal;
    }

    @Override
    public void imprimirV() {
        System.out.println("Animal es:"+this.tip_animal);
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
        System.out.println("Tipo de animal: ");
        this.tip_animal=entrada.nextLine();        
    }
    
    
    
}
