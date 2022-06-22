/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evento_interactuar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Juan Montoya}
 */
public class Lamina extends JPanel {
    /*@Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
    }*/
    //crear boton
    JButton button = new JButton("green");
    JButton amarillo = new JButton("amarillo");
    JButton rojo = new JButton("rojo");
    public Lamina (){//constructor de la lamina
        add(button);
        add(amarillo);
        add(rojo);
        Fondo yellow = new Fondo(Color.YELLOW);
        Fondo red = new Fondo(Color.RED);
        Fondo green = new Fondo(Color.GREEN);
        button.addActionListener(green); //con el this hacemos referencia a la propia clase donde nos encontramos, eso quiere decir que es la propia clase el que resive el evento
        amarillo.addActionListener(yellow);
        rojo.addActionListener(red);
    }
    public class Fondo implements ActionListener{//clase oyente 
    private Color nuevocolor;

    public Fondo(Color c) {
        this.nuevocolor = c;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(nuevocolor);
    }
    
}
}
