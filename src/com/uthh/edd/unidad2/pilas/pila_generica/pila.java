package com.uthh.edd.unidad2.pilas.pila_generica;

public class pila<T> {

private class Nodo {
        T dato;
        Nodo siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo tope;
    private int tamano = 0;

    public void push(T valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;   // el nuevo nodo queda apuntando al antiguo tope
        tope = nuevo;             // y se convierte en el nuevo tope
        tamano++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T valor = tope.dato;
        tope = tope.siguiente;    // el segundo elemento pasa a ser el nuevo tope
        tamano--;
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tope.dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public int size() {
        return tamano;
    }

}
