package bibloteca;

import java.util.Scanner;

public class Revista extends Material {
    //abtributos
    private String issn;
    private String tema;
    //constructor

    public Revista( String titulo, String autor, String publicado_por, int anyo, String issn, String tema) {
        super(titulo, autor, publicado_por, anyo);
        this.issn = issn;
        this.tema = tema;
    }
    public Revista() {    
    }
    
//metodos
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void imprimir() {
        System.out.println("Resvista");
        System.out.println("Issn: "+this.issn);
        System.out.println("Tema: "+this.tema);
    }

    @Override
    public void prestamo(int dias) {
        System.out.println("El prestamo es de  "+dias+" dias"); 
    }

   
    
}
