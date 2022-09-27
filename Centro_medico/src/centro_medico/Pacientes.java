package centro_medico;

import java.util.ArrayList;
import java.util.Scanner;

public class Pacientes extends Persona {
   private ArrayList<String>sintoma;
   private ArrayList<Persona>grupo;

    public Pacientes(String nombre, String apellido, int edad, int id, String celular) {
        super(nombre, apellido, edad, id, celular);
        this.sintoma= new ArrayList<>();
        this.grupo=new ArrayList<>();
        
    }
    
    public void add(Persona p){
        grupo.add(p);
    }
    
    public void addSintoma(String s){
        sintoma.add(s);
    }
   
}
