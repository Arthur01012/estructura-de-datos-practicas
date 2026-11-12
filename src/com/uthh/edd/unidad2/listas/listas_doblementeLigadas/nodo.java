package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

public class nodo {
    int dato;
    nodo siguiente;
    nodo anterior;

    public nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
