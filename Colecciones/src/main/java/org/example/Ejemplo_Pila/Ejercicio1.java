package org.example.Ejemplo_Pila;


import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {

        Stack <Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        while(!pila.isEmpty()) {
            System.out.println(pila.size());
            System.out.println(pila.peek());
            System.out.println(pila.pop());
            System.out.println(pila.size());
        }

    }
}