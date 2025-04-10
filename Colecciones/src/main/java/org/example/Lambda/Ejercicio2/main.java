package org.example.Lambda.Ejercicio2;

public class main {
    public static void main(String[] args) {
        VerificarVoto voto = ((nombre, edad) -> {
            if (edad >= 18) {
                System.out.println("El usuario " + nombre + " puede votar.");
                return true;
            } else {
                System.out.println("El usuario " + nombre + " no puede votar.");
                return false;
            }
        });
    }
}
