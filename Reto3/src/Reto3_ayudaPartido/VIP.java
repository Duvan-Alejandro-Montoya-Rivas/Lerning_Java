/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ayudaPartido;

import java.util.Random;

/**
 *
 * @author Juan Montoya}
 */
public class VIP extends Asistente {
    //Atributos
    private boolean []pantallas;
    private String credencialesPrevia;
//constructor
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.pantallas = new boolean[]{false,false,false};
        this.credencialesPrevia="";
    }
    //metodos

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
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        if(pantalla > 0 || pantalla < 4){
            if(this.pantallas[pantalla]==true){
                this.pantallas[pantalla]=false;
            }else{
                this.pantallas[pantalla]=true;
            }
        }
    }
    
}
