package com.uthh.edd.unidad2.listas.listas_doblementeLigadas;

//* Lista doblemente ligada con apuntadores a cabeza y cola.
public class listaDoble {
    private int tamanio; // cantidad de nodos almacenados
    private nodoDoble cabeza; // primer elemento de la lista
    private nodoDoble cola; // último elemento de la lista

    //* Constructor de la lista doblemente ligada vacía.
    public listaDoble() {
        tamanio = 0;
        cabeza = null;
        cola = null;
    }

    //* Verifica si la lista está vacía.
    public boolean estaVacia() {
        return cabeza == null && cola == null;
    }

    //* Obtiene la cantidad actual de elementos en la lista.
    public int getTamanio() {
        return tamanio;
    }

    //* Inserta un elemento al inicio de la lista (posición 0).
    public void insertarAlInicio(int dato) {
        nodoDoble nuevo = new nodoDoble(dato, cabeza, null);
        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        tamanio++;
    }

    //* Inserta un elemento al final de la lista usando cola.
    public void insertarAlFinal(int dato) {
        nodoDoble nuevo = new nodoDoble(dato, null, cola);
        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            cola = nuevo;
        }
        tamanio++;
    }

    //* Inserta un elemento en una posición específica (0 <= pos <= tamanio).
    public void insertarEnPosicion(int pos, int dato) {
        if (pos < 0 || pos > tamanio) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + pos);
        }
        if (pos == 0) {
            insertarAlInicio(dato);
        } else if (pos == tamanio) {
            insertarAlFinal(dato);
        } else {
            nodoDoble actual = obtenerNodo(pos);
            nodoDoble anterior = actual.getAnterior();
            nodoDoble nuevo = new nodoDoble(dato, actual, anterior);
            anterior.setSiguiente(nuevo);
            actual.setAnterior(nuevo);
            tamanio++;
        }
    }

    //* Inserta un elemento manteniendo la lista ordenada de menor a mayor.
    public void insertarOrdenado(int dato) {
        if (estaVacia() || dato <= cabeza.getDato()) {
            insertarAlInicio(dato);
        } else if (dato >= cola.getDato()) {
            insertarAlFinal(dato);
        } else {
            nodoDoble aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato() < dato) {
                aux = aux.getSiguiente();
            }
            nodoDoble siguiente = aux.getSiguiente();
            nodoDoble nuevo = new nodoDoble(dato, siguiente, aux);
            aux.setSiguiente(nuevo);
            siguiente.setAnterior(nuevo);
            tamanio++;
        }
    }

    //* Busca si un dato existe dentro de la lista.
    public boolean buscar(int dato) {
        nodoDoble aux = cabeza;
        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    //* Obtiene el nodo en la posición indicada (0 <= pos < tamanio).
    public nodoDoble obtenerNodo(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + pos);
        }
        nodoDoble aux;
        if (pos < tamanio / 2) {
            aux = cabeza;
            for (int i = 0; i < pos; i++) {
                aux = aux.getSiguiente();
            }
        } else {
            aux = cola;
            for (int i = tamanio - 1; i > pos; i--) {
                aux = aux.getAnterior();
            }
        }
        return aux;
    }

    //* Actualiza el valor almacenado en la posición indicada.
    public void actualizar(int pos, int nuevoDato) {
        nodoDoble aux = obtenerNodo(pos);
        aux.setDato(nuevoDato);
    }

    //* Elimina y retorna el primer elemento de la lista (cabeza).
    public int eliminarInicio() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }
        int dato = cabeza.getDato();
        if (cabeza == cola) {
            cabeza = null;
            cola = null;
        } else {
            nodoDoble eliminada = cabeza;
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            eliminada.setSiguiente(null);
        }
        tamanio--;
        return dato;
    }

    //* Elimina el último elemento de la lista (cola).
    public boolean eliminarUltimo() {
        if (estaVacia()) {
            return false;
        }
        if (cabeza == cola) {
            cabeza = null;
            cola = null;
        } else {
            nodoDoble eliminada = cola;
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            eliminada.setAnterior(null);
        }
        tamanio--;
        return true;
    }

    //* Elimina y retorna el elemento en la posición indicada (0 <= pos < tamanio).
    public int eliminarEnPosicion(int pos) {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }
        if (pos < 0 || pos >= tamanio) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + pos);
        }
        if (pos == 0) {
            return eliminarInicio();
        }
        if (pos == tamanio - 1) {
            int dato = cola.getDato();
            eliminarUltimo();
            return dato;
        }
        nodoDoble objetivo = obtenerNodo(pos);
        int dato = objetivo.getDato();
        nodoDoble anterior = objetivo.getAnterior();
        nodoDoble siguiente = objetivo.getSiguiente();
        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);
        objetivo.setAnterior(null);
        objetivo.setSiguiente(null);
        tamanio--;
        return dato;
    }

    //* Elimina la primera ocurrencia del valor indicado.
    public boolean eliminarPorValor(int x) {
        if (estaVacia()) {
            return false;
        }
        nodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.getDato() == x) {
                if (actual == cabeza) {
                    eliminarInicio();
                } else if (actual == cola) {
                    eliminarUltimo();
                } else {
                    nodoDoble anterior = actual.getAnterior();
                    nodoDoble siguiente = actual.getSiguiente();
                    anterior.setSiguiente(siguiente);
                    siguiente.setAnterior(anterior);
                    actual.setAnterior(null);
                    actual.setSiguiente(null);
                    tamanio--;
                }
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    //* Recorre la lista de cabeza a cola (hacia adelante).
    @Override
    public String toString() {
        if (estaVacia()) {
            return "null";
        }
        StringBuilder res = new StringBuilder("null <- ");
        nodoDoble aux = cabeza;
        while (aux != null) {
            res.append(aux.getDato());
            if (aux.getSiguiente() != null) {
                res.append(" <-> ");
            }
            aux = aux.getSiguiente();
        }
        res.append(" -> null");
        return res.toString();
    }

    //* Recorre la lista de cola a cabeza (hacia atrás).
    public String toStringInverso() {
        if (estaVacia()) {
            return "null";
        }
        StringBuilder res = new StringBuilder("null <- ");
        nodoDoble aux = cola;
        while (aux != null) {
            res.append(aux.getDato());
            if (aux.getAnterior() != null) {
                res.append(" <-> ");
            }
            aux = aux.getAnterior();
        }
        res.append(" -> null");
        return res.toString();
    }
}
