package com.uthh.edd.unidad1.tda;

public class ProductoJoya extends ItemTienda {
    public static final int STOCK_MAXIMO_POR_MODELO = 10;
    public static final int MAXIMO_POR_MODELO_EN_COMPRA = 1;

    private CategoriaJoya categoria;
    private String material;

    public ProductoJoya(
            String id,
            String nombre,
            double precio,
            int stock,
            CategoriaJoya categoria,
            String material) {
        super(id, nombre, precio, stock);
        setCategoria(categoria);
        setMaterial(material);
    }

    public CategoriaJoya getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaJoya categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria es obligatoria");
        }
        this.categoria = categoria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("El material es obligatorio");
        }
        this.material = material.trim();
    }

    public boolean verificarStock(int cantidad) {
        return cantidad >= 1
                && cantidad <= MAXIMO_POR_MODELO_EN_COMPRA
                && cantidad <= getStock();
    }

    public void disminuirStock(int cantidad) {
        if (!verificarStock(cantidad)) {
            throw new IllegalArgumentException(
                    "La compra debe ser de una unidad como maximo y debe haber stock disponible");
        }
        setStock(getStock() - cantidad);
    }

    public double calcularPrecioConDescuento(double porcentaje) {
        if (!Double.isFinite(porcentaje) || porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 100 por ciento");
        }
        return getPrecio() * (1 - porcentaje / 100);
    }

    public double calcularCostoAcumuladoRecursivo(int cantidad) {
        if (cantidad < 0 || cantidad > getStock()) {
            throw new IllegalArgumentException("n debe estar entre 0 y el stock disponible");
        }
        if (cantidad == 0) {
            return 0;
        }
        return getPrecio() + calcularCostoAcumuladoRecursivo(cantidad - 1);
    }

    @Override
    public String toString() {
        return "ProductoJoya{"
                + "id='" + getId() + '\''
                + ", nombre='" + getNombre() + '\''
                + ", precio=" + getPrecio()
                + ", stock=" + getStock()
                + ", categoria=" + categoria
                + ", material='" + material + '\''
                + '}';
    }
}
