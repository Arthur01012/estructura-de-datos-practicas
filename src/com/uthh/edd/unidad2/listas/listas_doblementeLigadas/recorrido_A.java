package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

//clase que recorre la lista doblemente ligada desde la cabeza hasta la cola
public class recorrido_A {
    private nodo cabeza; // primer nodo de la lista

    public recorrido_A() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void setCabeza(nodo cabeza) {
        this.cabeza = cabeza;
    }

    public void recorrerDesdeCabeza() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        nodo actual = cabeza;
        System.out.println("Recorriendo desde la cabeza hasta la cola:");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente; // Avanzar hacia el nodo siguiente
        }
        System.out.println();
    }

    public void recorrerDesdeCola() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        nodo actual = cabeza;
        // Avanzar hasta el último nodo
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        System.out.println("Recorriendo desde la cola hasta la cabeza:");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior; // Avanzar hacia el nodo anterior
        }
        System.out.println();
    }
}
