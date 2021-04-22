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
public class NodoCola {
    private Tiquete tiquete;
    private NodoCola siguiente;

    public NodoCola() {
    }

   
    public NodoCola(int numero,String cedula, String servicio, int prioridad) {
        tiquete = new Tiquete(numero,cedula, servicio, prioridad);
        siguiente = null;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
