package com.uthh.edd.unidad1.recursion;

public class InversorCadena {
    public String invertir(String texto) {
        if (texto != null) {// verifica que el texto no sea nulo
            if (texto.length() == 0 || texto.length() == 1) {// si el texto tiene 0 o 1 caracter, se considera invertido
                return texto;
            } else {
                return invertirAuxiliar(texto, 0);// si no es nulo y tiene más de 1 caracter, se llama a la función
                                                  // auxiliar para invertir el texto
            }
        }
        return null;// si el texto es nulo, se devuelve null
    }

    private String invertirAuxiliar(String texto, int indice) {
        if (indice == texto.length() - 1) {// caso base: si se llega al último caracter, se devuelve ese caracter
            return String.valueOf(texto.charAt(indice));// devuelve el último caracter como una cadena
        }
        return invertirAuxiliar(texto, indice + 1) + texto.charAt(indice);/*  llama a la función auxiliar para invertir
                                                                              el siguiente caracter y concatena el
                                                                              caracter actual al final*/
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        InversorCadena inversor = new InversorCadena();
        String textoInvertido = inversor.invertir(texto);
        System.out.println("La cadena invertida es: " + textoInvertido);
    }
}
