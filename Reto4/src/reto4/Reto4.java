package reto4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static reto4.Solucion.reportes;


public class Reto4 {

    
    public static void main(String[] args) {
        ArrayList<Estudiante> grupo = new ArrayList();
        grupo.add(new Estudiante("Alfredo alberto Montoya","12345",5.0,10,17));
        grupo.add(new Estudiante("albeiro Montoya","45732",4.1,9,15));
        grupo.add(new Estudiante("Daniela Devia","1452345",1.5,11,20));
        grupo.add(new Estudiante("Marta ovbjiedo","1452345",2.3,11,20));
        //grupo.add(new Estudiante("mateo","1234234235",4.1,7,13));
        Object[] retorno1 = reportes(grupo);
        System.out.println(Arrays.toString(retorno1));
        
        
    }
    
}
