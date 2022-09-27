/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author Juan Montoya}
 */
public class Preferencial extends Asistente {
    private boolean participaSorteo ;

    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo=false;
    }

    

    

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    //metodo dado por vpl
     public void participarSorteo(){
        
        if(this.participaSorteo == true){
            this.participaSorteo = false;
        }else{
            this.participaSorteo = true;
        }
        
    }
}
