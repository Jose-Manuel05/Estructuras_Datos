package org.example.Ejemplo_Map.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    static Scanner sc = new Scanner(System.in);

    private HashMap<String, Integer> mapaTemperaturas;

    public RegistroTemperaturas() {
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura(String ciudad, Integer temperatura) {
        mapaTemperaturas.put(ciudad, temperatura);
    }

    public void actualizarTemperatura(String ciudad) {
        System.out.println("Inserta la temperatura de " + ciudad + ": ");
        int temperatura = sc.nextInt();
        mapaTemperaturas.put(ciudad, temperatura);
    }

    public void consultarTemperatura() {
        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = sc.nextLine();
        if (mapaTemperaturas.containsKey(ciudad)) {
            System.out.println("La temeperatura en " + ciudad + " es de " + mapaTemperaturas.get(ciudad) + "º");
        } else {
            System.out.println("La ciudad " + ciudad + " no tiene temperatura registrada.");
        }
    }

    public void mostrar () {
        System.out.println("Registro de temperaturas: ");
        for (Map.Entry<String, Integer> temperatura : mapaTemperaturas.entrySet()) {
            System.out.println(temperatura.getKey() + ": " + temperatura.getValue() + "º");
        }
    }


    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }
}
