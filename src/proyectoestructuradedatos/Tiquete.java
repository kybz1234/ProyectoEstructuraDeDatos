/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuradedatos;

/**
 *
 * @author Dylan
 */
public class Tiquete {
    private int numeroTiquete;
    private String cedula;
    private String tipoServicio;
    private int prioridad;

    public Tiquete(int numeroTiquete, String cedula, String tipoServicio, int prioridad) {
        this.numeroTiquete = numeroTiquete;
        this.cedula = cedula;
        this.tipoServicio = tipoServicio;
        this.prioridad = prioridad;
    }

    public int getNumeroTiquete() {
        return numeroTiquete;
    }

    public void setNumeroTiquete(int numeroTiquete) {
        this.numeroTiquete = numeroTiquete;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }


    
    
}
