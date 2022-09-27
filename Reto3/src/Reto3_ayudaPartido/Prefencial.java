/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ayudaPartido;

/**
 *
 * @author Juan Montoya}
 */
public class Prefencial extends Asistente {
    //atributos
    private boolean participaSorteo;
    //constructor

    public Prefencial(boolean participaSorteo, String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = participaSorteo;
    }

    

    
    //Metodos

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    public void participarSorteo(){
        if(participaSorteo==true){
            this.participaSorteo=false;
        }else{
            this.participaSorteo=true;
        } 
    }
    
}
