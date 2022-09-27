/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evento_mouse;

import javax.swing.JFrame;

/**
 *
 * @author Juan Montoya}
 */
public class Frame extends JFrame{
    public Frame(){
        setTitle("Prueba de mause");
        setBounds(300,500,400,600);
        Mouse raton = new Mouse();
        addMouseListener(raton);
        addMouseMotionListener(raton);
    }
}
