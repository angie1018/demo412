package com.example;

public class Main {
    public static void main(String[] args) {
  

    Persona persona1 = new Persona(123456789, "Juan Pérez", "juan.perez@example.com", 300123456);

    String saludo = persona1.hablar("Hola, ¿Cómo estás?");
    System.out.println(saludo);

    persona1.dormir(8);
    }

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
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return (double) a / b;
    }
}