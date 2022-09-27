/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package base_de_datos;
import java.sql.*;
/**
 *
 * @author Juan Montoya}
 */
public class Base_de_datos {

    /**
     * @param args the command line arguments
     */
    private Connection con;
    public Base_de_datos(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e ){
            System.out.println("Error: "+e);
        }
    }
    public static void main(String[] args) throws SQLException {
        Base_de_datos coneccion = new Base_de_datos();
        Statement st;
        ResultSet rs;
        try{
           st=coneccion.con.createStatement(); 
           rs=st.executeQuery("select * from departamento");
           while(rs.next()){
               System.out.println(rs.getInt("id")+" "+rs.getString("departamento")+" "+ rs.getString("ciudad"));
               coneccion.con.close();
           }
        }catch(Exception e){
            System.out.println("Error: "+e);
            //coneccion.con.close();
        }
        
    }
    
}
