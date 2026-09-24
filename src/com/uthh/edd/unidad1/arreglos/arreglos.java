package com.uthh.edd.unidad1.arreglos;

public class arreglos {

    public static void main(String[] args) {
        // 1. Declaración: solo se indica el tipo y el nombre
        int[] numeros;

        // 2. Creación: reservar memoria para 6 posiciones (todas en 0 por defecto)
        numeros = new int[6];

        // Declaración + creación en un solo paso, con valores iniciales
        int[] numeros2 = {12, 45, 7, 88, 3, 60};

        // 3. Manipulación
        numeros[0] = 100;              // asignar un valor en el índice 0
        int primero = numeros[0];   // leer el valor del índice 0
        int tamano = numeros.length;   // consultar cuántos elementos tiene

        // Recorrido con for clásico (usa el índice)
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posición " + i + ": " + numeros[i]);
        }

        // Recorrido con for-each (no necesita el índice)
        for (int valor : numeros) {
            System.out.println(valor);
        }


        System.out.println("--------------------------------");

        String[] nombres = {"Ana", "Luis", "Marco"};


        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("--------------------------------");
        // Matriz 3x3 (arreglo de arreglos)
        int[][] tablero = new int[3][3];
        tablero[1][2] = 7;  // fila 1, columna 2
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
