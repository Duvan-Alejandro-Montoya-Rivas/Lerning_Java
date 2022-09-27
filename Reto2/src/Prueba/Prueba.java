/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

import java.util.Arrays;

/**
 *
 * @author Juan Montoya}
 */
public class Prueba {
    public static void main(String[] args) {
        String cola[] = {"A0","A1","A2","A3","A4","A5"};
        NewClass prueba = new NewClass(cola);
        prueba.agregarTurnoPerdido();
        System.out.println("Turnos perdidos: "+ Arrays.toString(prueba.getTurnosPerdidos()));
    }
}
