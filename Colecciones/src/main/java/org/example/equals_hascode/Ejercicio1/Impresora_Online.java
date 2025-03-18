package org.example.equals_hascode.Ejercicio1;

import java.util.LinkedHashSet;

public class Impresora_Online {

    static final String id = "PC9834";
    static LinkedHashSet<Peticion> listaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.txt");
        anyadirDocumento("prueba1.pdf");
        anyadirDocumento("prueba2.pdf");
        anyadirDocumento("prueba2.pdf");
        imprimirDocumento();
        System.out.println("Quedan " + getNumeroPeticiones());
        verTodo();
        imprimirTodo();

    }

    public static void anyadirDocumento(String nombre_fichero) {

        if (nombre_fichero.endsWith(".pdf")) {
            if (listaPeticiones.add(new Peticion(id, nombre_fichero))) {
                System.out.println("Documento " + nombre_fichero + " añadido a la cola de impresión");
            } else {
                System.out.println("Documento " + nombre_fichero + " ya en la cola de impresión");
            }
        }else {
            System.out.println("El documento " + nombre_fichero + " no es un PDF");
        }

    }

    public static void imprimirDocumento() {
        System.out.println("Imprimiendo... " + listaPeticiones.getFirst().getNombre());
        listaPeticiones.removeFirst();
    }

    public static int getNumeroPeticiones() {
        return listaPeticiones.size();
    }

    public static void verTodo() {
        System.out.println("Cola de impresion: " + listaPeticiones);
    }

    public static void imprimirTodo() {
        while (!listaPeticiones.isEmpty()) {
            imprimirDocumento();
        }
        System.out.println("Cola de impresion vacia");
    }

}
