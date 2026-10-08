package com.uthh.edd.unidad1.tda;

import java.util.ArrayList;

public class Inventario {
    private String nombre;
    private int capacidadMaxima;
    private ArrayList<Producto> productos;

    //Recibe el nombre del inventario y la capacidad máxima de productos que puede contener
    public Inventario(String nombre, int capacidadMaxima) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del inventario es obligatorio");
        }
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a cero");
        }

        this.nombre = nombre.trim();
        this.capacidadMaxima = capacidadMaxima;
        this.productos = new ArrayList<>();
    }
    //get para obtener el nombre del inventario y set para establecer un nuevo nombre, con validación de que no sea nulo o vacío
    public String getNombre() {
        return nombre;
    }
    //set para establecer un nuevo nombre, con validación de que no sea nulo o vacío
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del inventario es obligatorio");
        }
        this.nombre = nombre.trim();
    }
    //get para obtener la capacidad máxima del inventario y set para establecer una nueva capacidad máxima, con validación de que sea mayor a cero
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    //set para establecer una nueva capacidad máxima, con validación de que sea mayor a cero
    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a cero");
        }
        this.capacidadMaxima = capacidadMaxima;
    }
    //get para obtener la lista de productos del inventario
    public ArrayList<Producto> getProductos() {
        return new ArrayList<>(productos);
    }
    //Método para agregar un producto al inventario, con validación de que no sea nulo, que no exceda la capacidad máxima y que no exista otro producto con el mismo código
    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        if (productos.size() >= capacidadMaxima) {
            throw new IllegalStateException("El inventario está lleno");
        }

        for (Producto actual : productos) {
            if (actual.getCodigo().equalsIgnoreCase(producto.getCodigo())) {
                throw new IllegalArgumentException("Ya existe un producto con ese código");
            }
        }

        productos.add(producto);
    }

    //Método para eliminar un producto del inventario, con validación de que no sea nulo o vacío
    public boolean eliminarProducto(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código es inválido");
        }

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                productos.remove(i);
                return true;
            }
        }

        return false;
    }
    //Método para buscar un producto en el inventario, con validación de que no sea nulo o vacío
    public Producto buscarProducto(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código es inválido");
        }

        for (Producto producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }

        return null;
    }
    //Método para calcular el valor total del inventario, sumando el valor de cada producto (cantidad * precio unitario)
    public double calcularValorTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad() * producto.getPrecioUnitario();
        }
        return total;
    }
    //Método recursivo para calcular el valor total del inventario, sumando el valor de cada producto (cantidad * precio unitario)
    public double calcularValorTotalRecursivo(int indice) {
        if (indice >= productos.size()) {
            return 0;
        }

        Producto producto = productos.get(indice);
        return (producto.getCantidad() * producto.getPrecioUnitario())
                + calcularValorTotalRecursivo(indice + 1);
    }   
    //Método para contar la cantidad de productos de un tipo específico, con validación de que no sea nulo o vacío
    public int contarProductosPorTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo es inválido");
        }

        int contador = 0;
        for (Producto producto : productos) {
            if (producto.getTipo().equalsIgnoreCase(tipo)) {
                contador++;
            }
        }
        return contador;
    }
    //Método para obtener el producto más caro del inventario
    public Producto obtenerProductoMasCaro() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto masCaro = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            if (actual.getPrecioUnitario() > masCaro.getPrecioUnitario()) {
                masCaro = actual;
            }
        }
        return masCaro;
    }
    //Método para listar todos los productos del inventario
    public ArrayList<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }

}

