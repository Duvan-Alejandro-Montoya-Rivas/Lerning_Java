package principal;
import java.util.Vector;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaDeNumeros {

    private Vector arreglo;
    private static final int tam = 10;

    public ListaDeNumeros() {
        arreglo = new Vector(tam);
        for (int i = 0; i < tam; i++) {
            arreglo.addElement(new Integer(i));
        }
    }

    public void EscribirLista() {
        PrintStream out = null;
        Scanner capturar = new Scanner(System.in);
        try{
            out = new PrintStream(new FileOutputStream("SalidaNumeros.txt"));
           
                  for (int i = 0; i < tam; i++) {
                out.println("Dato ["+i+"] = "+arreglo.elementAt(i));
                }
                  System.out.println("Numeros almacenados Correcta Mente");
                out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListaDeNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void AgregarM(){
        try {
            PrintStream out = null;
            Scanner capturar = new Scanner(System.in);
            out = new PrintStream(new FileOutputStream("SalidaNumeros.txt"));
            for (int i = 0; i < tam; i++) {
                System.out.println("Ingrese 10 numeros");
                out.write(capturar.nextInt());
         
                }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListaDeNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void LeerLista() {
        Scanner entrada= new Scanner (System.in);
        int op;
        System.out.println("Archivo esta en carpeta\n"
                + "1.si \n"
                + "2.no \n"
                + "3.salir \n"
                + "Ingrese opcion: ");
                op=entrada.nextInt();
                if(op==1){
                    try {
            File archivo;
            FileReader leer;
            String cadena;
            archivo= new File("EntradaNumeros.txt");
            leer = new FileReader(archivo);
            BufferedReader almacenamiento = new BufferedReader(leer);
            cadena= "";
            while(cadena != null){
                try {
                    cadena= almacenamiento.readLine();
                    if(cadena == null){
                        System.out.println(arreglo);  
                    }
                } catch (IOException ex) {
                    System.out.println("Esta bacio el archivo");
                } 
            }
            try {
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                System.out.println("No se puede cerrar");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
                }
                if(op==2){
                    AgregarM();
                }
        
    }
}

//            for(int i = 0; i < tam; i++) {
//            out.println("Dato ["+i+"] = "+arreglo.elementAt(capturar.nextInt(i)));
//            
//                }out.close();