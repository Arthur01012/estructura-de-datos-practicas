package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

import java.io.IOException;
import java.util.Scanner;

//* Clase principal con menú interactivo y batería de pruebas para listaDoble.
public class main {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        listaDoble lista = new listaDoble();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(teclado, "Selecciona una opción: ");

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Lista (cabeza -> cola): " + lista);
                        break;
                    case 2:
                        System.out.println("Lista (cola -> cabeza): " + lista.toStringInverso());
                        break;
                    case 3:
                        System.out.println("La lista está " + (lista.estaVacia() ? "vacía." : "ocupada."));
                        break;
                    case 4:
                        System.out.println("Tamaño de la lista: " + lista.getTamanio());
                        break;
                    case 5:
                        int buscado = leerEntero(teclado, "Dato a buscar: ");
                        System.out.println(lista.buscar(buscado)
                                ? "El dato sí está en la lista."
                                : "El dato no está en la lista.");
                        break;
                    case 6:
                        int posConsulta = leerEntero(teclado, "Posición a consultar (desde 0): ");
                        System.out.println("Dato en posición " + posConsulta + ": "
                                + lista.obtenerNodo(posConsulta).getDato());
                        break;
                    case 7:
                        lista.insertarAlInicio(leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado al inicio.");
                        break;
                    case 8:
                        lista.insertarAlFinal(leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado al final.");
                        break;
                    case 9:
                        int posInsertar = leerEntero(teclado, "Posición (desde 0): ");
                        int datoInsertar = leerEntero(teclado, "Dato: ");
                        lista.insertarEnPosicion(posInsertar, datoInsertar);
                        System.out.println("Dato insertado en la posición indicada.");
                        break;
                    case 10:
                        lista.insertarOrdenado(leerEntero(teclado, "Dato: "));
                        System.out.println("Dato insertado en orden ascendente.");
                        break;
                    case 11:
                        int posActualizar = leerEntero(teclado, "Posición a actualizar (desde 0): ");
                        int nuevoDato = leerEntero(teclado, "Nuevo dato: ");
                        lista.actualizar(posActualizar, nuevoDato);
                        System.out.println("Dato actualizado.");
                        break;
                    case 12:
                        System.out.println("Dato eliminado del inicio: " + lista.eliminarInicio());
                        break;
                    case 13:
                        System.out.println(lista.eliminarUltimo()
                                ? "Se eliminó el último elemento."
                                : "No se pudo eliminar: la lista está vacía.");
                        break;
                    case 14:
                        int posEliminar = leerEntero(teclado, "Posición a eliminar (desde 0): ");
                        System.out.println("Dato eliminado: " + lista.eliminarEnPosicion(posEliminar));
                        break;
                    case 15:
                        int valorEliminar = leerEntero(teclado, "Valor a eliminar: ");
                        System.out.println(lista.eliminarPorValor(valorEliminar)
                                ? "Se eliminó el valor " + valorEliminar + "."
                                : "El valor " + valorEliminar + " no se encontró en la lista.");
                        break;
                    case 16:
                        ejecutarBateriaPruebas();
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

    // * Muestra las opciones del menú principal.
    private static void mostrarMenu() {
        System.out.println("=== LISTA DOBLEMENTE LIGADA ===");
        System.out.println("CONSULTAS");
        System.out.println(" 1. Mostrar lista (cabeza -> cola)");
        System.out.println(" 2. Mostrar lista inversa (cola -> cabeza)");
        System.out.println(" 3. Verificar si está vacía");
        System.out.println(" 4. Consultar tamaño");
        System.out.println(" 5. Buscar dato");
        System.out.println(" 6. Obtener dato por posición");
        System.out.println("INSERCIONES");
        System.out.println(" 7. Insertar al inicio");
        System.out.println(" 8. Insertar al final");
        System.out.println(" 9. Insertar en posición");
        System.out.println("10. Insertar ordenado (ascendente)");
        System.out.println("MODIFICACIÓN");
        System.out.println("11. Actualizar dato por posición");
        System.out.println("ELIMINACIONES");
        System.out.println("12. Eliminar al inicio");
        System.out.println("13. Eliminar último");
        System.out.println("14. Eliminar en posición");
        System.out.println("15. Eliminar por valor");
        System.out.println("PRUEBAS");
        System.out.println("16. Ejecutar batería de pruebas automática");
        System.out.println(" 0. Salir");
    }

    // * Ejecuta pruebas automáticas de todos los métodos, casos borde e impresión
    // bidireccional.
    private static void ejecutarBateriaPruebas() {
        System.out.println("\n--- BATERÍA DE PRUEBAS AUTOMÁTICA ---");
        listaDoble prueba = new listaDoble();

        // * 1. Pruebas en lista vacía.
        System.out.println("\n1) Lista vacía:");
        imprimirEstado(prueba);
        System.out.println("eliminarUltimo() en vacía: " + prueba.eliminarUltimo());
        System.out.println("eliminarPorValor(10) en vacía: " + prueba.eliminarPorValor(10));

        // * 2. Pruebas de insertarEnPosicion.
        System.out.println("\n2) insertarEnPosicion(pos, dato):");
        prueba.insertarEnPosicion(0, 20);
        prueba.insertarEnPosicion(0, 10);
        prueba.insertarEnPosicion(2, 40);
        prueba.insertarEnPosicion(2, 30);
        imprimirEstado(prueba);

        // * 3. Pruebas de actualizar y obtenerNodo.
        System.out.println("\n3) actualizar(1, 25) y obtenerNodo(1):");
        prueba.actualizar(1, 25);
        System.out.println("Nodo en pos 1: " + prueba.obtenerNodo(1).getDato());
        imprimirEstado(prueba);

        // * 4. Pruebas de eliminarEnPosicion.
        System.out.println("\n4) eliminarEnPosicion(pos):");
        System.out.println("Eliminado pos 1: " + prueba.eliminarEnPosicion(1));
        imprimirEstado(prueba);
        System.out.println("Eliminado pos 0: " + prueba.eliminarEnPosicion(0));
        imprimirEstado(prueba);

        // * 5. Pruebas de eliminarUltimo.
        System.out.println("\n5) eliminarUltimo():");
        System.out.println("eliminarUltimo() (quedan 2): " + prueba.eliminarUltimo());
        imprimirEstado(prueba);
        System.out.println("eliminarUltimo() (queda 1): " + prueba.eliminarUltimo());
        imprimirEstado(prueba);

        // * 6. Pruebas de insertarOrdenado.
        System.out.println("\n6) insertarOrdenado(dato):");
        int[] valores = { 30, 10, 50, 20, 40, 10, 50, 25 };
        for (int v : valores) {
            prueba.insertarOrdenado(v);
        }
        imprimirEstado(prueba);

        // * 7. Pruebas de eliminarPorValor.
        System.out.println("\n7) eliminarPorValor(x):");
        System.out.println("eliminarPorValor(10) [cabeza]: " + prueba.eliminarPorValor(10));
        System.out.println("eliminarPorValor(50) [primera ocurrencia]: " + prueba.eliminarPorValor(50));
        System.out.println("eliminarPorValor(50) [cola]: " + prueba.eliminarPorValor(50));
        System.out.println("eliminarPorValor(25) [intermedio]: " + prueba.eliminarPorValor(25));
        System.out.println("eliminarPorValor(999) [inexistente]: " + prueba.eliminarPorValor(999));
        imprimirEstado(prueba);

        // * 8. Validación de índices fuera de rango.
        System.out.println("\n8) Validación de índices fuera de rango:");
        try {
            prueba.obtenerNodo(-1);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("obtenerNodo(-1) capturado correctamente: " + ex.getMessage());
        }
        try {
            prueba.eliminarEnPosicion(prueba.getTamanio());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("eliminarEnPosicion(tamanio) capturado correctamente: " + ex.getMessage());
        }
        try {
            prueba.insertarEnPosicion(prueba.getTamanio() + 1, 100);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("insertarEnPosicion(tamanio + 1) capturado correctamente: " + ex.getMessage());
        }

        System.out.println("--- FIN DE BATERÍA DE PRUEBAS ---");
    }

    // * Imprime la lista en ambos sentidos junto con su tamaño.
    private static void imprimirEstado(listaDoble lista) {
        System.out.println("  Adelante : " + lista);
        System.out.println("  Inverso  : " + lista.toStringInverso());
        System.out.println("  Tamaño   : " + lista.getTamanio() + " | Vacía: " + lista.estaVacia());
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
