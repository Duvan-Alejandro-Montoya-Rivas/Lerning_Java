/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foco_campotexto;

import java.awt.event.*;

/**
 *
 * @author Juan Montoya}
 */
public class Mouse implements MouseListener,MouseMotionListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Se hizo clic");
        System.out.println("Realizo "+e.getClickCount()+" cantidad de clics");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Preciono el la posicion X: "+e.getXOnScreen()+" Y: "+e.getYOnScreen());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Solto clic");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas Moviendo el mouse");
    }
    
}
