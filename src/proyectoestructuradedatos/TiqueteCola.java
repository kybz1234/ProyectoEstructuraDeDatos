/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuradedatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Dylan
 */
public class TiqueteCola {

    private NodoCola inicio = null;
    private NodoCola fin;

    public NodoCola getInicio() {
        return inicio;
    }

    public void setInicio(NodoCola inicio) {
        this.inicio = inicio;
    }

    public NodoCola getFin() {
        return fin;
    }

    public void setFin(NodoCola fin) {
        this.fin = fin;
    }

    
    
    
    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar(int numero, String cedula, String servicio, int prioridad) {
        NodoCola nuevoDato = new NodoCola(numero, cedula, servicio, prioridad);
        if (vacia()) {
            inicio = nuevoDato;
            fin = nuevoDato;
        } else {
            fin.setSiguiente(nuevoDato);
            fin = nuevoDato;
        }
    }

    public void eliminar(NodoCola actual, NodoCola anterior, int buscado) {
        actual = inicio;
        anterior = null;
        boolean encontrado = false;
        if (inicio != null) {
            while (actual != null && encontrado != true) {
                if (actual.getTiquete().getNumeroTiquete() == buscado) {
                    if (actual == inicio) {
                        inicio = inicio.getSiguiente();
                    } else if (actual == fin) {
                        anterior.setSiguiente(null);
                        fin = anterior;
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }

    }

    public String mostrar() {
        if (vacia()) {
            return null;
        } else {
            String cola = "";
            NodoCola actual = inicio;
            while (actual != null) {
                cola += actual.getTiquete().getNumeroTiquete() + " | " + actual.getTiquete().getCedula() + " | "
                        + actual.getTiquete().getTipoServicio() + " | " + actual.getTiquete().getPrioridad() + "\n";
                actual = actual.getSiguiente();
            }
            return cola;
        }
    }

    //By Dylan
    public NodoCola extraeData(boolean continuar, int contador) {
        NodoCola extrae = null;
        if (continuar) {
            if (contador == 0) {
                extrae = inicio;
            } else {
                extrae = inicio;
                for (int i = 0; i < contador; i++) {
                    extrae = extrae.getSiguiente();
                }
            }
        } else {
            extrae = null;
        }
        return extrae;
    }

    public ListaCircularSimple moverCola(ListaCircularSimple ln, NodoCola c, int prioridad) {
        boolean bandera = true;
        
        while (bandera == true) {
            if (c.getSiguiente() != null) {
                while (c.getSiguiente() != null) {
                    if (c.getTiquete().getPrioridad() == prioridad) {
                        int tiquete = c.getTiquete().getNumeroTiquete();
                        String cedula = c.getTiquete().getCedula();
                        String servicio = c.getTiquete().getTipoServicio();
                        int p = c.getTiquete().getPrioridad();

                        ln.agregar(cedula, tiquete, servicio, p);

                    }
                }
                moverCola(ln, c, prioridad++);
                if (prioridad < 4) {
                    bandera = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "La Fila está vacía");
                bandera = false;

            }
        }

        return ln;
    }

    //End Dylan
    public void vaciarCola() {
        NodoCola actual = inicio;
        NodoCola anterior = inicio;
        if (inicio != null) {
            while (actual != null) {
                if (actual == inicio) {
                    inicio = inicio.getSiguiente();
                } else if (actual == fin) {
                    anterior.setSiguiente(null);
                    fin = anterior;
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
    }

}
