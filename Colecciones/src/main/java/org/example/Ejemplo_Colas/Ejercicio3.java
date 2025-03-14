package org.example.Ejemplo_Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.offer("Mirror - Justin Timberlake");
        cola.offer("Toxic - Britney Spears");
        cola.offer("Clavadito - Chanel feat. Abraham Mateo");
        cola.offer("La reina - Lola Indigo");

        System.out.println("Estado inicial de la playlist: " + cola);

        while (!cola.isEmpty()) {
            System.out.println("Reproduciendo: " + cola.poll());
            System.out.println("Estado actual de la playlist: " + cola);
        }

        System.out.println("La playlist ha terminado. ");

    }
}