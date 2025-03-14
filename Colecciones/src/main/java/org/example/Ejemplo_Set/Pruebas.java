package org.example.Ejemplo_Set;

import java.util.*;

public class Pruebas {
    public static void main(String[] args) {

        Set<Character> letras = new HashSet<>();

        letras.add('d');
        letras.add('t');
        letras.add('a');
        letras.add('n');
        letras.add('t');

        System.out.println(letras);

        System.out.println();
        System.out.println("--------------------");

        Set<Character> letrasEnlace = new LinkedHashSet<>();

        letrasEnlace.add('z');
        letrasEnlace.add('b');
        letrasEnlace.add('g');
        System.out.println(letrasEnlace.add('z'));

        System.out.println(letrasEnlace);

        System.out.println();
        System.out.println("--------------------");

        Set<Character> letrasOrdenadas = new TreeSet<>();

        letrasOrdenadas.add('v');
        letrasOrdenadas.add('n');
        letrasOrdenadas.add('d');
        letrasOrdenadas.add('p');
        letrasOrdenadas.add('p');

        System.out.println(letrasOrdenadas);

        letrasOrdenadas.remove('n');

        System.out.println(letrasOrdenadas);


    }
}
