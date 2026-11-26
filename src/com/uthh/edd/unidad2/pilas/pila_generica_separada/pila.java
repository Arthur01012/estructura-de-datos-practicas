package com.uthh.edd.unidad2.pilas.pila_generica_separada;

public class pila<T> {
    private nodo<T> tope;
    private int tamano;

    public pila() {
        tope = null;
        tamano = 0;
    }

    public void push(T valor) { // * agrega un elemento a la cima de la pila */
        nodo<T> nuevo = new nodo<T>(valor);
        nuevo.setSiguiente(tope); // el nuevo nodo queda apuntando al antiguo tope
        tope = nuevo; // y se convierte en el nuevo tope
        tamano++;
    }

    public T pop() {// * saca el elemento de la cima de la pila */
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T valor = tope.getDato();
        tope = tope.getSiguiente(); // el segundo elemento pasa a ser el nuevo tope
        tamano--;
        return valor;
    }

    public T peek() {// * devuelve el elemento en la cima de la pila */
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tope.getDato();
    }

    public boolean isEmpty() {// * verifica que la pila esté vacía */
        return tope == null;
    }

    public int size() {// * devuelve el tamaño de la pila */
        return tamano;
    }

}
