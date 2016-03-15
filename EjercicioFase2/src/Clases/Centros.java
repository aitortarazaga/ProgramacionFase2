
package Clases;

import java.util.ArrayList;


public class Centros {
    private String id;
    private String nombre;
    private String calle;
    private int numero;
    private int cp;
    private String ciudad;
    private String provincia;
    private String telefono;
    private ArrayList<Persona> per;

    public Centros(String id, String nombre, String calle, int numero, int cp, String ciudad, String provincia, String telefono, ArrayList<Persona> per) {
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.per = per;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Persona> getPer() {
        return per;
    }

    public void setPer(ArrayList<Persona> per) {
        this.per = per;
    }

}
