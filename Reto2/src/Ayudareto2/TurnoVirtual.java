package Ayudareto2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TurnoVirtual {
    private String turnos [];
    private String turnosPerdidos [];
    private boolean estadoTurnoVirtual= true;
    private int turnoEnAtencion = 0, cantidadTurnosAtendidos = 1;

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[this.turnos.length];
        /*for (int i = 0; i < turnosPerdidos.length; i++) {
            turnosPerdidos[i]=" ";  
        }*/
        Arrays.fill(this.turnosPerdidos," ");
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
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
    
    //nos lo da el vpl
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
    //nuestros metodos
    public void atenderProximoTurno (){
        if(this.estadoTurnoVirtual==true){
            this.cantidadTurnosAtendidos++;
            this.turnoEnAtencion++;
        }
    }
    
    public void cambiarEstadoTurno(){
        if(this.estadoTurnoVirtual==true){
            this.estadoTurnoVirtual=false;
        }else{
            this.estadoTurnoVirtual=true;
        }
    }
    


}
