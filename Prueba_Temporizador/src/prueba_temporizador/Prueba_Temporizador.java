package prueba_temporizador;

import javax.swing.*;

public class Prueba_Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Damehora oyente = new Damehora();
        Timer Mi_temporizador = new Timer(8000,oyente);
        Mi_temporizador.start();
       JOptionPane.showMessageDialog(null, "pulsa para detener"); //solo para ver un mensaje y para pedir info : JOptionPane.showInputDialog
       System.exit(0);
       
    }
    
}
