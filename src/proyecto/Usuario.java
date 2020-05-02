/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Usuario
 */
public class Usuario {
    MyArrayList<medicamento> medicamentos= new MyArrayList<>();
    int id;
    String tipo;
    String Fecha;
    String Contraseña;

    public Usuario(int id, String tipo, String Fecha, String Contraseña) {
        this.id = id;
        this.tipo = tipo;
        this.Fecha = Fecha;
        this.Contraseña = Contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    
    
    
    
    
}
