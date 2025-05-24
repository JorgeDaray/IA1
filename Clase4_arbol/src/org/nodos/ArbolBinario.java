
package org.nodos;

public class ArbolBinario {
    arbol_nodos raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private arbol_nodos insertarRec(arbol_nodos nodo, int valor) {
        if (nodo == null) {
            return new arbol_nodos(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }

     public arbol_nodos buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private arbol_nodos buscarRec(arbol_nodos nodo, int valor) {
        if (nodo == null || nodo.valor == valor) {
            return nodo;
        }

        if (valor < nodo.valor) {
            return buscarRec(nodo.izquierdo, valor);
        } else {
            return buscarRec(nodo.derecho, valor);
        }
    }
    
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private arbol_nodos eliminarRec(arbol_nodos nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = eliminarRec(nodo.derecho, valor);
        } else {
            // Caso 1: El nodo tiene 0 o 1 hijo
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }

            // Caso 2: El nodo tiene 2 hijos
            nodo.valor = encontrarMinimo(nodo.derecho);
            nodo.derecho = eliminarRec(nodo.derecho, nodo.valor);
        }
        return nodo;
    }
    
    private int encontrarMinimo(arbol_nodos nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo.valor;
    }
    
    public void recorridoInorden(arbol_nodos nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecho);
        }
    }
}
