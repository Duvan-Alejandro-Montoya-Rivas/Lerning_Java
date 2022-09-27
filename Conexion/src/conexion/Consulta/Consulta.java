/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexion.Consulta;
import java.io.*;
import java.sql.*;
public class Consulta {
    private Connection myConn = null; 
    private Statement myStmt = null; 
    private ResultSet myRs = null;
    private String consulta ;
    public void Consulta_ejecutar () throws SQLException, IOException {
        try {
            // 1. Obtenga una conexión a la base de datos
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario", "root" , "12345");			
            // 2. Crea una declaración
            myStmt = myConn.createStatement();			
            // 3. Ejecutar consulta SQL
            myRs = myStmt.executeQuery(this.consulta);			
            // 4. Procesar el conjunto de resultados
            
            System.out.println("placa\t"+"Marca\t"+"Modelo\t"+"Kilometraje\t"+"Fecha de venta\t"+"Documento de vendedor");
            while (myRs.next()) {
                System.out.println(myRs.getString("placa")+"\t"+myRs.getString("marca")+"\t"+myRs.getString("modelo")+"\t"+myRs.getInt("Kilometraje")+"\t"+myRs.getDate("Fecha_venta")+"\t"+myRs.getInt("documento_vendedor"));
            }   
            //5. cerrando conexiones
            myRs.close();myStmt.close();myConn.close();			
	}catch (SQLException exc) {
            System.out.println(""+exc);
            myRs.close(); myStmt.close();myConn.close();			
	}
	finally {			
            myRs.close(); myStmt.close();myConn.close();	
	}
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public void CerrarConexion() throws SQLException{
        this.myRs.close();
        this.myStmt.close();
        this.myConn.close();	
        
    }
}
