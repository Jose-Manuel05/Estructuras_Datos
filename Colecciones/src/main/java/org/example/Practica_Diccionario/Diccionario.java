package org.example.Practica_Diccionario;

import java.util.*;

public class Diccionario {

    private HashMap<String, String> diccionario;
    private Random random = new Random();

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void nuevoPar(String palabra, String traduccion) {
        diccionario.put(palabra.toLowerCase(), traduccion.toLowerCase());
    }

    public String traducir(String palabra) {
        return diccionario.getOrDefault(palabra.toLowerCase(), null);

    }

    public String palabrasAleatorias() {
        List<String> keys = new ArrayList<>(diccionario.keySet());
        return keys.get(random.nextInt(keys.size()));
    }

    public String primeraLetraTraduccion(String palabra) {
        String traduccion = diccionario.get(palabra.toLowerCase());
        if (traduccion != null && !traduccion.isEmpty()) {
            return traduccion.substring(0, 1);
        }
        return null;
    }


}
