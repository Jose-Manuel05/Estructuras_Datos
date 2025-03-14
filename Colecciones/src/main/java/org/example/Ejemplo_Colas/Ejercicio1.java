package org.example.Ejemplo_Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1 {

    public static void main(String[] args) {

        Queue<Character> cola = new LinkedList<>();

        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');

        boolean empty = cola.isEmpty();
        if (empty){
            System.out.println("La cola está vacía");
        }else {
            System.out.println("La cola no está vacía");
        }

        System.out.println(cola.size());

        System.out.println(cola.peek());

        System.out.println(cola.poll());



    }

}
