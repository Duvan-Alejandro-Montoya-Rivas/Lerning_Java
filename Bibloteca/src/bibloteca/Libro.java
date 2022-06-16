
package bibloteca;

public class Libro extends Material {
    private String isbn;
    private String serie;
    private String tema;
    //constructor

    public Libro(String isbn, String serie, String tema, String titulo, String autor, String publicado_por, int anyo) {
        super(titulo, autor, publicado_por, anyo);
        this.isbn = isbn;
        this.serie = serie;
        this.tema = tema;
    }
    //metodos

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void imprimir() {
        System.out.println("LIBRO");
    }

    @Override
    public void prestamo(int dias) {
        System.out.println("Prestamo echo por "+dias+"dias");
    }
    public void RescribirT(String titulo){
        System.out.println("El titulo es: "+this.getTitulo());
        this.setTitulo(titulo);
        System.out.println("Elnuevo tituo es: "+this.getTitulo());
    }
    
}
