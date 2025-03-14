package org.example.Ejemplo_Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Deque <String> lista = new LinkedList<>();

        String opcion = sc.next();

        do {

            mostrarMenu();
            opcion = sc.next();

        }while(!opcion.equals("X"));

    }

    public static void mostrarMenu() {
        System.out.println("--- Lista de la compra ---");
        System.out.println("1. Añadir el producto al final de la lista");
        System.out.println("2. Eliminar primer producto de la lista");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar Producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");
        System.out.println();
        System.out.print("Introduce una opción: ");

    }
}
