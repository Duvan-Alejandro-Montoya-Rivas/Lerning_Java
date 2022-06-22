/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creandomarcos;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Juan Montoya}
 */
public class Mi_marco extends JFrame{
    /*public Mi_marco(){
    setBounds(400,250,500,300);//setBounds(x,y,Ancho,Largo) 
    //setExtendedState(Frame.MAXIMIZED_BOTH);//POR DEFECTO ABRE LA VENTANA CON EL TAMAÑO DE LA PANTALLA
    //setResizable(false); // Para Decir que no me deje agrandar manual mente la ventana
    setTitle("Mi experimiento broo");
}*/
    //para ver como ver el sistema nativo de ventana, es decir las "medidas"
    public Mi_marco(){
    Toolkit pantalla = Toolkit.getDefaultToolkit();
    Dimension tamano = pantalla.getScreenSize();
    int altura = tamano.height;
    int ancho = tamano.width;
    setBounds((ancho/4),(altura/4),500,500);
    Image simbolo = pantalla.getImage("src/CreandoMarcos/images.JPG");
    setIconImage(simbolo);
}
    
}
