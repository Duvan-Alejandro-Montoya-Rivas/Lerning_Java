/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventoresponder;

import javax.swing.JFrame;

/**
 *
 * @author Juan Montoya}
 */
public class Eventoresponder {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Pantalla pantalla2 = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla2.setVisible(true);
        pantalla2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
