/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.Consulta;

import java.util.Scanner;

/**
 *
 * @author Juan Montoya}
 */
public class Main {
    public static void main(String[] args) {
    String consulta;
        try{
            Consulta cn = new Consulta();
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese su Consulta: ");
            consulta=entrada.nextLine();
            cn.setConsulta(consulta);
            cn.Consulta_ejecutar();
            
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
