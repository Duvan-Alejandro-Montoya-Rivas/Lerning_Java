/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foco_campotexto;

import javax.swing.JFrame;

/**
 *
 * @author Juan Montoya}
 */
public class Frame extends JFrame {
    public Frame(){
        setTitle("Campo de texto (foco)");
        setBounds(100,100,400,500);
        Lamina pantalla =new Lamina();
        
        add(pantalla);
        Mouse raton = new Mouse();
        addMouseListener(raton);
        addMouseMotionListener(raton);
    }
    
}
