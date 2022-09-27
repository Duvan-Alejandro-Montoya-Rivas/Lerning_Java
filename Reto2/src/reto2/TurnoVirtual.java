/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.ArrayList;

/**
 *
 * @author Juan Montoya}
 */
import java.util.ArrayList;
import java.util.Arrays;
public class TurnoVirtual {
    private String turnos [];
    private String turnosPerdidos[]  ;
    private boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion =0;
    private int cantidadDeTurnosAtendidos = 1;
    public TurnoVirtual(String turno[]){
        this.turnos= turno;
        this.turnosPerdidos = new String[turno.length];
        /*for (int i = 0; i < this  .turnosPerdidos.length; i++) {
            this.turnosPerdidos [i] =" ";
            
        }*/
        Arrays.fill(turnosPerdidos, " ");
    }

    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }
    
    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadDeTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadDeTurnosAtendidos) {
        this.cantidadDeTurnosAtendidos = cantidadDeTurnosAtendidos;
    }
    
    public void atenderProximoTurno(){
        if(this.estadoTurnoVirtual == true){
            this.turnoEnAtencion++;
            this.cantidadDeTurnosAtendidos ++;
        }
        
    }
    
    public void cambiarEstadoTurno(){
        if(this.estadoTurnoVirtual == true){
            this.estadoTurnoVirtual = false;
        }else{
            this.estadoTurnoVirtual = true;
        }
    }
    
    public void agregarTurnoPerdido() {
        /*for (int i = 0; i < this.turnosPerdidos.length; i++) {
            if (" ".equals(this.turnosPerdidos[i])) {
                this.turnosPerdidos[i] = this.turnos[this.turnoEnAtencion];
                break;
            }
        }*/
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if(" ".equals(turnosPerdidos [i] ) ){
                this.turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }
    
}