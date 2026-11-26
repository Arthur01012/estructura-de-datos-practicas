package com.uthh.edd.unidad2.pilas.pila_generica_separada;

public class nodo {

    public nodo(int valor) {
    }
    int dato;
    nodo siguiente;

    public int getDato() {
        return dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
