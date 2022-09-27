/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4_Carrera;

import static Reto4_Carrera.Solucion.reporte;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Juan Montoya}
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Corredor> carrera = new ArrayList<>();
        carrera.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22));
        carrera.add(new Corredor("Juan Corredor", "28", 1.75, 24, 21));
        carrera.add(new Corredor("Carlos Perez", "19", 1.71, 28, 24));
        carrera.add(new Corredor("Maria Cadavid", "13", 1.80, 32, 22));
        Object retorno[] = reporte(carrera);
        System.out.println(Arrays.toString(retorno));
    }
}
