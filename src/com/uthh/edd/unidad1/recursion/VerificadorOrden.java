package com.uthh.edd.unidad1.recursion;
public class VerificadorOrden {
    public static boolean estaOrdenado(int[] datos) {
        if (datos != null) {//verifica que el arreglo no sea 
            if (datos.length == 0 || datos.length == 1) {//si el arreglo tiene 0 o 1 elemento, se considera ordenado
                return true;
            } else {//si no es nulo y tiene más de 1 elemento, se llama a la función auxiliar para verificar el orden
                return verificarAuxiliar(datos, 0);//llama a la función auxiliar para verificar el orden del arreglo
            }
        }
        return false;//si el arreglo es nulo, se considera desordenado
    }
    private static boolean verificarAuxiliar(int[]datos, int indice){
        if (indice == datos.length - 1) {//caso base 1: si se llega al último elemento, significa que todos los elementos anteriores están en orden
            return true;
        }
        if (datos[indice] > datos[indice + 1]) {//caso base 2: si el elemento actual es mayor que el siguiente, significa que el arreglo no está ordenado
            return false;
        }
        return verificarAuxiliar(datos, indice + 1);//llama a la función auxiliar para verificar el siguiente elemento
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese el tamano del arreglo: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("El arreglo está ordenado: " + VerificadorOrden.estaOrdenado(arreglo));
    }
}
