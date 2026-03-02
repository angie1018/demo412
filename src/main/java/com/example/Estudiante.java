package com.example;

public class Estudiante extends Persona {

    Estudiante() {
        super(); // llamada al constructor de la clase padre Persona
        System.out.println("Constructor vacío de la clase estudiante");
    }
    public void entregatarea(String materia) {
        System.out.println("El estudiante entrega la tarea de " + materia);
    }

    private int revisarNota(String materia) {
        System.out.println("El estudiante revisa su nota de " + materia);
        return 5;   
    }
}
