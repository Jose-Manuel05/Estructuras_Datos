package org.example.Ejemplo_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Integer> mapaPalabras = new HashMap<>();

        System.out.print("Introduce una frase: ");
        String texto = sc.nextLine();

        // Dividir la frase en palabras separadas por espacios
        String[] palabras = texto.split(" ");

        // Contar las palabras
        for (String palabra : palabras) {
            //mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra,0) + 1);
            if (mapaPalabras.containsKey(palabra)) {
                mapaPalabras.put(palabra, mapaPalabras.get(palabra) + 1);
            } else {
                mapaPalabras.put(palabra, 1);
            }
        }

        // Mostrar el resultado
        for (Map.Entry<String, Integer> palabra : mapaPalabras.entrySet()) {
            System.out.println(palabra.getKey() + ": " + palabra.getValue());
        }

    }
}
