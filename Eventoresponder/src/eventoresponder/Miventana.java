/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventoresponder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author Juan Montoya}
 */
public class Miventana implements WindowListener{ //para poder usar solo el o los metodos que necesito, puedo usar ((extends WindowAdapter)) y ya, solo sobre escribo el metodo que necesito en concreto 

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) { //siempre programar cosas que se haga mientras se minimiza
        System.out.println("Ventana Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Desactivada");
    }
    
}

