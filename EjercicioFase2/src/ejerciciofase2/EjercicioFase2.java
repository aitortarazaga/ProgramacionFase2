
package ejerciciofase2;

import Clases.*;
import Vistas.*;

public class EjercicioFase2 {

    private static Cambio ca;
    private static Centro ce;
    private static NuevaPersona np;
    private static boolean nuevo;
    private static int id;
    private static Opcion op;
    private static boolean o;
    private static String Dni;
    
    public static void main(String[] args) {
        
        ce = new Centro();
        ce.setVisible(true);
        ce.setLocationRelativeTo(null);
    }
    
    public static void cerrarCentro(){
        ce.dispose();
    }
    
    public static void mostrarCambio(){
        ca = new Cambio();
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
    
    public static void guardarBoolean(){
        o = true;
    }
    
    public static boolean o(){
        return o;
    }
    
    public static void reiniciarCambio(){
        ca.dispose();
        ca = new Cambio();
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }
    
    public static void reiniciarBoolean(){
        o = false;
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
}
