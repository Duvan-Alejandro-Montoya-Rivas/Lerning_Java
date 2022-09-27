/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author Juan Montoya}
 */
public class NewClass {
    private String turnos [];
    private String turnosPerdidos[] ;
    private boolean estadoTurnoVirutal = true;
    private int turnoEnAtencion =3;
    private int cantidadDeTurnosAtendidos = 1;
    public NewClass(String turno[]){
        this.turnosPerdidos = new String[turno.length];
        this.turnos= turno;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }
    
    public void agregarTurnoPerdido() {
        for (int i = 0; i < this.turnosPerdidos.length; i++) {
           
                turnosPerdidos[i] = turnos[this.turnoEnAtencion];
                //break;
            
        }
    }  
}
