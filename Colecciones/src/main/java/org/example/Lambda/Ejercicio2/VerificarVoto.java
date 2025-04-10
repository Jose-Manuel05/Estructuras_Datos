package org.example.Lambda.Ejercicio2;

@FunctionalInterface
public interface VerificarVoto {
    boolean puedeVotar(String nombre, int edad);
}
