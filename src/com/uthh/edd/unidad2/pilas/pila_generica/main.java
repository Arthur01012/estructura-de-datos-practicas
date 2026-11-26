package com.uthh.edd.unidad2.pilas.pila_generica;

public class main {
    public static void main(String[] args) {
        pila<Integer> pila = new pila<>();

        // Agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size());

        // Mostrar el elemento en la cima de la pila
        System.out.println("Elemento en la cima: " + pila.peek());

        // Sacar elementos de la pila
        System.out.println("Elemento sacado: " + pila.pop());
        System.out.println("Elemento sacado: " + pila.pop());

        // Mostrar el tamaño de la pila después de sacar elementos
        System.out.println("Tamaño de la pila después de sacar elementos: " + pila.size());

        // Sacar el último elemento
        System.out.println("Elemento sacado: " + pila.pop());

        // Intentar sacar un elemento de una pila vacía (esto lanzará una excepción)
        try {
            System.out.println("Intentando sacar un elemento de una pila vacía...");
            pila.pop();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
