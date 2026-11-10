package com.uthh.edd.unidad2.listas.listas_ligadas;

public class ListaEnlazada {
private Nodo cabeza;   // primer nodo de la lista
    private int tamanio;   // cantidad de nodos almacenados

    public ListaEnlazada() {
        
        this.cabeza = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    // Inserta al inicio. Costo: O(1)
    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;   // el nuevo apunta al antiguo primero
        cabeza = nuevo;             // el nuevo pasa a ser la cabeza
        tamanio++; 
    }

    // Inserta al final. Costo: O(n)
    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;   // avanzar hasta el último nodo
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Elimina la primera aparición del valor. Devuelve true si lo eliminó.
    public boolean eliminar(int valor) {
        if (estaVacia()) {
            return false;
        }
        if (cabeza.dato == valor) {       // caso 1: está en la cabeza
            cabeza = cabeza.siguiente;
            tamanio--;
            return true;
        }
        Nodo anterior = cabeza;               // caso 2: está en medio o al final
        Nodo actual = cabeza.siguiente;
        while (actual != null) {
            if (actual.dato == valor) {
                anterior.siguiente = actual.siguiente;  // "saltar" el nodo
                tamanio--;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("(lista vacía)");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

}
