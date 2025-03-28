package org.example.Comparator;

import java.util.Comparator;

public class CompararPorPrecio implements Comparator<Producto> {
    @Override
    public int compare(Producto o1, Producto o2) {

        int comparacionPrecio = o1.getPrecio().compareTo(o2.getPrecio());

        if (comparacionPrecio != 0) {
            return comparacionPrecio;
        }

        return o1.getNombre().compareTo(o2.getNombre());

    }
}
