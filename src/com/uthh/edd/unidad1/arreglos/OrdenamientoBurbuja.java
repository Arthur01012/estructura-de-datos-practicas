package com.uthh.edd.unidad1.arreglos;

public class OrdenamientoBurbuja {
    public static void ordenamientoBurbuja(int[] arreglo) {
        // Implementación tradicional del método de burbuja (recorre el arreglo
        // completamente en cada iteración).
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        // Implementación optimizada que detecta si en una pasada no hubo ningún
        // intercambio, interrumpiendo el ciclo anticipadamente.
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean huboCambio = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboCambio = true;
                }
            }
            if (!huboCambio) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };

        ordenamientoBurbuja(arreglo);
        long inicio = System.nanoTime();
        ordenamientoBurbujaMejorado(arreglo);
        long fin = System.nanoTime();
        System.err.println("Tomo en ordenar:" + (fin-inicio));
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
