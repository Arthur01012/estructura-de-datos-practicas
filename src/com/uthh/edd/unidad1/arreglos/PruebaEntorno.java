/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.arreglos;

/**
 *
 * @author Rodrigo
 */
public class PruebaEntorno {
    public   static void main(String[] args){
        String nombre = "Rodrigo Arturo Reyes Rodriguez";
        String matricula = "20251001"; 
        String cuatrimestre = "4"; 
        String grupo = "Grupo C"; 

        String versionJava = System.getProperty("java.version");

        System.out.println("--- Mis Datos ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Cuatrimestre: " + cuatrimestre);
        System.out.println("Grupo: " + grupo);
        System.out.println("--------------");
        System.out.println("Version de Java: " + versionJava);
        
    }
}
