package org.example.equals_hascode.Ejercicio2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cine {

    static Random r = new Random();
    static Queue<Asistente> cola = new LinkedList<>();

    public static void main(String[] args) {

        generarCola();

        System.out.println("*** CINE AL POLBE ***");
        System.out.println("Hay " + cola.size() + " personas a la cola." + cola);
        System.out.println("La recaudación ha sido de " + recaudacion() + "€");

    }

    public static void generarCola() {
        int numero_personas = r.nextInt(250);
        for (int i = 0; i < numero_personas; i++) {
            cola.offer(new Asistente(r.nextInt(97) + 3));
        }
    }

    public static double recaudacion() {
        double dinero = 0;
        while (!cola.isEmpty()) {
            dinero += obtenerPrecio(cola.poll().getEdad());
            cola.poll();
        }
        return dinero;
    }

    public static double obtenerPrecio(int edad) {
        if (edad >= 3 && edad <= 10) {
            return 1;
        } else if (edad >= 11 && edad <= 17) {
            return 2.5;
        } else {
            return 3.5;
        }
    }

}
