package com.example;

public class Main {
    public static void main(String[] args) {
  

    Persona persona1 = new Persona(123456789, "Juan Pérez", "juan.perez@example.com", 300123456);

    String saludo = persona1.hablar("Hola, ¿Cómo estás?");
    System.out.println(saludo);

    // persona1.dormir(8);
    }

}