package com.uthh.edd.unidad2.listas.listas_ligadas;

import java.io.IOException;
import java.util.Scanner;

//* Clase principal con menú interactivo para operar ListaEnlazada.
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(teclado, "Selecciona una opción: ");

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Lista: ");
                        lista.mostrar();
                        break;
                    case 2:
                        System.out.println("La lista está " + (lista.estaVacia() ? "vacía." : "ocupada."));
                        break;
                    case 3:
                        System.out.println("Tamaño de la lista: " + lista.getTamanio());
                        break;
                    case 4:
                        int buscado = leerEntero(teclado, "Valor a buscar: ");
                        System.out.println(lista.buscar(buscado)
                                ? "El valor sí está en la lista."
                                : "El valor no está en la lista.");
                        break;
                    case 5:
                        int valorInicio = leerEntero(teclado, "Valor a insertar al inicio: ");
                        lista.insertarInicio(valorInicio);
                        System.out.println("Valor insertado al inicio.");
                        break;
                    case 6:
                        int valorFinal = leerEntero(teclado, "Valor a insertar al final: ");
                        lista.insertarFinal(valorFinal);
                        System.out.println("Valor insertado al final.");
                        break;
                    case 7:
                        int eliminado = leerEntero(teclado, "Valor a eliminar: ");
                        System.out.println(lista.eliminar(eliminado)
                                ? "El valor fue eliminado de la lista."
                                : "El valor no se encontró en la lista.");
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (IndexOutOfBoundsException | IllegalStateException ex) {
                System.out.println("No se pudo completar la operación: " + ex.getMessage());
            }
            System.out.println();
            System.out.println("Press Enter to continue...");
            System.in.read();
            limpiarConsola();
        } while (opcion != 0);

        teclado.close();
    }

    // * Muestra las opciones del menú agrupadas por categoría.
    private static void mostrarMenu() {
        System.out.println("=== LISTA LIGADA ===");
        System.out.println("CONSULTAS");
        System.out.println(" 1. Mostrar lista");
        System.out.println(" 2. Verificar si está vacía");
        System.out.println(" 3. Consultar tamaño");
        System.out.println(" 4. Buscar valor");
        System.out.println("INSERCIONES");
        System.out.println(" 5. Insertar al inicio");
        System.out.println(" 6. Insertar al final");
        System.out.println("ELIMINACIONES");
        System.out.println(" 7. Eliminar valor");
        System.out.println(" 0. Salir");
    }

    // * Lee un número entero validando la entrada del usuario.
    private static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (teclado.hasNextInt()) {
                return teclado.nextInt();
            }
            System.out.println("Entrada no válida. Escribe un número entero.");
            teclado.next();
        }
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
