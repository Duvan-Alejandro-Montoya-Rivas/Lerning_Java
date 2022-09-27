package conexion;


import java.sql.*;
import javax.swing.*;
public class conexion {
    public String db = "ejemploclase";
    public String url="jdbc:mysql://localhost:3306/"+db;
    public String user = "root";
    public String pass = "12345";
    public String driver= "com.mysql.cj.jdbc.Driver";

   public Connection Conectar(){
       Connection con = null;
       try{
           Class.forName(driver);
           con = DriverManager.getConnection(this.url, this.user, this.pass);
           System.out.println("Conectado");
       }catch(ClassNotFoundException | SQLException ex){
         
           System.out.println("Error: "+ex);
       }
       return con;
   }
}  

