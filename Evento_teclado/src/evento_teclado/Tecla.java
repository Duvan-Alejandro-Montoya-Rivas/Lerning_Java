/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evento_teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Juan Montoya}
 */
public class Tecla implements KeyListener {
    

    @Override
    public void keyTyped(KeyEvent e) {
        
      }

    @Override
    public void keyPressed(KeyEvent e) {
        int a=e.getExtendedKeyCode();
        System.out.println("el valor numerico es: "+a);
     }

    @Override
    public void keyReleased(KeyEvent e) {
        char a =e.getKeyChar();
        System.out.println("La letra precionada es: "+a);
    }
}
