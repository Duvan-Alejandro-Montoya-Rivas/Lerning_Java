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
    public Lamina (){//constructor de la lamina
        Fondo accion = new Fondo("amarillo"/*,new ImageIcon("")*/,Color.YELLOW);
        Fondo accion1 = new Fondo("azul"/*,new ImageIcon("")*/,Color.BLUE);
        Fondo accion2 = new Fondo("rojo"/*,new ImageIcon("")*/,Color.RED);
        JButton amarillo = new JButton(accion);
        JButton azul = new JButton(accion1);
        JButton rojo = new JButton(accion2);
        
        setLayout(null);
        amarillo.setBounds(50, 200, 100, 35);
        azul.setBounds(170, 200, 100, 35);
        rojo.setBounds(350, 200, 100, 35);
        add(amarillo);
        add(azul);
        add(rojo);
        /*add(new JButton (accion));
        add(new JButton (accion1));
        add(new JButton (accion2));
        */
        
    }
    private class Fondo extends AbstractAction /*implements ActionListener*/{//clase oyente 

    public Fondo(String nombre /*Icon color*/, Color colo_boton) {
        putValue(Action.NAME, nombre); //estamos haciendo que almacenemos primero, una clave y un valor, obligatoria mente
        // action.Name: es usado para el nombre como tal que se va a almacenar
        //nombre: este se llama como en el parametro, pero es el encargado de almacenar la clave o el valor de ello
        //putValue(Action.SMALL_ICON,color);
        putValue(Action.SHORT_DESCRIPTION,"poner la lamina de color: "+nombre); //cuando dejo el mouse encima del boton, me da una descricción
        putValue("color_de_fondo: ",colo_boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Color a = (Color)getValue("color de fondo");//almacenar un color a la variable c, lo casteo para que me lo guarde sin errores
        setBackground(a);
        System.out.println("Nombre : "+getValue(Action.NAME));
    }
    
}
}
