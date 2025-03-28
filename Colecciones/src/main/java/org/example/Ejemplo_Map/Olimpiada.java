package org.example.Ejemplo_Map;

import java.util.HashMap;
import java.util.Map;

public class Olimpiada {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int n = in.nextInt();
        in.nextLine();

        if (n == 0) {
            return false;
        }else {

            String numeros = in.nextLine();
            String[] numerosVector = numeros.split(" ");

            Map<String, Integer> mapaNumeros = new HashMap<>();

            Integer max = 0;
            String clave_max = "0";

            for (String num : numerosVector) {
                if (mapaNumeros.containsKey(num)) {
                    mapaNumeros.put(num, mapaNumeros.get(num) + 1);
                } else {
                    mapaNumeros.put(num, 1);
                }
                if (max < mapaNumeros.get(num)) {
                    max = mapaNumeros.get(num);
                    clave_max = num;
                }

            }

            System.out.println(clave_max);

            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
