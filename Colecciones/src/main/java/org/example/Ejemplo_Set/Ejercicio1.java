package org.example.Ejemplo_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();

        System.out.print("Escrive una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            lista.add(palabra);
        }

        System.out.println("Palabras unicas: " + lista);

    }
}
