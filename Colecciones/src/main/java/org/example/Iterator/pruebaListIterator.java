package org.example.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class pruebaListIterator {
    public static void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'x', 'z'));

        ListIterator<Character> iterador = letras.listIterator();


        // Cambiar la letra 'r' por 's'
        while (iterador.hasNext()) {
            System.out.print(iterador.next());
            iterador.set('r');
        }

        ListIterator<Character> iterador_patras = letras.listIterator(letras.size());

        // Imprimir la lista al revés
        while (iterador_patras.hasPrevious()) {
            System.out.print(iterador_patras.previous());
        }
    }
}
