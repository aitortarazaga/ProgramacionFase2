
package ejerciciofase2;

import Clases.*;
import Vistas.*;
import java.util.ArrayList;
import java.util.Calendar;

public class EjercicioFase2 {

    private static Cambio ca;
    private static Centro ce;
    private static NuevaPersona np;
    private static boolean nuevo;
    private static int id;
    private static Opcion op;
    private static boolean opc;
    private static String Dni;
    private static boolean visualizar;
    private static NuevoCentro nc;
    private static Persona per;
    private static String cargo;
    
    public static void main(String[] args) {
        ce = new Centro();
        crearCentro();
        
        ca = new Cambio();
    }
    
    public static void crearCentro(){
        
        ce.setVisible(true);
    }
    
    public static void cerrarCentro(){
        ce.dispose();
    }
    
    public static void mostrarCambio(){
        ca.setVisible(true);
        ca.setLocationRelativeTo(null);
    }
    
    public static void mostrarNuevo(){
        np = new NuevaPersona(ca,true);
        np.setLocationRelativeTo(null);
        np.setVisible(true);
    }
    
    public static void nuevoTrabajador(){
    nuevo = true;
    np.dispose();
    }
    
    public static boolean crearNuevo(){
        return nuevo;
    }
    
    public static void limpiarDni(){
    nuevo = false;
    np.dispose();
    }
    
    public static void idCentro(int n){
        id = n;
    }
    
    public static int guardarCentro(){
        return id;
    }
    
    public static void mostrarOpcion(){
        op = new Opcion(ca,true);
        op.setLocationRelativeTo(null);
        op.setVisible(true);
    }
    
    public static void cerrarOpcion(){
        op.dispose();
    }
    
    public static void guardarBoolean(boolean o){
        opc = o;
    }
    
    public static boolean o(){
        return opc;
    }
    
    public static void reiniciarCambio(){
        ca.dispose();
        ca = new Cambio();
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }
    
    public static void reiniciarBoolean(){
        opc = false;
    }
    
    public static void cerrarCambio(){
        ca.dispose();
        ce = new Centro();
        ce.setLocationRelativeTo(null);
        ce.setVisible(true);
    }
    
    public static void guardarDni(String dni) {
        Dni = dni;
    }
    
    public static String recogerDni(){
        return Dni;
    }
    
    public static java.util.Calendar getFechaNac(){
         // java.util.Date a Calendar
        java.util.Calendar cal = Calendar.getInstance();
        cal.setTime(PersonaBD.getPersona().getFecha_nac());
        return cal;
     }
    
    public static void visualizar(){
        visualizar = true;
    }
    
    public static boolean getVisualizar(){
        return visualizar;
    }
    
    public static void crearNc(){
        nc = new NuevoCentro();
        nc.setLocationRelativeTo(null);
        nc.setVisible(true);
    }
    
    public static void cerrarNc(){
        nc.dispose();
    }
    
    public static void setPersona(Persona p){
        per = p;
    }
    
    public static Persona getPersona(){
        return per;
    }
    
    public static void setCargo(String c){
        cargo = c;
    }
    
    public static String getCargo(){
        return cargo;
    }
    
    public static Persona compDni(String dni){
        return PersonaBD.comprobarDni(dni);
    }
    
    public static ArrayList<String> llenarCb(){
        return CentroBD.llenarCb();
    }
    
    public static String llenarNombre(String i){
        return CentroBD.llenarNombre(i);
    }
    
    public static void borrarCentro(java.lang.Object id){
        CentroBD.borrarCentro(id);
    }
}
