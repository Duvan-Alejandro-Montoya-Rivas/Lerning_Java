package evento_interactuar;
import java.awt.*;
import javax.swing.*;
public class Panel extends JFrame{
    public Panel(){
        setTitle("Experimento");
        setBounds(400,200,800,500);
        Lamina pantalla =new  Lamina();
        add(pantalla);
        
    }
    
}
