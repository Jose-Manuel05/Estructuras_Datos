package org.example.Ejemplo_Colas;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Prueba {

    public static void main(String[] args) {

        Queue<Integer> num = new ArrayBlockingQueue<>(2);

        num.add(3);
        num.add(8);

        Queue <Integer> cola = new LinkedList<>();

        cola.offer(34);
        cola.offer(15);
        cola.offer(56);

        System.out.println(cola.poll());

        System.out.println(cola.peek());

        System.out.println("-------------------");

        Deque<Integer> cola_doble = new LinkedList<>();

        cola_doble.offer(3);
        cola_doble.offerFirst(6);
        cola_doble.offerLast(10);
        cola_doble.pollFirst();
        cola_doble.pollLast();

        System.out.println(cola_doble);


    }

}
