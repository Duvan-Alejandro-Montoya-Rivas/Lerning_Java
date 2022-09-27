/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foco_campotexto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Montoya}
 */
public class Lamina extends JPanel {
    private JTextField Cuadro1;
    private JTextField Cuadro2;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        Cuadro1 = new JTextField();
        Cuadro2 = new JTextField();
        Cuadro1.setBounds(70,40,72,30);
        Cuadro2.setBounds(70,90,72,30);
        add(Cuadro1);
        add(Cuadro2);
        Foco foco = new Foco();
        Cuadro1.addFocusListener(foco);
        Cuadro2.addFocusListener(foco);
    }
    public Lamina(){
        JButton amarillo = new JButton("amarillo");
        JButton azul = new JButton("azul");
        JButton rojo = new JButton("rojo");
        setLayout(null);
        amarillo.setBounds(50,200,82,20);
        azul.setBounds(150,200,70,20);
        rojo.setBounds(250,200,70,20);
        add(amarillo);
        add(rojo);
        add(azul);
    }
    private class Foco implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Ganste el foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = Cuadro1.getText();
            boolean comprobar = false;
            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i)=='@'){
                    comprobar = true;
                }
                
            }
            if(comprobar){
                System.out.println("Email Es corresto");
            }else{
                System.out.println("Email Es incorrecto");
            }
            String contra = Cuadro2.getText();
            
        }
        
    }
    

}
