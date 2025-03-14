package org.example.Ejemplo_Pila;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Stack <Integer> num = new Stack<>();
        System.out.print("Introuce el primer número: ");
        num.push(in.nextInt());
        System.out.print("Introuce el segundo número: ");
        num.push(in.nextInt());
        System.out.print("Introuce el tercer número: ");
        num.push(in.nextInt());

        System.out.println("Números en ordern inverso: ");
        while(!num.isEmpty()) {
            System.out.println(num.pop());
        }

    }

}
