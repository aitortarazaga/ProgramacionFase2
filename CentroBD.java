
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CentroBD {
    
    public static ArrayList<String> llenarCb(){
        ArrayList<String> ce = new ArrayList();
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet centro = sentencia.executeQuery("select id from centro");
            while(centro.next()){
                ce.add(centro.getString("ID"));
            }
            GenericoBD.conexion();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return ce;
    }
    
    public static String llenarNombre(String id){
        String n = "";
        String select = "select nombre from centro where id = " + id;
        
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet nombre = sentencia.executeQuery(select);
            nombre.next();
            n = nombre.getString("NOMBRE");
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return n;
    }
    
    public static void borrarCentro(Object id){
        try{
            GenericoBD.abrirConexion();
            Statement sentencia=GenericoBD.conexion().createStatement();
            ResultSet borrar=sentencia.executeQuery("DELETE FROM CENTROS WHERE ID= " + id);
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
    }
}
