package com.example;

public class Persona {

    //Atributos de la clase persona
    //Características que identifican a una clase Persona

    private  int cedula;
    public String nombre;
    public String correo;
    private int telefono;

    //Constructor  vacío
    Persona(){
        System.out.println("Constructor vacío de Persona ejecutado.");// inicializaciónd el constructor de la clase Persona
    }

    //Constructor de la clase Persona con parámtros
    Persona(int cedula, String nombre, String correo, int telefono) {
        System.out.println("Constructor con parámetros de Persona ejecutado.");// inicialización del constructor de la clase Persona
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Métodos de la clase Persona
    // Comportamientos que una clase Persona puede realizar o acciones que puede ejecutar

    public String hablar(String saludo) {
        // System.out.println(saludo);
        return saludo + " Bien gracias!";
    }

    // private void dormir(int horas) {
    //    System.out.println("La persona ha dormido " + horas + " horas.");
    // }

    public void mostrarInformacion() {
        System.out.println("Información de la persona:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
    }

}
