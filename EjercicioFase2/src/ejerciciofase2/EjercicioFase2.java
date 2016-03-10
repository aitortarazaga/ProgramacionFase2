
package ejerciciofase2;

import Clases.*;
import Vistas.*;

public class EjercicioFase2 {

    private static Cambio ca;
    private static Centro ce;
    private static NuevaPersona np;
    private static boolean nuevo;
    
    public static void main(String[] args) {
        
        ce = new Centro();
        ce.setVisible(true);
        ce.setLocationRelativeTo(null);
    }
    
    public static void invisibleCentro(){
        ce.setVisible(false);
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
}
