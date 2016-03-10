
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class PersonaBD {
    
    private static Persona per = null;
    
    public static Persona comprobarDni(String dni){
        
        
        String select = "select * from trabajadores where dni = '" + dni + "'";
        
        try{
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet persona = sentencia.executeQuery(select);
            if(persona.next()){
                Calendar cal = Calendar.getInstance();
                cal.setTime(persona.getDate("FECHANAC")); 
                
                per.setDni(persona.getString("DNI"));
                per.setNombre(persona.getString("NOMBRE"));
                per.setApellido1(persona.getString("APELLIDO1"));
                per.setApellido2(persona.getString("APELLIDO2"));
                per.setCalle(persona.getString("CALLE"));
                per.setPiso(persona.getInt("PISO"));
                per.setMano(persona.getString("MANO"));
                per.setTelMovil(persona.getString("TELMOVIL"));
                per.setTelPers(persona.getString("TELPERSONAL"));
                per.setFecha_nac(cal);
                per.setSalario(persona.getFloat("SALARIO"));
                per.setPortal(persona.getString("PORTAL"));
            }
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return per;
    }
    
    public static void guardarPersona(String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        fecha = Calendar.getInstance();
        Date date = fecha.getTime();  
        
        String secuencia = "INSERT INTO " + opc + " VALUES(";
    }
}
