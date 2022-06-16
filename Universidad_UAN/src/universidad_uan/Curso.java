package universidad_uan;

public class Curso {
    private String Id;
    private String nombre;
    private String facultad;

    public Curso() {
    }

    public Curso(String Id, String nombre, String facultad) {
        this.Id = Id;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
}
