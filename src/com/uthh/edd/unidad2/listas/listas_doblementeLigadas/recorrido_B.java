package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

//clase que recorre la lista doblemente ligada desde la cola hasta la cabeza
public class recorrido_B {
    private nodo cola; // último nodo de la lista
    private int tamanio; // cantidad de nodos almacenados

    public recorrido_B() {
        this.cola = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return cola == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setCola(nodo cola) {
        this.cola = cola;
    }

    public void recorrerDesdeCola() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        nodo actual = cola;
        System.out.println("Recorriendo desde la cola hasta la cabeza:");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior; // Avanzar hacia el nodo anterior
        }
        System.out.println();
    }

    public void recorrerDesdeCabeza() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        nodo actual = cola;
        // Avanzar hasta la cabeza
        while (actual.anterior != null) {
            actual = actual.anterior;
        }

        System.out.println("Recorriendo desde la cabeza hasta la cola:");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente; // Avanzar hacia el nodo siguiente
        }
        System.out.println();
    }
    

}
