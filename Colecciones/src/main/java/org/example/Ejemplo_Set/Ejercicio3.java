package org.example.Ejemplo_Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> lista = new LinkedHashSet<>();

        String palabra = "";

        do {
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            lista.add(palabra);
            palabra = sc.nextLine();

        }while (!palabra.equals("salir"));

        System.out.println();

        System.out.println("Historial de navegacion: ");
        for (String url : lista) {
            System.out.println(url);
        }

    }
}
