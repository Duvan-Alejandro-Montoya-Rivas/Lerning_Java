/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escribir_marco;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.geom.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Juan Montoya}
 */
public class Lamina1 extends JPanel{
    private Image imagen;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); //para que haga su funcionamiento normal y ademas que haga lo que yo quiero que haga
        /*g.drawString("Prueba de que hace", 150, 100);
        g.drawRect(145, 100, 120, 10); //Rectangulo, cuadrado, etc
        g.drawLine(200, 200, 150, 20); //Line
        g.drawRoundRect(220, 112, 60, 90, 120, 150); //Circulo
        g.fillOval(100, 200, 300, 50); //obvalo
        */
        //Graphics2D g2 = (Graphics2D) g;
        /*Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,300); //Para utilizar la libreria 2D, siempre tengo que instanciar y despues dibujar
        g2.setPaint(Color.GRAY);
        g2.fill(rectangulo);
        //g2.draw(rectangulo);
        Ellipse2D elipce = new Ellipse2D.Double();
        elipce.setFrame(rectangulo);
        g2.setPaint(new Color(109,172,59).darker());
        g2.fill(elipce);
        //g2.draw(elipce);
        */
        
        /*Font fuente = new Font("Arial",Font.BOLD,26);
        g2.setFont(fuente);
        g2.setPaint(new Color(109,172,59));
        g2.drawString("Juan", 100, 100);
        g2.setFont(new Font("Calibri",Font.ITALIC,26));
        g2.setPaint(new Color(100,172,59));
        g2.drawString("Juan", 200, 100);*/
        //File image = new File("C:/Users/Juan Montoya}/Downloads/images.jpg");
        try {
            imagen = ImageIO.read(new File ("C:/Users/Juan Montoya}/Downloads/images.jpg"));
        } catch (IOException ex) {
            System.out.println("La imagen no se encuentra");
        }
        g.drawImage(imagen, 100, 150, null);
        
    }
    

}
