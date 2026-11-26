package com.uthh.edd.unidad2.colas.cola_generica_separada;

public class nodo<T> {

    T dato;
    nodo<T> siguiente;

    public nodo(T valor) {
        this.dato = valor;
        this.siguiente = null;
    }

}
