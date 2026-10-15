package com.uthh.edd.unidad1.tda;

public class Producto {
    private String codigo;
    private String nombre;
    private String tipo;
    private int cantidad;
    private double precioUnitario;

    public Producto(String codigo, String nombre, String tipo, int cantidad, double precioUnitario) {
        setCodigo(codigo);
        setNombre(nombre);
        setTipo(tipo);
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = validarTexto(codigo, "El codigo del producto es obligatorio");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarTexto(nombre, "El nombre del producto es obligatorio");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = validarTexto(tipo, "El tipo del producto es obligatorio");
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }
        this.precioUnitario = precioUnitario;
    }

    private static String validarTexto(String valor, String mensaje) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(mensaje);
        }
        return valor.trim();
    }

    @Override
    public String toString() {
        return "Producto{"
                + "codigo='" + codigo + '\''
                + ", nombre='" + nombre + '\''
                + ", tipo='" + tipo + '\''
                + ", cantidad=" + cantidad
                + ", precioUnitario=" + precioUnitario
                + '}';
    }
}
