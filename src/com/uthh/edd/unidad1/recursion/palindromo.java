package com.uthh.edd.unidad1.recursion;

public class palindromo {
    public static void main(String[] args) {
        String frase, fraseLimpia; 

        System.out.println("Ingrese una frase: ");
        frase = System.console().readLine();
        fraseLimpia = frase.replace(" ", "").toLowerCase();
        if (fraseLimpia.isEmpty()) {
            System.out.println("La frase está vacía.");
            return;
        }
        System.out.println("La frase es palíndromo? " + esPalindromo(fraseLimpia));
    }
    public static boolean esPalindromo(String texto) {
        if (texto.length() <= 1) {//caso base
            return true;
        }
        if (texto.charAt(0) == texto.charAt(texto.length() - 1)) {
            return esPalindromo(texto.substring(1, texto.length() - 1));
        }
        return false;
    }

}
