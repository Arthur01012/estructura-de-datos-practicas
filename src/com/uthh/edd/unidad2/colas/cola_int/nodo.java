package com.uthh.edd.unidad2.colas.cola_int;

public class nodo {
    
    int dato;
    nodo siguiente;

    public nodo(int valor) {
        this.dato = valor;
        this.siguiente = null;
    }

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
