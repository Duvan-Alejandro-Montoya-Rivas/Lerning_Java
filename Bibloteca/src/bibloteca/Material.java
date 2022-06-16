
package bibloteca;

public abstract class Material {
    private String titulo;
    private String autor;
    private String publicado_por;
    private int anyo;
    private int valoracion;

    public Material(String titulo, String autor, String publicado_por, int anyo) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicado_por = publicado_por;
        this.anyo = anyo;
    }

    public Material() {
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicado_por() {
        return publicado_por;
    }

    public void setPublicado_por(String publicado_por) {
        this.publicado_por = publicado_por;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
    public abstract void imprimir();
    
    public abstract void prestamo(int dias);
    
    public void valorar(int numero){
        System.out.println("el material será valorado en "+numero+" estrellas");
        this.valoracion=numero;
    }
    
    public void imprimirDatos(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
    }
}
