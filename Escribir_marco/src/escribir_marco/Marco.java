package escribir_marco;
import javax.swing.*;
import java.awt.*;
public class Marco extends JFrame{
    public Marco(){
        setBounds(400,200,500,400);
        setTitle("Titulo de escritura");
        Lamina1 lam = new Lamina1();
        add(lam);
        
        
    }
    
}
