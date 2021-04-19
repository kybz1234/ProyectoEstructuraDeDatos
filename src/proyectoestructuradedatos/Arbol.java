/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuradedatos;

/**
 *
 * @author osval
 */
public class Arbol {

    NodoArbol raíz;

    public boolean vacío() {
        return raíz == null;
    }

    public void agregar(NodoArbol nuevoNodo) {
        if (vacío()) {
            raíz = nuevoNodo;
        } else {
            agregarRecursivo(raíz, nuevoNodo);
        }
    }

    private void agregarRecursivo(NodoArbol subRaiz, NodoArbol nuevoNodo) {
        if (nuevoNodo.dato <= subRaiz.dato) {
            if (subRaiz.izquierdo == null) {
                subRaiz.izquierdo = nuevoNodo;
            } else {
                agregarRecursivo(subRaiz.izquierdo, nuevoNodo);
            }
        } else {
            if (subRaiz.derecho == null) {
                subRaiz.derecho = nuevoNodo;
            } else {
                agregarRecursivo(subRaiz.derecho, nuevoNodo);
            }
        }
    }
    
    public String mostrar() {
        if (vacío()) {
            return "El Árbol está vacío.";
        } else {
            return mostrarRecursivo(raíz);
        }
    }

    private String mostrarRecursivo(NodoArbol subRaíz) {
        if (subRaíz != null) {
            return subRaíz.dato
                    + ", "
                    + mostrarRecursivo(subRaíz.izquierdo)
                    + mostrarRecursivo(subRaíz.derecho);
        }
        return "";
    }
}
