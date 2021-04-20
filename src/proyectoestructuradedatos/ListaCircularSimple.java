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
