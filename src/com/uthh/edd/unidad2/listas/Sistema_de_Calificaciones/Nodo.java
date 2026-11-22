package com.uthh.edd.unidad2.listas.Sistema_de_Calificaciones;

public class Nodo {
    int dato; // valor almacenado en el nodo
    Nodo siguiente; // referencia al siguiente nodo (null si es el último)

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
        // constructores del nodo


    // insertar al inicio de la lista
    public Nodo(int x, Nodo sig) {
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

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo sig) {
        siguiente = sig;
    }
}
