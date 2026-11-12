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
    public void insertarAlInicio(int dato){
        nodo nuevo = new nodo(dato,cabeza);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
        tamano++;
    }

    public void insertarAlFinal(int dato){
        nodo nuevo = new nodo(dato,null);
        if(estaVacia()){
            cabeza = nuevo;
        }else{
            nodo actual = cabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamano++;
    }

}
