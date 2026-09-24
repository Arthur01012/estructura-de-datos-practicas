package com.uthh.edd.unidad1.tda;
//Integrantes:
// -Rodrigo Arturo Reyes Rodriguez
// -Bryan Hafizi
public class CuentaRoblox {

    // 1. ATRIBUTOS
    private String usuario;
    private double saldo;
    private String contra;

    // 2. CONSTRUCTORES

    // Constructor por defecto
    public CuentaRoblox() {
        this.usuario = "NoobPlayer";
        this.saldo = 0.0;
        this.contra = "roblox123";
    }
    // Constructor sobrecargado
    public CuentaRoblox(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
        this.saldo = 0.0;
    }

    // 3. GETTERS
    public String getUsuario() {
        return this.usuario;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getContra() {
        return this.contra;
    }

    // 4. SETTERS 
    public void setUsuario(String nuevoUsuario) {
            this.usuario = nuevoUsuario;        
    }

    public void setContra(String nuevaContra) {
            this.contra = nuevaContra;
    }

    // 5. MÉTODOS DE NEGOCIO
    // Recargar saldo
    public void recargar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        this.saldo += monto;
    }

    // Realizar una compra
    public void comprar(double costo) {
        this.saldo -= costo;
        System.out.println("Compra realizada con exito");
    }

    public static void main(String[] args) {
    }

}