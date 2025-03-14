package org.example.Ejemplo_Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce la palabra: ");
        String palabra = in.nextLine();

        Deque<Character> lista = new LinkedList<>();

        for (int i = 0; i < palabra.length(); i++) {
            lista.offer(palabra.charAt(i));
        }

        if (lista.size() > 1) {
            esPalindromo(lista);
        } else {
            System.out.println("Es palíndromo");
        }
        esPalindromo(lista);

    }

    public static boolean esPalindromo(Deque<Character> lista) {

        while (lista.size() > 1) {
            if (lista.peekFirst() == lista.peekLast()) {
                lista.pollFirst();
                lista.pollLast();
            } else {
                System.out.println("No es palíndromo");
                return false;
            }

        }

        System.out.println("Es palíndromo");
        return true;

    }
}
