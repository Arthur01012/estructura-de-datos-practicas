package com.uthh.edd.unidad2.pilas.pila_generica_separada;

public class pila {
    private nodo tope;
    private int tamano;

    public pila() {
        tope = null;
        tamano = 0;
    }

    public void push(int valor) {
        nodo nuevo = new nodo(valor);
        nuevo.setSiguiente(tope); // el nuevo nodo queda apuntando al antiguo tope
        tope = nuevo; // y se convierte en el nuevo tope
        tamano++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valor = tope.getDato();
        tope = tope.getSiguiente(); // el segundo elemento pasa a ser el nuevo tope
        tamano--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tope.getDato();
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public int size() {
        return tamano;
    }

}
