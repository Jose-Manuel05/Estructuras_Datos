package org.example.Ejemplo_Map;

import java.util.Map;
import java.util.Scanner;

/**
 * Este programa cuenta la frecuencia de cada carácter en una palabra proporcionada por el usuario.
 * Utiliza un HashMap para almacenar cada carácter único junto con su número de ocurrencias.
 */
public class Ejercicio2 {

    /** Objeto Scanner para leer la entrada del usuario desde la consola */
    static Scanner sc = new Scanner(System.in);

    /**
     * Método principal que ejecuta el contador de frecuencia de caracteres.
     * Pasos:
     * 1. Solicita al usuario que introduzca una palabra
     * 2. Cuenta la frecuencia de cada carácter en la palabra
     * 3. Muestra cada carácter y su número de ocurrencias
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un mapa para almacenar los caracteres y sus frecuencias
        Map<Character, Integer> mapa = new java.util.HashMap<>();

        // Obtener la entrada del usuario
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        // Contar la frecuencia de cada carácter en la entrada
        for (Character letra : palabra.toCharArray()) {
            // Si el carácter existe en el mapa, incrementar su contador; de lo contrario, añadirlo con contador 1
            mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
        }

        // Mostrar cada carácter y su frecuencia
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
