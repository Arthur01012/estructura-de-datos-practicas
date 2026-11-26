package com.uthh.edd.unidad2.pilas.pila_generica_separada;

public class nodo<T> {

    T dato;
    nodo<T> siguiente;

    public nodo(T valor) {
        this.dato = valor;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSiguiente(nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
