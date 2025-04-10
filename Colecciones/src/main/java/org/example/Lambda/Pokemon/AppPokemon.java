package org.example.Lambda.Pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppPokemon {
    public static void main(String[] args) {

        Pokedex poke1 = new Pokedex("Squirtle", 5);
        Pokedex poke2 = new Pokedex("Charmander", 2);

        Pokemon magikarp = new Pokemon() {
            @Override
            public void atacar(int nivel, Pokedex pokedex) {
                System.out.println("Atacando con nivel: " + nivel +" SALPICADURAAAAAA");
                System.out.println("Lucha contra " + pokedex.getPokemon());
            }
        };

        magikarp.atacar(12, poke1);

        System.out.println();
        Pokemon pikachu = (int nivel, Pokedex pokedex) -> {
            System.out.println("Atacando con nivel: " + nivel +" IMPACTRUENOOOOO");
            System.out.println("PIKA PIKA PIKACHU");
            System.out.println("Lucha contra " + pokedex.getPokemon());
        };

        pikachu.atacar(100, poke2);

        List<Pokedex> listaPokex = new ArrayList<>();
        listaPokex.add(poke1);
        listaPokex.add(poke2);
        listaPokex.add(new Pokedex("Bulbasaur", 15));

        Collections.sort(listaPokex, (x,y) -> x.getEntrenadores().compareTo(y.getEntrenadores()));
//       Collections.sort(listaPokex, Comparator.comparing(Pokedex::getEntrenadores));
//        listaPokex.sort((x,y) -> x.getEntrenadores().compareTo(y.getEntrenadores()));

        for (Pokedex poke : listaPokex) {
            System.out.println(poke.getPokemon() + " " + poke.getEntrenadores());
        }

        System.out.println();
        Collections.sort(listaPokex, (x,y) -> x.getPokemon().compareTo(y.getPokemon()));
        for (Pokedex poke : listaPokex) {
            System.out.println(poke.getPokemon() + " " + poke.getEntrenadores());
        }

        listaPokex.add(new Pokedex("Digglet", 15));
        listaPokex.sort(Comparator.comparing(Pokedex::getEntrenadores).thenComparing(Pokedex::getPokemon).reversed());

        for (Pokedex poke : listaPokex) {
            System.out.println(poke.getPokemon() + " " + poke.getEntrenadores());
        }

    }
}
