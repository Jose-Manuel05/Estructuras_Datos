package org.example.Iterator;

import java.util.*;

public class pruebas {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10,23,45,1,3,5));

        Iterator<Integer> it = numeros.iterator();

        while(it.hasNext()){
            Integer num = it.next();

            if(num == 23){
                it.remove();
            }
        }

        System.out.println(numeros);

        ArrayList<Casino> listaCasino = new ArrayList<>();
        listaCasino.add(new Casino("Poker", 500));
        listaCasino.add(new Casino("BlackJack", 50));
        listaCasino.add(new Casino("Ruleta", 25));

        Iterator<Casino> itCasino = listaCasino.iterator();

        while(itCasino.hasNext()){
            Casino casino = itCasino.next();

            System.out.println(casino);

            if (casino.getApuesta_minima()>0.20){
                System.out.println("Raúl no puede jugar");
            }

            if (casino.getApuesta_minima()<30){
                itCasino.remove();
            }
        }

        System.out.println(listaCasino);

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("Hola", "Helou");
        diccionario.put("Casa", "House");
        diccionario.put("Lápiz", "Pencil");

        for (Map.Entry<String, String> mapa : diccionario.entrySet()){

        }

        Iterator<Map.Entry<String, String>>  itDiccionario = diccionario.entrySet().iterator();

        while (itDiccionario.hasNext()) {
            Map.Entry<String, String> map = itDiccionario.next();
            System.out.println("Palabra en español: " + map.getKey() + ". Palabra en inglés: " + map.getValue());
        }

    }
}
