/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventoresponder;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Juan Montoya}
 */
public class Pantalla extends JFrame {
    public Pantalla(){
        setTitle("Respondiendo");
        setBounds(200,100,500,300);
        Miventana oyente = new Miventana();
        addWindowListener(oyente);
    }
}
