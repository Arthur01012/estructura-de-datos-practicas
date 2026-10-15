package com.uthh.edd.unidad1.recursion;

//tiene que recibir un vslor
//tiene que retornar un valor
//el caso base determina hasta donde se va a llegar (donde termina)
//el caso recursivo 
//pila de ejecucion
public class recursvidad {
    /*
     * public static int factorial(int n) {
     * if (n == 0) { // caso base
     * return 1;
     * }
     * return n * factorial(n - 1); // caso recursivo
     * }
    
    public static int sumar(int[] arr, int indice) {
        if (indice == arr.length) { // caso base: ya no quedan elementos
            return 0;
        }
        return arr[indice] + sumar(arr, indice + 1);
    }
*/

    public static int sumatoriaR(int x) {
        if(x==0){
        System.out.println("Entro al caso base y x vale " + x);
            return x;
        }
        System.out.println("Antes de apilar, x vale " + x);
        x =  x + sumatoriaR(x-1);
        System.out.println("Desapilando x vale " + x);
        return x;
    }
    /*
     * public static int fibonacci(int n) {
     * if (n <= 1) {
     * return n; // caso base
     * }
     * return fibonacci(n - 1) + fibonacci(n - 2);
     * }
     */

    public static void main(String[] args) {
        // System.out.println("Factoriral de 5: " + factorial(5));
        // System.out.println("Suma: " + sumar(null, 1));
        System.out.println("Sumatoria: " + sumatoriaR(5));
        // System.out.println("fibonacci:" + fibonacci(50));

    }

}
