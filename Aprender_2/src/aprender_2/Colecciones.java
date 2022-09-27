package aprender_2;

import java.util.ArrayList;


public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Anamira");
        nombres.add("Pablo");
        nombres.add("Jose");
        nombres.add("Mario");
        nombres.add("Julanito");
        nombres.add("pepito");
        nombres.add("juana");
        for (int i = 0; i < nombres.size(); i++) { //0 = " ", 1= = null
            
            System.out.println("pocisiones \t: "+i+"\t--->"+nombres.get(i));
        }
    }
}
