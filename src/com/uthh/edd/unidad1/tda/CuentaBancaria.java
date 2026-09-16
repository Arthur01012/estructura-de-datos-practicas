/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.tda;

/**
 *
 * @author Rodrigo
 */
public class CuentaBancaria {

    // ---- implementación oculta ----
    private double saldo;
    private String titular;
    private String numeroCuenta;

    // ---- constructor: única forma de crear el dato ----
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    // ---- especificación: operaciones públicas del TDA ----
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo) {
            throw new IllegalStateException("Fondos insuficientes");
        }
        saldo -= monto;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String obtenerTitular() {
        return titular;
    }
}
