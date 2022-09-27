/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4_ayuda;

/**
 *
 * @author Juan Montoya}
 */
public class Estudiante {
    private String nombrecompleto;
    private String documentoIdentidad;
    private double nota;
    private int grado,edad;

    public Estudiante(String nombrecompleto, String documentoIdentidad, double nota, int grado, int edad) {
        this.nombrecompleto = nombrecompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.nota = nota;
        this.grado = grado;
        this.edad = edad;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
