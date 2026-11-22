package com.uthh.edd.unidad2.listas.Sistema_de_Calificaciones;

public class ListaEnlazada {
    int tamano; // tamaño de la lista
    Nodo cabeza; // referencia al primer nodo de la lista

    // Constructor
    public ListaEnlazada() {
        this.tamano = 0;
        this.cabeza = null;
    }
    //setters
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    //getters
    public int getTamano() {
        return tamano;
    }   
    public Nodo getCabeza() {
        return cabeza;
    }
}
