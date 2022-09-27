/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nombre_maria;

/**
 *
 * @author Juan Montoya}
 */
public class Persona {
    //atributos o caracteristicas del objeto
    private String nombre;
    private int edad;
    private int id;
    private String sexo;
//constructores o constructor

    public Persona(String nombre, int edad, int id, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.sexo = sexo;
    }
    
    //los metodos o acciones o funciones

    public String getNombre() {//obtener
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", sexo=" + sexo + '}';
    }
    
      
}
