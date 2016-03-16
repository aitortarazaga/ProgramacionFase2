package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class AdministracionBD {
    
    private static Persona per;
    
    public static Persona comprobarDniAdm(String dni){
        
        String select = "select * from administracion where dni = '" + dni + "'";
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet persona = sentencia.executeQuery(select);
            if(persona.next()){
                per = new Administracion();
                
                per.setDni(persona.getString("DNI"));
                per.setNombre(persona.getString("NOMBRE"));
                per.setApellido1(persona.getString("APELLIDO1"));
                per.setApellido2(persona.getString("APELLIDO2"));
                per.setCalle(persona.getString("CALLE"));
                per.setPiso(persona.getInt("PISO"));
                per.setMano(persona.getString("MANO"));
                per.setPortal(persona.getString("PORTAL"));
                per.setTelMovil(persona.getString("TELEMPRESA"));
                per.setTelPers(persona.getString("TELPERSONAL"));
                per.setSalario(persona.getFloat("SALARIO"));
                per.setFecha_nac(new java.util.Date(persona.getDate("FECHANAC").getTime()));
            }
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return per;
    }
    
    public static void guardarAdministracion(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha){
        if(salario.isEmpty())
            salario = null;
        if(telPers.isEmpty())
            telPers = null;
        else
            telPers = "'" + telPers + "'";
        
        java.sql.Date fechasql = new java.sql.Date(fecha.getTime().getTime());
        
        String secuencia = "INSERT INTO administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) " + "VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "'," + telPers + ",TO_DATE('" + fechasql + "','YYYY-MM-DD')," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
        
        try{
            GenericoBD.abrirConexion();
            
            Statement sentencia = GenericoBD.conexion().createStatement();
            sentencia.executeUpdate(secuencia);
            
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }

    public static void borrarAdministracion(String dni){
        
        String secuencia = "delete from administracion where dni = '" + ejerciciofase2.EjercicioFase2.recogerDni() + "'";
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            sentencia.executeUpdate(secuencia);
            sentencia.executeUpdate("COMMIT");
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
        per = null;
    }
    
    public static void editarAdministracion(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        if(salario.isEmpty())
            salario = null;
        if(telPers.isEmpty())
            telPers = null;
        
        
        java.sql.Date fechasql = new java.sql.Date(fecha.getTime().getTime());
        
        String actualizar = "UPDATE administracion SET NOMBRE = '" + nombre + "', APELLIDO1 = '" + apellido1 + "', APELLIDO2 = '" + apellido2 + "', CALLE = '" + calle + "', PORTAL = " + portal + ", PISO = " + piso + ", MANO = '" + mano + "', TELEMPRESA = '" + telMovil + "', TELPERSONAL = " + telPers + ", SALARIO = " + salario + ", FECHANAC = TO_DATE('" + fechasql + "','YYYY-MM-DD')";
        String borrar = "DELETE FROM logistica WHERE DNI = '" + dni + "'";
        String crear = "INSERT INTO administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "'," + telPers + ",TO_DATE('" + fechasql + "','YYYY-MM-DD')," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
                
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            if(PersonaBD.cargo().compareToIgnoreCase(opc) == 0)
                sentencia.executeUpdate(actualizar);
            else{
                sentencia.executeUpdate(crear);
                sentencia.executeUpdate(borrar);
            }
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }

}
