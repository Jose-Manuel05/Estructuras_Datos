package org.example.Lambda.Pokemon;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pokedex {

    private String pokemon;
    private Integer entrenadores;

    public Pokedex(String pokemon, int entrenadores) {
        this.pokemon = pokemon;
        this.entrenadores = entrenadores;
    }



}
