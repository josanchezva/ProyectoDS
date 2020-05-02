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
public class medicamento {
    String nombre;
    int cantidad;
    int veces_semana;
    int veces_dia;
    String modo;

    public medicamento(String nombre, int cantidad, int veces_semana, int veces_dia) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.veces_semana = veces_semana;
        this.veces_dia = veces_dia;      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVeces_semana() {
        return veces_semana;
    }

    public void setVeces_semana(int veces_semana) {
        this.veces_semana = veces_semana;
    }

    public int getVeces_dia() {
        return veces_dia;
    }

    public void setVeces_dia(int veces_dia) {
        this.veces_dia = veces_dia;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
    
}
