package universidad_uan;

public class Profesor extends Persona {
   private String facultad;
   private String vinculacion;
   private Curso [] curso= null;
    public Profesor(String facultad, String vinculacion) {
        this.facultad = facultad;
        this.vinculacion = vinculacion;
        curso= new Curso[10];
    }
    public Profesor() {
        curso = new Curso[10];
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public String getVinculacion() {
        return vinculacion;
    }
    public void setVinculacion(String vinculacion) {
        this.vinculacion = vinculacion;
    }
   
}
