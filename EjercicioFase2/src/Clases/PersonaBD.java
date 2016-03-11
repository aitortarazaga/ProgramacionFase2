
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

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
                SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    String dateInString = "22-01-2015 10:20:56";
                    Date date = sdf.parse(dateInString);

                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    
                dni = persona.getString("DNI");
                per = new Persona(persona.getString("DNI"),persona.getString("NOMBRE"),persona.getString("APELLIDO1"),persona.getString("APELLIDO2"),persona.getString("CALLE"),persona.getInt("PISO"),persona.getString("MANO"),persona.getString("PORTAL"),persona.getString("TELEMPRESA"),persona.getString("TELPERSONAL"),persona.getFloat("SALARIO"),null);
                
                cargo = "administracion";
            }
            else{
                persona = sentencia.executeQuery(select2);
                if(persona.next()){
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                        String dateInString = "22-01-2015 10:20:56";
                        Date date = sdf.parse(dateInString);

                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        
                dni = persona.getString("DNI");
                per = new Persona(persona.getString("DNI"),persona.getString("NOMBRE"),persona.getString("APELLIDO1"),persona.getString("APELLIDO2"),persona.getString("CALLE"),persona.getInt("PISO"),persona.getString("MANO"),persona.getString("PORTAL"),persona.getString("TELEMPRESA"),persona.getString("TELPERSONAL"),persona.getFloat("SALARIO"),calendar);
                
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
        fecha = Calendar.getInstance();
        Date date = fecha.getTime();  
        
        String secuencia = "INSERT INTO " + opc + " (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "','" + telPers + "',null," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
        
        try{
        Statement sentencia = GenericoBD.conexion().createStatement();
        sentencia.executeUpdate(secuencia);
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static void borrarPersona(){
        String secuencia = "delete from administracion where dni = '" + ejerciciofase2.EjercicioFase2.recogerDni() + "'";
        
        try{
        Statement sentencia = GenericoBD.conexion().createStatement();
        sentencia.executeUpdate(secuencia);
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static String cargo(){
        return cargo;
    }
}
