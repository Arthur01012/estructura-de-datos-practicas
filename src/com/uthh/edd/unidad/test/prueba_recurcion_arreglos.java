package com.uthh.edd.unidad.test;

public class prueba_recurcion_arreglos {

    public static void main(String[] args) {
        //arreglos de enteros y de cadenas
        int[] numeros = {1, 2, 3, 4, 5};
        String[] nombres = {"Ana", "Yare", "Luz"};
        //imprimir toda el arreglo de enteros con un bucle FOR
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //imprimir toda el arreglo de cadena con un FOR EACH
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        //suma de los enteros en la cadena con FOR
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);
        //suma de los enteros en la cadena con FOR EACH
        suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println(suma);

        //Encontrar el mayor de la cadena con FOR
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es:" + mayor);
        //Encontrar el menor de la cadena con FOR EACH
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("El numero menor es:" + menor);
    }
}

/*Nivel 1: Arreglos desde cero
Objetivo
Aprender a declarar, llenar, recorrer y manipular un arreglo.

Tema 1.1: Declarar e inicializar
Practica esto:

Crear un arreglo de enteros
Crear un arreglo de cadenas
Rellenarlo manualmente
Mostrarlo en consola
Ejercicios básicos:

Sumar todos los elementos
Hallar el mayor
Hallar el menor
Calcular el promedio
Contar cuántos números pares hay
Tema 1.2: Recorrer arreglos
Aprende a usar:

for
for each
índices
Ejercicios:

Imprimir cada elemento
Invertir un arreglo
Buscar si un valor existe
Contar cuántas veces aparece un valor
Tema 1.3: Arreglos y funciones
Haz funciones separadas para cada operación:

sumarArreglo
promedioArreglo
mayorArreglo
menorArreglo
buscarValor
Regla de oro
Cada ejercicio debe tener:

entrada
proceso
salida
prueba con varios casos
Mini-retos de este nivel
Arreglo con 10 números, mostrar pares e impares
Sumar los elementos de una fila de una matriz
Encontrar la posición de un número
Generar un arreglo con números aleatorios
Nivel 2: Arreglos con lógica más real
Objetivo
Resolver problemas que requieren más análisis.

Ejercicios recomendados
Obtener el número más grande y su posición
Sumar solo los números positivos
Insertar un valor en una posición
Eliminar un valor de un arreglo
Ordenar un arreglo de menor a mayor
Ordenar de mayor a menor
Encontrar si un arreglo está ordenado
Rotar elementos hacia la derecha o izquierda
Temas a fortalecer
Índices
Copiar arreglos
Manejo de posiciones inválidas
Evitar errores comunes:
salirte del rango
recorrer de más
no manejar arreglos vacíos
Ejercicio de práctica de este nivel
Haz una función que reciba un arreglo y:

devuelva la suma
devuelva el promedio
devuelva el mayor
devuelva el menor
devuelva cuántos elementos son mayores que 10
Nivel 3: Matrices y arreglos multidimensionales
Objetivo
Entender que un arreglo puede tener filas y columnas.

Ejercicios básicos
Crear una matriz 3x3
Llenarla con valores
Recorrerla con for anidados
Sumar todos sus elementos
Mostrar la diagonal principal
Mostrar la diagonal secundaria
Sumar cada fila
Sumar cada columna
Retos de nivel medio
Encontrar el mayor valor de la matriz
Contar cuántos valores son pares
Trasponer una matriz
Multiplicar matrices básicas
Verificar si una matriz es simétrica
Si controlas arreglos y matrices, luego la recursividad se te hará mucho más natural.

Nivel 4: Recursividad básica
Objetivo
Entender la idea detrás de una función que se llama a sí misma.

Conceptos clave
Caso base
Caso recursivo
Llamada recursiva
Acumulador
Retroceso
Ejercicios básicos
Factorial
Potencia
Suma de 1 a n
Conteo de números del 1 al n
Mostrar números del 1 al n
Mostrar números en orden inverso
Ejercicios de lógica
Calcular la suma de los primeros n enteros
Determinar si un número es par o impar por recursión
Contar dígitos de un número
Calcular la suma de dígitos
Invertir un número
Regla importante
Si la función no tiene un caso base, se vuelve un bucle infinito recursivo.

Nivel 5: Recursividad con arreglos
Objetivo
Combinar mucho de lo que ya sabes.

Ejercicios clave
Sumar elementos de un arreglo recursivamente
Encontrar el mayor elemento
Encontrar el menor elemento
Buscar un valor en un arreglo
Contar cuántas veces aparece un valor
Invertir un arreglo recursivamente
Devolver la posición de un valor
Ejercicios avanzados
Buscar si un arreglo está ordenado
Eliminar un valor por recursión
Sumar solo los elementos pares
Contar elementos negativos
Multiplicar todos los elementos
Estrategia para cada ejercicio
Define el caso base:
arreglo vacío
índice fuera de rango
un solo elemento
Define el caso recursivo:
procesa el primer elemento
llama con el resto del arreglo
Nivel 6: Búsqueda y ordenamiento con recursividad
Objetivo
Llegar a problemas clásicos de estructuras de datos.

Ejercicios recomendados
Búsqueda binaria recursiva
Ordenamiento por burbuja
Ordenamiento por selección
Ordenamiento por inserción
Ordenamiento recursivo con divide y vencerás
Conteo de elementos mayores o menores que un valor
Problemas para dominar
Búsqueda lineal
Búsqueda binaria
Recursión sobre mitad de arreglo
Reducción del problema en cada llamada
Nivel 7: Retos reales para dominar el tema
Haz estos 10 retos completos
Sumar todos los elementos de un arreglo
Hallar el promedio
Buscar un número y devolver su índice
Invertir un arreglo
Contar números pares
Factorial recursivo
Potencia recursiva
El mayor elemento de un arreglo recursivo
Búsqueda binaria recursiva
Ordenar un arreglo con método simple
Luego sube la dificultad:
matriz transpuesta
suma de diagonales
recursión sobre matrices
buscar en matriz
buscar en subarreglos
manipular arreglos de objetos */
