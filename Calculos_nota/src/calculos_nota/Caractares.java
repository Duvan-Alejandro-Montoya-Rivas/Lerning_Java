
package calculos_nota;

public class Caractares extends Exception{
    public Caractares(String msg) {
        super("Mas de 30 Caracteres" + msg);
    }
}
