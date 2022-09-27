/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ayudareto2;

import java.util.Arrays;

/**
 *
 * @author Juan Montoya}
 */
public class Main {
    public static void main(String[] args) {
        String cola []={
            "A0","A1","A2","A3","A4","A5","A6","A7","A8","A9",
            "A10","A11"
        };
        TurnoVirtual turnoVirtual1= new TurnoVirtual(cola);
        turnoVirtual1.atenderProximoTurno();
turnoVirtual1.atenderProximoTurno();
turnoVirtual1.atenderProximoTurno();
turnoVirtual1.atenderProximoTurno();

        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        
        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();


        
        System.out.println("Turnos: "+Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.println("Turnos Perdidos: "+Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.println("Estado del Turno Virtual: "+turnoVirtual1.isEstadoTurnoVirtual());
        System.out.println("Turno en Atencion: "+turnoVirtual1.getTurnoEnAtencion());
        System.out.println("Cantidad de turnos atendidos: "+turnoVirtual1.getCantidadTurnosAtendidos());
    }
}
