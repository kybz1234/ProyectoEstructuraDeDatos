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
public class ListaCircularSimple {

    private NodoLC cabeza;
   
    
    
    public boolean vacia (){
        
        return cabeza == null;
        
        
        
    }
    
    
    //By Dylan
    
    TiqueteCola cola = new TiqueteCola();
    
    public void agregar(String cedula, int numero, String servicio, int prioridad) {
        //Modifica agregar: Hay que actualizar el último nodo.
        NodoLC nuevo = new NodoLC(cedula, numero, servicio, prioridad);
        if (vacia()) {
            cabeza = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            NodoLC temporal = cabeza;
            //Último no apunta a siguiente null
            while (temporal.siguiente != cabeza) {
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevo;
            //actualiza cabeza
            nuevo.siguiente = cabeza;
        }
    }
    
    public String mostrar() {
        String lista = "";

        if (vacia()) {
            lista = "Vacía";
        } else {
            NodoLC temporal = cabeza;

            do {
                lista += temporal.tiquete + " - ";
                temporal = temporal.siguiente;
            } while (temporal != cabeza);//mientras no vuelva a la cabeza

            lista += " FIN";
        }

        return lista;
    }
    
    //End Dylan
    
    
    public NodoLC buscar (int tiquete){
        
        NodoLC resultado = null ;
        
        if (!vacia()){
            
            NodoLC temporal = cabeza;
            
            do{
                
                if (temporal.tiquete == tiquete){
                    
                    resultado = temporal;
                }
                temporal = temporal.siguiente;
            }while (temporal != cabeza);
            
            
        }
        
        return resultado;
        
        
    }
    
    public int buscarRepetidos (int tiquete){
        
        int resultado = 0 ;
        
        if (!vacia()){
            
            NodoLC temporal = cabeza;
            
            do{
                
                if (temporal.tiquete == tiquete){
                    
                    resultado ++;
                }
                temporal = temporal.siguiente;
            }while (temporal != cabeza);
            
            
        }
        
        return resultado;
        
        
    }

}
