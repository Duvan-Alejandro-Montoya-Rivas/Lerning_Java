/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorainterfaze;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author Juan Montoya}
 */
public class CalculadoraInterfaze extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private JPanel lamina ; //lamina para escribir todo
    private JTextField txto1; //cuadro de ingresar texto
    private JTextField txto2;
    private JLabel cuadro1; //cuadro de texto normal, base
    private JLabel cuadro2;
    private JButton boton1; //botton
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    CalculadoraInterfaze pantalla = new CalculadoraInterfaze();
                    pantalla.setVisible(true);
                    pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        
    }
    public CalculadoraInterfaze(){
        setTitle("calculadora");
        setBounds(300,200,400,200);
        lamina =new  JPanel();
        lamina.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(lamina);
        lamina.setLayout(null);
        
        txto1 = new JTextField();
        cuadro1 = new JLabel("Numero 1");
        cuadro1.setBounds(40, 20, 80, 20);
        txto1.setBounds(100, 20, 110, 20);
        
        txto2 = new JTextField();
        cuadro2 = new JLabel("Numero 2");
        cuadro2.setBounds(40, 65, 80, 20);
        txto2.setBounds(100, 65, 110, 20);
        
        lamina.add(cuadro1);
        lamina.add(cuadro2);
        lamina.add(txto1);
        lamina.add(txto2);
        txto1.setColumns(20);//buscar para que sirve
        boton1 = new JButton("Calcular");
        boton1.addActionListener(this);
        boton1.setBounds(250, 20, 81, 20);
        //boton1.setText("Calcular");
        lamina.add(boton1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
