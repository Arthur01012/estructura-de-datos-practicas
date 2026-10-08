package com.uthh.edd.unidad1.tda;

/**
 * Clase base con los datos comunes de los artículos de una tienda.
 * Autor: [Escribe aquí tu nombre completo]
 */
public abstract class ItemTienda {
    private final String id;
    private String nombre;
    private double precio;
    private int stock;

    protected ItemTienda(String id, String nombre, double precio, int stock) {
        this.id = validarTexto(id, "El id es obligatorio");
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarTexto(nombre, "El nombre es obligatorio");
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (!Double.isFinite(precio) || precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0 || stock > ProductoJoya.STOCK_MAXIMO_POR_MODELO) {
            throw new IllegalArgumentException("El stock debe estar entre 0 y 10 unidades");
        }
        this.stock = stock;
    }

    private static String validarTexto(String valor, String mensaje) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(mensaje);
        }
        return valor.trim();
    }
}