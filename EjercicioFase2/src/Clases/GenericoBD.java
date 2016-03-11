
package Clases;

import java.sql.*;
import oracle.jdbc.OracleTypes;

public class GenericoBD {
    
    private static Connection con;
    
    public static void abrirConexion(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            
            String login = "system";
            String password = "oracle";
            String url = "jdbc:oracle:thin:@10.10.10.9:1521:db12102";
            con = DriverManager.getConnection(url, login, password);
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
    }
    
    public static void cerrarConexion(){
        try{
            con.close();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
    }
    
    public static Connection conexion(){
        Connection c = con;
        return c;
    }
    
    
}
