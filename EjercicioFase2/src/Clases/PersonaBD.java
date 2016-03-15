
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PersonaBD {
    
    private static String cargo;
    private static String dni;
    private static Persona per = null;
    private static String o;
    
    public static Persona comprobarDni(String dni){
        
        String select1 = "select * from administracion where dni = '" + dni + "'";
        String select2 = "select * from logistica where dni = '" + dni + "'";
        
        
        try{
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet persona = sentencia.executeQuery(select1);
            if(persona.next()){
               
                    
                dni = persona.getString("DNI");
                
                per = new Persona(persona.getString("DNI"),persona.getString("NOMBRE"),persona.getString("APELLIDO1"),persona.getString("APELLIDO2"),persona.getString("CALLE"),persona.getInt("PISO"),persona.getString("MANO"),persona.getString("PORTAL"),persona.getString("TELEMPRESA"),persona.getString("TELPERSONAL"),persona.getFloat("SALARIO"),persona.getDate("FECHANAC"));
                
                
                cargo = "administracion";
            }
            else{
                persona = sentencia.executeQuery(select2);
                if(persona.next()){
                        
                dni = persona.getString("DNI");
                per = new Persona(persona.getString("DNI"),persona.getString("NOMBRE"),persona.getString("APELLIDO1"),persona.getString("APELLIDO2"),persona.getString("CALLE"),persona.getInt("PISO"),persona.getString("MANO"),persona.getString("PORTAL"),persona.getString("TELEMPRESA"),persona.getString("TELPERSONAL"),persona.getFloat("SALARIO"),persona.getDate("FECHANAC"));
                
                cargo = "logistica";
                }
            }
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return per;
    }
    
    public static void guardarPersona(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        
        if(salario.isEmpty())
            salario = null;
        if(telPers.isEmpty())
            telPers = null;
        else
            telPers = "'" + telPers + "'";
        
        java.sql.Date fechasql = new java.sql.Date(fecha.getTime().getTime());
        
        String secuencia = "INSERT INTO " + opc + " (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "'," + telPers + ",TO_DATE('" + fechasql + "','YYYY-MM-DD')," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
        
        try{
        Statement sentencia = GenericoBD.conexion().createStatement();
        sentencia.executeUpdate(secuencia);
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static void borrarPersona(){
        String secuencia = "delete from " + cargo + " where dni = '" + ejerciciofase2.EjercicioFase2.recogerDni() + "'";
        
        try{
        Statement sentencia = GenericoBD.conexion().createStatement();
        sentencia.executeUpdate(secuencia);
        per = null;
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static String cargo(){
        return cargo;
    }
    
    public static void editarPersona(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        if(salario.isEmpty())
            salario = null;
        if(telPers.isEmpty())
            telPers = null;
        
        
        java.sql.Date fechasql = new java.sql.Date(fecha.getTime().getTime());
        
        String actualizar = "UPDATE " + opc + " SET NOMBRE = '" + nombre + "', APELLIDO1 = '" + apellido1 + "', APELLIDO2 = '" + apellido2 + "', CALLE = '" + calle + "', PORTAL = " + portal + ", PISO = " + piso + ", MANO = '" + mano + "', TELEMPRESA = '" + telMovil + "', TELPERSONAL = " + telPers + ", SALARIO = " + salario + ", FECHANAC = TO_DATE('" + fechasql + "','YYYY-MM-DD')";
        String borrar = "DELETE FROM " + cargo + " WHERE DNI = '" + dni + "'";
        String crear = "INSERT INTO " + opc + " (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "'," + telPers + ",TO_DATE('" + fechasql + "','YYYY-MM-DD')," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
                
        try{
        Statement sentencia = GenericoBD.conexion().createStatement();
        if(cargo.compareToIgnoreCase(opc) == 0)
            sentencia.executeUpdate(actualizar);
        else{
            sentencia.executeUpdate(crear);
            sentencia.executeUpdate(borrar);
        }
            
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
}
