package com.uthh.edd.unidad2.listas.listas_ligadas;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion;

        do {
            System.out.println("\n===== MENÚ LISTA LIGADA =====");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Buscar un valor");
            System.out.println("4. Eliminar un valor");
            System.out.println("5. Mostrar la lista");
            System.out.println("6. Ver tamaño");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    lista.insertarInicio(teclado.nextInt());
                    break;
                case 2:
                    System.out.print("Valor: ");
                    lista.insertarFinal(teclado.nextInt());
                    break;
                case 3:
                    System.out.print("Valor a buscar: ");
                    int buscado = teclado.nextInt();
                    System.out.println(lista.buscar(buscado)
                            ? "Sí está en la lista"
                            : "No está en la lista");
                    break;
                case 4:
                    System.out.print("Valor a eliminar: ");
                    int eliminado = teclado.nextInt();
                    System.out.println(lista.eliminar(eliminado)
                            ? "Eliminado"
                            : "No encontrado");
                    break;
                case 5:
                    lista.mostrar();
                    break;
                case 6:
                    System.out.println("Tamaño: " + lista.getTamanio());
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        teclado.close();
    }

}
