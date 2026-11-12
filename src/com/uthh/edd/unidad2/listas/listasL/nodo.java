package com.uthh.edd.unidad2.listas.listasL;

public class nodo {
    // atriburos del nodo
    private int dato;
    private nodo siguiente;

    // constructores del nodo

    // insertar al funal de la lista
    public nodo(int x) {
        dato = x;
        siguiente = null;
    }

    // insertar al inicio de la lista
    public nodo(int x, nodo sig) {
        dato = x;
        siguiente = sig;
    }

    // metodos de acceso

    public void setDato(int x) {
        dato = x;
    }

    public int getDato() {
        return dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo sig) {
        siguiente = sig;
    }
}
