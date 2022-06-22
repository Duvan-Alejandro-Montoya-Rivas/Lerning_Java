package prueba_temporizador;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
public class Damehora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date(); //solo captura la hora con un determinado tiempo
        System.out.println("Te pongo la hora cada..."+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
    
}
