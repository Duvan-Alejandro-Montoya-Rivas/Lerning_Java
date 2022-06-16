
package talleruml;

import java.util.Scanner;


public class Articulo {
    private int serial;
    private int cantidad;
    private float subtotal;
    private Producto prod;
    

    public Articulo(int serial, int cantidad, float subtotal) {
        this.serial = serial;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Articulo() {
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    public void Agrgar_articulo(){
        int Arepa=3000;
        int Cerveza=4000;
        int op;
        Scanner capturar=new Scanner(System.in);
        do{
        System.out.println("¿Que articulo desea desear?");
        System.out.println("1. Arepa");
        System.out.println("2. Cerveza \n 3.salir");
        op=capturar.nextInt();
        switch(op){
            case 1:
                System.out.println("Articulo agregado");
                do{
                System.out.println("Desea Agregar mas Articulos? \n 1.si \n 2.no");
                op=capturar.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Productos agregados: ");
                        
                        break;
                    case 2:
                        System.out.println("Gracias ");
                        break;
                }
                }while(op!=2);
            break;
            case 2:
                System.out.println("Articulo agregado");
                do{
                System.out.println("Desea Agregar mas Articulos? \n 1.si \n 2.no");
                op=capturar.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Productos agregados: ");
                        
                        break;
                    case 2:
                        System.out.println("Gracias ");
                        break;
                }
                }while(op!=2);
                
            break;
            case 3:
                System.out.println("Gracias");
                break;
        }
    }while(op!=3);
    }
    
}
