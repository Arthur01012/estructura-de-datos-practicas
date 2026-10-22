package com.uthh.edd.unidad1.arreglos;

public class BusquedaBinarai {

   public static int busqueda(int[] arr, int clave) {
      // Método de búsqueda binaria para un arreglo ordenado.
      int izquierda = 0;
      int derecha = arr.length - 1;
      while (izquierda <= derecha) {
         int medio = izquierda + (derecha - izquierda) / 2;
         if (arr[medio] == clave) {
            return medio;
         } else if (arr[medio] > clave) {
            derecha = medio - 1;
         } else {
            izquierda = medio + 1;
         }
      }
      return -1;
   }

   public static int busquedaRecursiva(int[] arr, int izquierda, int derecha, int clave) {
      if (izquierda > derecha) {
         return -1;
      }
      int medio = izquierda + (derecha - izquierda) / 2;
      if (arr[medio] == clave) {
         return medio;
      } else if (arr[medio] > clave) {
         return busquedaRecursiva(arr, izquierda, medio - 1, clave);
      } else {
         return busquedaRecursiva(arr, medio + 1, derecha, clave);
      }
   }

   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4, 5, 6, 72 };
      int izquierda = 0;
      int derecha = arr.length - 1;
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      System.out.println("Ingrese el número que desea buscar:");
      int clave = scanner.nextInt();

      // int indice = busqueda(arr, clave);
      int indice = busquedaRecursiva(arr, izquierda, derecha, clave);
      if (indice >= 0) {
         System.out.println("El número se encuentra en el índice " + indice + ".");
      } else {
         System.out.println("El número no se encuentra en el arreglo.");
      }
   }
}
