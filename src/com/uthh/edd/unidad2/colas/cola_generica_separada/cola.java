package com.uthh.edd.unidad2.colas.cola_generica_separada;

public class cola<T> {
    private nodo<T> frente;
    private nodo<T> final_;
    private int tamano = 0;

    public void enqueue(T valor) {// * agrega un elemento al final de la cola */
        nodo<T> nuevo = new nodo<>(valor);
        if (isEmpty()) {
            frente = nuevo; // primer elemento: es a la vez frente y final
        } else {
            final_.siguiente = nuevo; // se engancha después del último actual
        }
        final_ = nuevo;
        tamano++;
    }

    public T dequeue() {// * saca el elemento del frente de la cola */
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente; // el segundo elemento pasa a ser el nuevo frente
        if (frente == null) {
            final_ = null; // la cola quedó vacía: también se limpia el final
        }
        tamano--;
        return valor;
    }

    public T peek() {// * devuelve el elemento del frente de la cola */
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
