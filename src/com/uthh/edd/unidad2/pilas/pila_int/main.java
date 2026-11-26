package com.uthh.edd.unidad2.pilas.pila_int;

public class main {
    public static void main(String[] args) {
        pila p = new pila();
        p.push(10);
        p.push(20);
        p.push(30);

        System.out.println("Elemento en el tope: " + p.peek()); // Muestra 30
        System.out.println("Tamaño de la pila: " + p.size()); // Muestra 3

        System.out.println("Elemento eliminado: " + p.pop()); // Elimina 30
        System.out.println("Elemento en el tope: " + p.peek()); // Muestra 20
        System.out.println("Tamaño de la pila: " + p.size()); // Muestra 2
    }
}
