package com.uthh.edd.unidad2.listas.Sistema_de_Calificaciones;

import java.io.IOException;
import java.util.Scanner;

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
                        System.out.println("Lista de calificaciones: " + mostrarLista(lista));
                        break;
                    case 2:
                        System.out.println("La lista está " + (lista.estaVacia() ? "vacía." : "ocupada."));
                        break;
                    case 3:
                        System.out.println("Total de estudiantes que entregaron: " + lista.totalEstudiantes());
                        break;
                    case 4:
                        int calificacionValidada = leerEntero(teclado, "Calificación a registrar (0 - 10): ");
                        if (lista.evitarCAlificacionesErroneas(calificacionValidada)) {
                            System.out.println("Calificación registrada en orden ascendente.");
                        } else {
                            System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                        }
                        break;
                    case 5:
                        int calificacion = leerEntero(teclado, "Calificación a insertar: ");
                        lista.insertarOrdenado(calificacion);
                        System.out.println("Calificación insertada en orden ascendente.");
                        break;
                    case 6:
                        int buscada = leerEntero(teclado, "Calificación a buscar: ");
                        System.out.println(lista.consultarCalificacion(buscada)
                                ? "Sí hay estudiantes con esa calificación."
                                : "Nadie sacó esa calificación.");
                        break;
                    case 7:
                        System.out.println("Calificación mínima: " + lista.obtenerCalificacionMinima());
                        break;
                    case 8:
                        System.out.println("Calificación máxima: " + lista.obtenerCalificacionMaxima());
                        break;
                    case 9:
                        System.out.println("Media (promedio) de calificaciones: " + lista.obtenerCalificacionMedia());
                        break;
                    case 10:
                        System.out.println("Mediana de calificaciones: " + lista.obtenerCalificacionMediana());
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

    private static void mostrarMenu() {
        System.out.println("=== SISTEMA DE CALIFICACIONES ===");
        System.out.println("CONSULTAS GENERALES");
        System.out.println(" 1. Mostrar lista de calificaciones (ordenada)");
        System.out.println(" 2. Verificar si la lista está vacía");
        System.out.println(" 3. Ver total de estudiantes que entregaron");
        System.out.println("REGISTRO");
        System.out.println(" 4. Registrar calificación validada (0 - 10)");
        System.out.println(" 5. Insertar calificación directamente (ordenada)");
        System.out.println("BÚSQUEDA Y ESTADÍSTICAS");
        System.out.println(" 6. Saber si alguien sacó una calificación específica");
        System.out.println(" 7. Consultar calificación mínima");
        System.out.println(" 8. Consultar calificación máxima");
        System.out.println(" 9. Consultar media (promedio)");
        System.out.println("10. Consultar mediana");
        System.out.println(" 0. Salir");
    }

    private static String mostrarLista(ListaEnlazada lista) {
        String res = "";
        Nodo aux = lista.getCabeza();
        while (aux != null) {
            res += aux.getDato() + " -> ";
            aux = aux.getSiguiente();
        }
        res += "null";
        return res;
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

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
