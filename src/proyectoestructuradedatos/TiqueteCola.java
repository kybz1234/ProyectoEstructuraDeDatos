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
public class TiqueteCola {
    private NodoCola inicio = null;
    private NodoCola fin;
    public boolean vacia(){
        if (inicio == null) {
            return true;
        }else{
            return false;
        }
    }
    public void agregar(int numero,String cedula, String servicio, int prioridad){
        NodoCola nuevoDato = new NodoCola(numero,cedula, servicio, prioridad);
        if(vacia()){
           inicio = nuevoDato;
           fin = nuevoDato;
        }else{
            fin.setSiguiente(nuevoDato);
            fin = nuevoDato;
        }
    }
    public void eliminar(NodoCola actual, NodoCola anterior, int buscado){
        actual = inicio;
        anterior = null;
        boolean encontrado = false;
        if (inicio!= null) {
            while (actual != null && encontrado != true) {                
                if (actual.getTiquete().getNumeroTiquete() == buscado) {
                    if (actual == inicio) {
                        inicio = inicio.getSiguiente();
                    }else if (actual == fin) {
                        anterior.setSiguiente(null);
                        fin = anterior;
                    }else{
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
        
    }
}
