# Estructura de Datos — Prácticas y ejercicios

Repositorio de prácticas de laboratorio y ejercicios de la asignatura **Estructura de Datos**. El código fuente está organizado por unidad y tema bajo `src/com/uthh/edd`.

## Requisitos

- Java JDK 21 (o una versión compatible con la configuración del proyecto).
- Apache NetBeans 17 o superior, o Apache Ant para compilar desde consola.
- Archivos fuente codificados en UTF-8.

## Prácticas incluidas

### Unidad 1

#### Arreglos — `unidad1/arreglos`

- `PruebaEntorno`: imprime información de ejemplo del estudiante y la versión instalada de Java.
- `arreglos`: ejemplos de declaración, inicialización, lectura y recorrido de arreglos de enteros y cadenas, además de una matriz.
- `OrdenamientoBurbuja`: ordenamiento burbuja tradicional y versión mejorada que termina antes si una pasada no realiza intercambios.
- `BusquedaBinarai`: búsqueda binaria iterativa y recursiva; ambas requieren que el arreglo esté ordenado.
- `matrices`: práctica de operaciones con matrices. La clase contiene una operación para intercambiar columnas y un ejemplo de recorrido; revisar/corregir antes de ejecutarla, pues actualmente tiene expresiones de indexación que no corresponden a la sintaxis de Java.

#### Recursividad — `unidad1/recursion`

- `recursvidad`: ejemplo de sumatoria recursiva y visualización de las llamadas y retornos.
- `InversorCadena`: invierte una cadena mediante llamadas recursivas.
- `palindromo`: comprueba recursivamente si una frase es palíndroma después de quitar espacios y convertirla a minúsculas.
- `VerificadorOrden`: comprueba recursivamente si un arreglo está ordenado de forma ascendente.

#### Tipos de Datos Abstractos — `unidad1/tda`

- `CuentaBancaria`: TDA de cuenta con depósitos, retiros y consulta de saldo, incluyendo validaciones de montos y fondos.
- `CuentaRoblox`: ejemplo de objeto con usuario, contraseña, saldo, recargas y compras.
- `Producto` e `Inventario`: gestión de productos con código, nombre, tipo, cantidad y precio; el inventario permite agregar, eliminar y buscar productos, calcular su valor total (también recursivamente), contar por tipo y obtener/listar productos.

### Unidad 2

#### Práctica más reciente: lista ligada — `com.uthh.edd.unidad2.listas.listasL.listaLigada`

**Ubicación del método:** [`listaLigada.java`](src/com/uthh/edd/unidad2/listas/listasL/listaLigada.java) → `insertarOrdenado(int dato)`. Este método agrega cada entero en la posición que le corresponde para mantener la lista en orden ascendente.

La clase implementa una lista simplemente ligada de enteros e incluye también inserción al inicio, al final y por índice; búsqueda, actualización, eliminación y consultas de tamaño/lista vacía. El menú interactivo está en [`main.java`](src/com/uthh/edd/unidad2/listas/listasL/main.java), dentro del paquete `com.uthh.edd.unidad2.listas.listasL`.

#### Listas enlazadas — `unidad2/listas`

- `listas_ligadas`: lista simplemente enlazada con inserción al inicio/final, búsqueda, eliminación por valor, recorrido y consulta del tamaño. Su punto de entrada es `listas_ligadas.Main`.
- `listasL`: práctica más reciente, con consulta de lista vacía y tamaño, búsqueda, inserción al inicio/final/índice/ordenada, actualización y eliminación al inicio o por posición. Para inserción y actualización se usan índices desde 0; la eliminación por posición usa posiciones desde 1. La ubicación de `insertarOrdenado` aparece destacada arriba.
- `listas_doblementeLigadas`: lista doblemente enlazada con referencias anterior/siguiente, inserción al inicio/final, búsqueda, eliminación por valor y recorridos en ambos sentidos. Su punto de entrada es `listas_doblementeLigadas.main`.
- `Sistema_de_Calificaciones`: contiene las clases `Nodo`, `ListaEnlazada` y `Main`; actualmente es una estructura inicial y `Main` está vacío.

### Ejercicios adicionales

- `unidad/test/prueba_recurcion_arreglos`: ejercicios y notas de práctica sobre recorridos, sumas de arreglos y temas propuestos de recursividad.

## Ejecutar las prácticas

Las clases con método `main` se pueden ejecutar individualmente desde NetBeans: abre el proyecto y selecciona **Run File** sobre la clase deseada. Para las listas, usa los puntos de entrada indicados arriba.

El proyecto incluye configuración de Ant (`build.xml`). Si Ant está instalado, se puede compilar desde la raíz del proyecto con:

```bash
ant compile
```

## Estructura

```text
src/com/uthh/edd/
├── unidad1/
│   ├── arreglos/
│   ├── recursion/
│   └── tda/
├── unidad2/
│   └── listas/
│       ├── listasL/
│       ├── listas_ligadas/
│       ├── listas_doblementeLigadas/
│       └── Sistema_de_Calificaciones/
└── unidad/test/
```
