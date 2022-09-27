/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evento_teclado;

import javax.swing.JFrame;

/**
 *
 * @author Juan Montoya}
 */
public class Frame extends JFrame{
    public  Frame(){
        setTitle("Ventana de eventos de escritura");
        setBounds(100,200,500,500);
        Tecla key = new Tecla();
        addKeyListener(key);
    }
}
