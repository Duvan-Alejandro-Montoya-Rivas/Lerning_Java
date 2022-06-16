package veterinaria;

public  abstract class Veterinaria implements Registro{
    private String codigo;
    private String nombre;
    private String edad;
    private String raza;
    private String sexo;
    private String nombre_due;
    private String id_due;
    //constructor

    public Veterinaria(String codigo, String nombre, String edad, String raza, String sexo, String nombre_due, String id_due) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.nombre_due = nombre_due;
        this.id_due = id_due;
    }

    public Veterinaria() {
    }
    //metodos

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre_due() {
        return nombre_due;
    }

    public void setNombre_due(String nombre_due) {
        this.nombre_due = nombre_due;
    }

    public String getId_due() {
        return id_due;
    }

    public void setId_due(String id_due) {
        this.id_due = id_due;
    }
    public abstract void imprimirV();
    public void imprimirDatos(){
        System.out.println("Animal");
        System.out.println("Nombre dueño"+this.nombre_due);
        System.out.println("Cedula de Dueño: "+this.id_due);
        System.out.println("Nombre animal: "+this.nombre);
        System.out.println("Edad animal: "+this.edad);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Codigo: "+this.codigo);
        
    }
    
}
