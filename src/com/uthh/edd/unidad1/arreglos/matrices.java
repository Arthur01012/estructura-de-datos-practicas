package com.uthh.edd.unidad1.arreglos;

public class matrices {
    public static void cambio(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
                int temp = arr[i, 1];
                arr[i,1] = arr[i,2];
                arr[i,2] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int filas : arr) {
            for (int col : filas) {
                System.out.println(arr[filas]);
            }
            System.out.println();
        }
    }
}
