package com.uthh.edd.unidad2.listas.listasL;

public class listaLigada {
    // Atributos necesarios para la lista ligada
    private int tamano;
    private nodo cabeza; // primer elemento de la lista

    // Constructor de la lista ligada
    public listaLigada() {
        tamano = 0;
        cabeza = null;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para obtener el tamaño de la lista
    public int getTamano() {
        return tamano;
    }

    // Manipular
    public void insertarAlInicio(int dato) {
        nodo nuevo = new nodo(dato, cabeza);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
        tamano++;
    }

    public void insertarAlFinal(int dato) {
        nodo nuevo = new nodo(dato, null);
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            nodo aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamano++;
    }

    public boolean buscar(int dato) {
        nodo aux = cabeza;
        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        nodo aux = cabeza;
        while (aux != null) {
            res += aux.getDato() + " -> ";
            aux = aux.getSiguiente();
        }
        res += "null";
        return res;
    }

    public nodo obtenerNodo(int indice) {
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        nodo aux = cabeza;
        for (int i = 0; i < indice; i++) {
            aux = aux.getSiguiente();
        }
        return aux;
    }

    public void actualizar(int indice, int nuevoDato) {
        nodo aux = obtenerNodo(indice);
        aux.setDato(nuevoDato);
    }

    public void insertarEnPosisicon(int indice, int dato) {
        if (indice < 0 || indice > tamano) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        if (indice == 0) {
            insertarAlInicio(dato);
        } else {
            nodo aux = obtenerNodo(indice - 1);
            nodo nuevo = new nodo(dato, aux.getSiguiente());
            aux.setSiguiente(nuevo);
            tamano++;
        }
    }

    public int eliminarInicio() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }
        int dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        tamano--;
        return dato;
    }

    public int EliminarEnPosicion(int indice) {
        // elimminar valores dentro del caso
        if (indice <= 0 || indice > tamano) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        if (indice == 1) {
            return eliminarInicio();
        } else {
            nodo aux = obtenerNodo(indice - 1);
            nodo objetivo = aux.getSiguiente();
            int dato = objetivo.getDato();
            aux.setSiguiente(objetivo.getSiguiente());
            tamano--;
            return dato;
        }
    }
    //TODO: implementar el metodo de insertar ordenado
        public void insertarOrdenado(int dato) {
            nodo nuevo = new nodo(dato, null);                           //declaramos un nuevo nodo con el dato a insertar

            if (estaVacia() || cabeza.getDato() >= dato) {                    //si la lista esta vacia o el dato es menor que el primer elemento
                nuevo.setSiguiente(cabeza);                                   //el nuevo nodo apunta al primer elemento
                cabeza = nuevo;                                               //el nuevo nodo se convierte en el primer elemento
            } else {                                                          //en caso contrario
                nodo aux = cabeza;                                            //el nodo auxiliar apunta al primer elemento
                while (aux.getSiguiente() != null && aux.getSiguiente().getDato() < dato) {//mientras el siguiente nodo no sea nulo y el dato del siguiente nodo sea menor que el dato a insertar
                    aux = aux.getSiguiente();                                 //el nodo auxiliar apunta al siguiente nodo
                }
                nuevo.setSiguiente(aux.getSiguiente());                       //en caso de que el dato a insertar sea mayor que el dato del siguiente nodo, el nuevo nodo apunta al siguiente nodo
                aux.setSiguiente(nuevo);                                      //el nodo auxiliar apunta al nuevo nodo              
            }
            tamano++;                                                         //el tamaño aumnenta
        }
}
