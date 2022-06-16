package talleruml;

import java.util.ArrayList;
import java.util.Scanner;


public class Cliente{
    private String nombre;
    private String direccion;
    private int telefono;
    private String fecha_nacimiento;
    private int cedula;
    private ArrayList<Tarjeta_compra> tar_com = new ArrayList(); //falta metodos
    private Cuenta cue;  //falta metodos

    public Cliente(String nombre, String direccion, int telefono, String fecha_nacimiento, int cedula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cedula = cedula;
        Tarjeta_compra tarj = new Tarjeta_compra() {};
    }

    public Cliente() {
        Tarjeta_compra tarj = new Tarjeta_compra() {};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public void agregar_tarjeta_compra(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Agregar numero de tarjeta: ");
        int numero = capturar.nextInt();
        System.out.println("Agregar fecha de apertura: ");
        String fecha_apertura = capturar.nextLine();
        System.out.println("Agregar fecha de cierre: ");
        String fecha_cierre = capturar.nextLine();
    }
    
    public void crear_persona(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Agregar nombre: ");
        this.nombre = capturar.nextLine();
        System.out.println("Agregar direccion: ");
        this.direccion = capturar.nextLine();
        System.out.println("Agregar fecha de nacimiento: ");
        this.fecha_nacimiento = capturar.nextLine();
        System.out.println("Agregar cedula: ");
        this.cedula = capturar.nextInt();
        System.out.println("Agregar telofono: ");
        this.telefono = capturar.nextInt();
    }
    
public void crear_cuenta(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Agregar id: ");
        String id = capturar.nextLine();
        System.out.println("Agregar fecha de apertura: ");
        String fecha_apertura = capturar.nextLine();
        System.out.println("Agregar fecha de cierre: ");
        String fecha_cierre = capturar.nextLine();
        System.out.println("Agregar sucursal: ");
        String sucursal = capturar.nextLine();
        System.out.println("Agregar direccion de facturacion: ");
        String direccion_facturacion = capturar.nextLine();
    }
}
