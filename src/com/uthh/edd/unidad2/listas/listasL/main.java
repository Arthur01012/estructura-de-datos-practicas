package com.uthh.edd.unidad2.listas.listasL;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        listaLigada lista = new listaLigada();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(teclado, "Selecciona una opción: ");

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Lista: " + lista);
                        break;
                    case 2:
                        System.out.println("La lista está " + (lista.estaVacia() ? "vacía." : "ocupada."));
                        break;
                    case 3:
                        System.out.println("Tamaño de la lista: " + lista.getTamano());
                        break;
                    case 4:
                        int buscado = leerEntero(teclado, "Dato a buscar: ");
                        System.out.println(lista.buscar(buscado)
                                ? "El dato sí está en la lista."
                                : "El dato no está en la lista.");
                        break;
                    case 5:
                        lista.insertarAlInicio(leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado al inicio.");
                        break;
                    case 6:
                        lista.insertarAlFinal(leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado al final.");
                        break;
                    case 7:
                        lista.insertarEnPosisicon(
                                leerEntero(teclado, "Índice (desde 0): "),
                                leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado en la posición indicada.");
                        break;
                    case 8:
                        lista.insertarOrdenado(leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado en orden ascendente.");
                        break;
                    case 9:
                        int indiceActualizar = leerEntero(teclado, "Índice a actualizar (desde 0): ");
                        int nuevoDato = leerEntero(teclado, "Nuevo dato: ");
                        lista.actualizar(indiceActualizar, nuevoDato);
                        System.out.println("Dato actualizado.");
                        break;
                    case 10:
                        System.out.println("Dato eliminado: " + lista.eliminarInicio());
                        break;
                    case 11:
                        int posicion = leerEntero(teclado, "Posición a eliminar (desde 1): ");
                        System.out.println("Dato eliminado: " + lista.EliminarEnPosicion(posicion));
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
        } while (opcion != 0);

        teclado.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== LISTA LIGADA ===");
        System.out.println("CONSULTAS");
        System.out.println(" 1. Mostrar lista");
        System.out.println(" 2. Verificar si está vacía");
        System.out.println(" 3. Consultar tamaño");
        System.out.println(" 4. Buscar dato");
        System.out.println("INSERCIONES");
        System.out.println(" 5. Insertar al inicio");
        System.out.println(" 6. Insertar al final");
        System.out.println(" 7. Insertar en índice");
        System.out.println(" 8. Insertar ordenadamente (ascendente)");
        System.out.println("MODIFICACIÓN");
        System.out.println(" 9. Actualizar dato por índice");
        System.out.println("ELIMINACIONES");
        System.out.println("10. Eliminar al inicio");
        System.out.println("11. Eliminar por posición");
        System.out.println(" 0. Salir");
    }

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
}
