/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto3;

/**
 *
 * @author Juan Montoya}
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Preferencial tiq_perf1 = new Preferencial("0123","Juan Perez","Cl 01 CR 02-03");
        VIP tiq_vip1 = new VIP ("5434","MariaLopez","CR29 CL 26-27");
        
        tiq_perf1.generarCredenciales();
        tiq_perf1.participarSorteo();
        System.out.println("ID del tiquete: "+ tiq_perf1.getIdTiquete());
        System.out.println("Nombre del cliente: "+tiq_perf1.getNombreCompleto());
        System.out.println("Direccion: "+tiq_perf1.getDireccionResidencia());
        System.out.println("Credenciales del cliente: "+tiq_perf1.getCredenciales());
        System.out.println("Desea participar en el sorteo?: "+tiq_perf1.isParticipaSorteo());
    }
    
}
