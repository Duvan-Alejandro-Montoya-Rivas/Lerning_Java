/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evento_mouse;

import java.awt.event.*;

/**
 *
 * @author Juan Montoya}
 */
public class Mouse implements MouseListener, MouseMotionListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hizo clic en X: "+e.getXOnScreen()+" Y: "+e.getXOnScreen());
        System.out.println("Realizaste la cantidad de "+e.getClickCount()+" clics");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Presiono el clic");
        if(e.getModifiersEx()==1024){
            System.out.println("Clic Izquiero");
        }else{
            System.out.println("Clic Derecho");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Solto el clic");
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
