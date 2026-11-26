package com.uthh.edd.unidad2.colas.cola_int;

public class cola {

    private nodo frente;
    private nodo final_;
    private int tamano = 0;

    public void enqueue(int valor) {// * agrega un elemento al final de la cola */
        nodo nuevo = new nodo(valor);
        if (isEmpty()) {
            frente = nuevo; // primer elemento: es a la vez frente y final
        } else {
            final_.siguiente = nuevo; // se engancha después del último actual
        }
        final_ = nuevo;
        tamano++;
    }

    public int dequeue() {// * saca el elemento del frente de la cola */
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = frente.dato;
        frente = frente.siguiente; // el segundo elemento pasa a ser el nuevo frente
        if (frente == null) {
            final_ = null; // la cola quedó vacía: también se limpia el final
        }
        tamano--;
        return valor;
    }

    public int peek() {// * devuelve el elemento del frente de la cola */
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    public boolean isEmpty() {// * verifica que la cola esté vacía */
        return frente == null;
    }

    public int size() {// * devuelve el tamaño de la cola */
        return tamano;
    }
}
