package org.example.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pruebas {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(3,2,45,23,5));

        Collections.sort(num);
        System.out.println(num);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patricia", "Pol", "Izan", "Andrew"));
        Collections.sort(nombres, Collections.reverseOrder());


        System.out.println(nombres);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Sudadera", 6));
        listaProductos.add(new Producto("Pan", 1));
        listaProductos.add(new Producto("Arroz", 4));
        listaProductos.add(new Producto("Arroz", 6));

//        Collections.sort(listaProductos);
        //Collections.sort(listaProductos, new CompararPorPrecio());
        Collections.sort(listaProductos, new CompararPorPrecio().reversed());
        System.out.println(listaProductos);



    }
}
