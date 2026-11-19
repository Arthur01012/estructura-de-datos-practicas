package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

public class operaciones {
    private nodo cabeza;
    private nodo cola;
    private int tamanio; // cantidad de nodos almacenados

    public operaciones() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void insertarInicio(int dato) {
        nodo nuevo = new nodo(dato);
        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        tamanio++;
    }

    public void insertarFinal(int dato) {
        nodo nuevo = new nodo(dato);
        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        tamanio++;
    }

    public boolean buscar(int dato) {
        nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public boolean eliminar(int dato) {
        nodo actual = cabeza;
        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }
        if (actual == null) {
            return false;
        }

        if (actual.anterior == null) {
            cabeza = actual.siguiente;
        } else {
            actual.anterior.siguiente = actual.siguiente;
        }

        if (actual.siguiente == null) {
            cola = actual.anterior;
        } else {
            actual.siguiente.anterior = actual.anterior;
        }

        tamanio--;
        return true;
    }

    public void mostrarAdelante() {
        if (estaVacia()) {
            System.out.println("(lista vacía)");
            return;
        }

        nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" <-> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void mostrarAtras() {
        if (estaVacia()) {
            System.out.println("(lista vacía)");
            return;
        }

        nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.anterior != null) {
                System.out.print(" <-> ");
            }
            actual = actual.anterior;
        }
        System.out.println();
    }
}
