package org.example.Inmutabilidad;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {

        Juego pokemon = new Juego("Plata", 100);

        List<String> listaPokemons = pokemon.getListaPersonajes();
        listaPokemons.add("Pikachu");

        pokemon.getListaPersonajes().add("Squirtle");
        pokemon.getListaPersonajes().add("Charmander");

        System.out.println(pokemon.getListaPersonajes());

    }
}
