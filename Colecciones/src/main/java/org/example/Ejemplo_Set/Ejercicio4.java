package org.example.Ejemplo_Set;

import java.util.TreeSet;

public class Ejercicio4 {
    public static void main(String[] args) {

        TreeSet<Integer> num1 = new TreeSet<>();
        TreeSet<Integer> num2 = new TreeSet<>();

        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);

        num2.add(6);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(0);

        System.out.println("Conjunto 1: " + num1);
        System.out.println("Conjunto 2: " + num2);

        TreeSet<Integer> suma_nums = new TreeSet<>();

        while (!num1.isEmpty() || !num2.isEmpty() ) {
           if (!num1.isEmpty()) {
                suma_nums.add(num1.pollFirst());
           }else {
                suma_nums.add(num2.pollFirst());
           }
        }

        System.out.println("Conjunto suma: " + suma_nums);

    }
}
