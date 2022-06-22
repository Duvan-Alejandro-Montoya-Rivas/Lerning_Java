package creandomarcos;
import javax.swing.*;
public class CreandoMarcos {

    public static void main(String[] args) {
     Mi_marco marco = new Mi_marco();
     marco.setVisible(true);
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //le digo que me cierre la ventana cuando le de la x, si no la tengo, se va a quedar ejecutanto el programa solo
     //marco.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// Le digo que me oculte la ventana cuando le de la x
    }
    
}
