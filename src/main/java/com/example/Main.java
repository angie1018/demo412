package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
    // Métodos para testear
    public int suma(int a, int b) {
        return a + b;
    }
    
    public int resta(int a, int b) {
        return a - b;
    }
    
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}