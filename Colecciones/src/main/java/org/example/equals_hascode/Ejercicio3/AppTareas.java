package org.example.equals_hascode.Ejercicio3;

import java.util.HashSet;
import java.util.Stack;

public class AppTareas {

    static Stack<Informe> pilaInformes = new Stack<>();
    static HashSet<Informe> listaInformesPorTipo = new HashSet<>();

    public static void main(String[] args) {

        pilaInformes.push(new Informe(1, "Grapar informes", Tipo.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1, "Atender llamadas", Tipo.ADMINISTRATIVO));
        pilaInformes.push(new Informe(2, "Ir a por folios", Tipo.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1, "LLamar a casa",Tipo.PERSONAL));
        pilaInformes.push(new Informe(2, "Comprar el pan", Tipo.PERSONAL));

        System.out.println();
        while (!pilaInformes.isEmpty()) {
            System.out.println("Despachando... " + pilaInformes.pop());
        }

        pilaInformes.push(new Informe(1, "Grapar informes", Tipo.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(1, "Grapar informes", Tipo.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1, "Atender llamadas", Tipo.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(1, "Atender llamadas", Tipo.ADMINISTRATIVO));
        pilaInformes.push(new Informe(2, "Ir a por folios", Tipo.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(2, "Ir a por folios", Tipo.ADMINISTRATIVO));

        System.out.println("Tienes " + listaInformesPorTipo.size() + " tipos de tareas distintas");
        pilaInformes.pop();

        System.out.println();
        for (int i = pilaInformes.size() - 1; i >= 0; i--) {
            System.out.println(pilaInformes.get(i));
        }

        System.out.println();
        System.out.println(pilaInformes);


    }



}
