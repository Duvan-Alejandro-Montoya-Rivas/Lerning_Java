package universidad_uan;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private String sede;
    private ArrayList <Profesor> profe = new ArrayList() ;

    public Facultad() {
       
    }

    public Facultad(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    
    
}
