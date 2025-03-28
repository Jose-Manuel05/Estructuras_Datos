package org.example.Practica_Diccionario;

import java.util.Scanner;

public class AppDiccionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Diccionario diccionario = new Diccionario();

        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Mesa", "Table");
        diccionario.nuevoPar("Coche", "Car");

        int totalPreguntas = 0, aciertos = 0;

        while (true) {
            String palabraEsp = diccionario.palabrasAleatorias();
            String primeraLetra = diccionario.primeraLetraTraduccion(palabraEsp);

            System.out.println("\n" + palabraEsp + ": " + primeraLetra + "...");
            System.out.print("Indique la respuesta: ");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("fin")) {
                break;
            }

            totalPreguntas++;
            String traduccionCorrecta = diccionario.traducir(palabraEsp);

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                System.out.println("¡NO! La respuesta correcta es " + traduccionCorrecta);
            }
        }

        System.out.println("\nFIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + totalPreguntas);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("Total errores: " + (totalPreguntas - aciertos));
        System.out.println("Aciertos: " + (aciertos * 100 / totalPreguntas) + "%");


    }

}
