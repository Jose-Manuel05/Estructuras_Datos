package org.example.Ejemplo_Pila;

import java.util.Stack;

public class Ejercicio3_Patri {

    public static void main(String[] args) {

        String expresion = "((2+3)*(5-1))";

        if (esBalanceado(expresion)) {
            System.out.println("La expresión " + expresion + " es correcta");
        } else {
            System.out.println("La expresión " + expresion + " no es correcta");
        }

    }

    public static boolean esBalanceado(String expresion) {

        Stack <String> pila = new Stack<>();
        String[] expresionArray = expresion.split("");

        for (int i = 0; i < expresionArray.length; i++) {
            if (expresionArray[i].equals("(")) {
                pila.push(expresionArray[i]);
            } else if (expresionArray[i].equals(")") && pila.contains("(")) {
                pila.pop();
            }
        }

        if (pila.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

}
