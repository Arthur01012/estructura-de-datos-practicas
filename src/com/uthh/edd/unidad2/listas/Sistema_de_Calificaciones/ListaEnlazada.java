package com.uthh.edd.unidad2.listas.Sistema_de_Calificaciones;

// Se menciona que llega de manera desordenada N cantidad de calificaciones 
// · Ver la lista de calificaciones siempre ordenada de menor a mayor.
// 	        (a) una opción es que lleguen de manera desordenada y tener un procedimiento que ordene la lista y posterior en el toString se mande a llamar a ese procedimiento antes de imprimir
// 	        (b) En automatico al registrar que se inserten de manera ordenada
// · Consultar la calificación en cualquier posición (mínima, máxima, mediana).
// 	        consultar las calificación en una posición especifica
// 	        obtener la calificación maxima
// 	        obtener la calificación minima
// 	        obtener la calificación de el medio o quizá una media de calificacion
// · Corregir calificaciones erróneas.
// 	        obtener la una calificación en una posición especifica y después editarla
// · Eliminar calificaciones inválidas.
//      	eliminar las calificaciones mayores a 10 y menores a 0
// · Saber si alguien sacó una calificación específica.
// 	        obtener el numero de estudiantes con una calificación es especifico, recorrer toda las lista eh ir contando los que cumplan la condición
// · Ver el total de estudiantes que ya entregaron.
// 	        recorrer la lista eh ir contando la cantidad de elementos de la lista
public class ListaEnlazada {

    int tamano; // tamaño de la lista
    Nodo cabeza; // referencia al primer nodo de la lista

    // Constructor
    public ListaEnlazada() {
        this.tamano = 0;
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    //setters
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    //getters
    public int getTamano() {
        return tamano;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    //* Ver la lista de calificaciones siempre ordenada de menor a mayor.
    // Metodo de entrada de datos, para insertar un nodo en la lista de manera ordenada Menor a Mayor
    public void insertarOrdenado(int dato) {
        Nodo nuevo = new Nodo(dato, null);

        if (estaVacia() || cabeza.getDato() >= dato) {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato() < dato) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
        tamano++;
    }//Metodo tomado de la pracrtica anterior

    //* Consultar la calificación en cualquier posición (mínima, máxima, mediana).
    public int obtenerCalificacionMaxima() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }//verifica si la lista esta vacia
        Nodo aux = cabeza;//crea un nodo auxiliar que apunta a la cabeza de la lista
        int max = aux.getDato();//inicializa la variable max con el valor del primer nodo
        while (aux != null) {//mientras el nodo auxiliar no sea nulo
            if (aux.getDato() > max) {//Recorre la lista y compara el valor del nodo auxiliar con el valor de max, si es mayor, actualiza max
                max = aux.getDato();//actualiza el valor de max
            }
            aux = aux.getSiguiente();//mueve el nodo auxiliar al siguiente nodo
        }
        return max;
    }

    public int obtenerCalificacionMinima() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }//verifica si la lista esta vacia
        Nodo aux = cabeza;//crea un nodo auxiliar que apunta a la cabeza de la lista
        int min = aux.getDato();//inicializa la variable min con el valor del primer nodo
        while (aux != null) {//mientras el nodo auxiliar no sea nulo
            if (aux.getDato() < min) {//Recorre la lista y compara el valor del nodo auxiliar con el valor de min, si es menor, actualiza min
                min = aux.getDato();//actualiza el valor de min
            }
            aux = aux.getSiguiente();//mueve el nodo auxiliar al siguiente nodo
        }
        return min;
    }

    public double obtenerCalificacionMedia() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }//verifica si la lista esta vacia
        Nodo aux = cabeza;//crea un nodo auxiliar que apunta a la cabeza de la lista
        int suma = 0;//inicializa la variable suma en 0
        int contador = 0;//inicializa la variable contador en 0
        while (aux != null) {//mientras el nodo auxiliar no sea nulo
            suma += aux.getDato();//suma el valor del nodo auxiliar a la variable suma
            contador++;//incrementa el contador en 1
            aux = aux.getSiguiente();//mueve el nodo auxiliar al siguiente nodo
        }
        return (double) suma / contador;//retorna la media de las calificaciones
    }

    //* Obtener media moda y mediana de las calificaciones
    private double obtenerMedia() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }//verifica si la lista esta vacia
        Nodo aux = cabeza;//crea un nodo auxiliar que apunta a la cabeza de la lista
        int suma = 0;//inicializa la variable suma en 0
        int contador = 0;//inicializa la variable contador en 0
        while (aux != null) {//mientras el nodo auxiliar no sea nulo
            suma += aux.getDato();//suma el valor del nodo auxiliar a la variable suma
            contador++;//incrementa el contador en 1
            aux = aux.getSiguiente();//mueve el nodo auxiliar al siguiente nodo
        }
        return (double) suma / contador;//retorna la media de las calificaciones
    }

    private int obtenerModa() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }//verifica si la lista esta vacia
        int moda = cabeza.dato;//inicializa la variable moda con el valor del primer nodo
        int maxFrecuencia = 0;//inicializa la variable maxFrecuencia en 0
        for (Nodo actual = cabeza; actual != null; actual = actual.siguiente) {//mientras el nodo actual no sea nulo
            int frecuencia = 0;//inicializa la variable frecuencia en 0
            for (Nodo comparar = cabeza; comparar != null; comparar = comparar.siguiente) {//mientras el nodo comparar no sea nulo
                if (comparar.dato == actual.dato) {//compara el valor del nodo comparar con el valor del nodo actual
                    frecuencia++;//incrementa la frecuencia en 1
                }
            }
            if (frecuencia > maxFrecuencia) {//si la frecuencia es mayor que la frecuencia maxima
                maxFrecuencia = frecuencia;//actualiza la frecuencia maxima
                moda = actual.dato;//actualiza la moda
            }
        }
        return moda;
    }

    public double obtenerCalificacionMediana() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }//verifica si la lista esta vacia
        int[] calificaciones = new int[tamano];//crea un arreglo de enteros con el tamaño de la lista
        Nodo aux = cabeza;//crea un nodo auxiliar que apunta a la cabeza de la lista
        for (int i = 0; i < tamano; i++) {//recorre la lista y almacena los valores en el arreglo
            calificaciones[i] = aux.getDato();//almacena el valor del nodo auxiliar en el arreglo
            aux = aux.getSiguiente();//mueve el nodo auxiliar al siguiente nodo
        }
        java.util.Arrays.sort(calificaciones);//ordena el arreglo de calificaciones
        if (tamano % 2 == 0) {//si el tamaño de la lista es par
            return (calificaciones[tamano / 2 - 1] + calificaciones[tamano / 2]) / 2.0;//retorna la media de los dos valores centrales
        } else {
            return calificaciones[tamano / 2];//retorna el valor central del arreglo
        }
    }

    //* Corregir calificaciones erróneas.
    public boolean evitarCAlificacionesErroneas(int calificacion) {
        if (calificacion < 0 || calificacion > 10) {// Verifica si la calificación está fuera del rango válido (0-10)
            return false; // Calificación inválida
        }
        insertarOrdenado(calificacion);// Inserta la calificación en la lista de manera ordenada
        return true; // Calificación válida y agregada a la lista
    }

    //* Saber si alguien sacó una calificación específica.
    public boolean consultarCalificacion(int calificacion) {
        Nodo aux = cabeza;// Crea un nodo auxiliar que apunta a la cabeza de la lista
        while (aux != null) {// Recorre la lista mientras el nodo auxiliar no sea nulo
            if (aux.getDato() == calificacion) {// Compara el valor del nodo auxiliar con la calificación buscada
                return true; // Calificación encontrada
            }
            aux = aux.getSiguiente();// Mueve el nodo auxiliar al siguiente nodo
        }
        return false; // Calificación no encontrada
    }

    //* Ver el total de estudiantes que ya entregaron.
    public int totalEstudiantes() {
        return tamano;
    }
}
