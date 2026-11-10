package com.uthh.edd.unidad2.listas.listas_ligadas;

public class Nodo {
    int dato;            // valor almacenado en el nodo
    Nodo siguiente;       // referencia al siguiente nodo (null si es el último)
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }
}
