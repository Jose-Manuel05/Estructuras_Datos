package org.example.Ejemplo_Pila;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Primera expresión: ");
        String primeraExpresion = in.nextLine();
        System.out.println("Segunda expresión: ");
        String segundaExpresion = in.nextLine();

        imprimirResultado(primeraExpresion);
        System.out.println();
        imprimirResultado(segundaExpresion);

    }

    private static boolean eesBalanceado(String expresion) {
        Stack <Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }

        return pila.isEmpty();
    }

    private static void imprimirResultado(String expresion) {
        if (!eesBalanceado(expresion)) {
            System.out.println("La expresión " + expresion + " no es correcta");
        } else {
            System.out.println("La expresión " + expresion + " es correcta");

        }
    }

}
