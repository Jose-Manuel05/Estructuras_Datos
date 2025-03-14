package org.example.Ejemplo_Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2 {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();


        cola.offer("Imprimir documento 1");
        cola.offer("Imprimir documento 2");
        cola.offer("Imprimir documento 3");
        cola.offer("Imprimir documento 4");
        cola.offer("Imprimir documento 5");

        for (String documento : cola) {
            System.out.print("Estado inicial de la cola de imrepresión: " + documento);
        }

    }
}
