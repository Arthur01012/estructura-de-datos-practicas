package com.uthh.edd.unidad2.colas.cola_int;

public class main {
    public static void main(String[] args) {
        cola cola = new cola();

        // Agregar elementos a la cola
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        // Mostrar el tamaño de la cola
        System.out.println("Tamaño de la cola: " + cola.size());

        // Mostrar el elemento del frente de la cola
        System.out.println("Elemento del frente: " + cola.peek());

        // Sacar elementos de la cola
        System.out.println("Elemento sacado: " + cola.dequeue());
        System.out.println("Elemento sacado: " + cola.dequeue());

        // Mostrar el tamaño de la cola después de sacar elementos
        System.out.println("Tamaño de la cola después de sacar elementos: " + cola.size());

        // Sacar el último elemento
        System.out.println("Elemento sacado: " + cola.dequeue());

        // Intentar sacar un elemento de una cola vacía (esto lanzará una excepción)
        try {
            cola.dequeue();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
