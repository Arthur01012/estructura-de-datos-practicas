package com.uthh.edd.unidad2.colas.cola_generica_separada;

public class main {
    public static void main(String[] args) {
        cola<Integer> cola = new cola<>();

        // Agregar elementos a la cola
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

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
            System.out.println("Intentando sacar un elemento de una cola vacía...");
            cola.dequeue();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
