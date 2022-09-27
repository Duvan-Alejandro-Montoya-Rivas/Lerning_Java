package reto2;

import java.util.Arrays;

public class Reto2 {

    public static void main(String[] args) {
        String cola []= {"A0","A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11"};
        TurnoVirtual turno = new TurnoVirtual(cola);
        turno.atenderProximoTurno();
        turno.atenderProximoTurno();
        turno.atenderProximoTurno();
        turno.atenderProximoTurno();
        
        //siguiente
        turno.agregarTurnoPerdido();
        turno.atenderProximoTurno();
        turno.agregarTurnoPerdido();
        turno.atenderProximoTurno();
        turno.agregarTurnoPerdido();
       /*
        turno.cambiarEstadoDeTurno();
        turno.atenderProximoTurno();
        turno.cambiarEstadoDeTurno();
       */
        System.out.println("Turnos: "+Arrays.toString(turno.getTurnos()));
        System.out.println("Turnos Perdidos: "+ Arrays.toString(turno.getTurnosPerdidos()));
        System.out.println("Estado del turno virtual: "+ turno.isEstadoTurnoVirtual());
        System.out.println("Turnos en atencion: "+ turno.getTurnoEnAtencion());
        System.out.println("Turnos Atendidos: "+ turno.getCantidadTurnosAtendidos());
        
    }
    
}
