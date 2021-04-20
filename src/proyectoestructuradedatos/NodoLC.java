/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoestructuradedatos;

/**
 * 
 * @author Carlos Quiros
 */
public class NodoLC {

    public int cedula;
    public int tiquete;
    public int servicio;
    public int prioridad;
    public NodoLC siguiente;

    public NodoLC(int cedula, int tiquete, int servicio, int prioridad) {
        this.cedula = cedula;
        this.tiquete = tiquete;
        this.servicio = servicio;
        this.prioridad = prioridad;
    }
    
    
    
}
