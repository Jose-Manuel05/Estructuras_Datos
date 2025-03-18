package org.example.equals_hascode.Ejercicio2;

public class Asistente {

    private int edad;

    public Asistente(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Asistente{" +
                "edad=" + edad +
                '}';
    }
}
