package org.example.Ejemplo_Map;

import java.util.HashMap;
import java.util.Map;

public class Prueba {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();

        notas.put("Adrian", 4);
        notas.put("Raúl", 6);
        notas.put("Manuel", 8);
        notas.put("Adrian", 6);

        System.out.println("Nota para Adrian: " + notas.get("Adrian"));

        // Eliminar un elemento
        System.out.println(notas.remove("Manuel"));

        // Mostrar todas las notas
        System.out.println("\n" + notas.keySet());

        // Mostrar todos los valores
        System.out.println("\n" + notas.values());

        // Comprobar si existe una clave
        if (notas.containsKey("Adrian")) {
            System.out.println("\n" + "Adrian tiene nota");
        }

        // Comprobar si hay un 10
        if (notas.containsValue(10)) {
            System.out.println("\n" + "Hay alguien con un 10");
        }

        // Mostrar claves
        for (String clave : notas.keySet()) {
            System.out.println("\n" + "Clave: " + clave);
        }

        // Mostrar valores
        for (Integer nota : notas.values()) {
            System.out.println("\n" + "Nota: " + nota);
        }

        // Mostar clave y valor
        for (Map.Entry<String, Integer> nota : notas.entrySet()) {
            System.out.println("\n" + "Nota de " + nota.getKey() + ": " + nota.getValue());
        }

    }
}
