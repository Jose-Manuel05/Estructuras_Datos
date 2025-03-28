package org.example.Iterator.Ejercicio;

import java.util.*;

public class Maquina_Maria {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe un texto: ");
        String entrada = sc.nextLine();

        LinkedList<Character> texto = new LinkedList<>();
        ListIterator<Character> it = texto.listIterator();

        //Recorrer el texto
        for (char c : entrada.toCharArray()) {
            switch (c) {
                case '<': //retroceder
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case'>': //avanzar
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case'#': //borrar como el retroceso
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(c);
                    break;
            }

        }

        //Imprimir la lista
        for (Character c : texto) {
            System.out.print(c);
        }

    }
}
