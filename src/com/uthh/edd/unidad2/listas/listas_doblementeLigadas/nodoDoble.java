package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

//* Nodo de una lista doblemente ligada (dato, enlace siguiente y enlace anterior).
public class nodoDoble {
    private int dato;
    private nodoDoble siguiente;
    private nodoDoble anterior;

    //* Crea un nodo aislado sin enlaces.
    public nodoDoble(int x) {
        this.dato = x;
        this.siguiente = null;
        this.anterior = null;
    }

    //* Crea un nodo enlazado a un nodo siguiente.
    public nodoDoble(int x, nodoDoble sig) {
        this.dato = x;
        this.siguiente = sig;
        this.anterior = null;
    }

    //* Crea un nodo con referencias al siguiente y al anterior.
    public nodoDoble(int x, nodoDoble sig, nodoDoble ant) {
        this.dato = x;
        this.siguiente = sig;
        this.anterior = ant;
    }

    //* Obtiene el dato almacenado.
    public int getDato() {
        return dato;
    }

    //* Actualiza el dato almacenado.
    public void setDato(int x) {
        this.dato = x;
    }

    //* Obtiene el nodo siguiente.
    public nodoDoble getSiguiente() {
        return siguiente;
    }

    //* Asigna el nodo siguiente.
    public void setSiguiente(nodoDoble sig) {
        this.siguiente = sig;
    }

    //* Obtiene el nodo anterior.
    public nodoDoble getAnterior() {
        return anterior;
    }

    //* Asigna el nodo anterior.
    public void setAnterior(nodoDoble ant) {
        this.anterior = ant;
    }
}
