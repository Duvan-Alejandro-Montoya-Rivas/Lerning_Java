/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;
import java.util.*;
/**
 *
 * @author Juan Montoya}
 */
public class VIP extends Asistente{
    private boolean pantallas[];
    private String credencialesPrevia;

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.pantallas = new boolean[] {false,false,false};
        this.credencialesPrevia="";
        for (int i = 0; i < pantallas.length; i++) {
            boolean pantalla = pantallas[i];
            
        }
    }
    
    
    

    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
    
    
    //nos lo da el vpl
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        if(pantalla >0 || pantalla<4){
            if(this.pantallas[pantalla -1]== true){//0,1,2,3,4,5  1,2,3,4,5,6
                this.pantallas[pantalla -1]= false;
            }else{
                this.pantallas[pantalla -1]= true;
            }
        }
       
    }
    
}
