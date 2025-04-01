package org.example.StringBuilder;

import java.util.Random;

public class Bus {
    public static final int TAM = 97;
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        int pos1 = 0;
        int pos2 = 0;
        System.out.println("\n<<<<<<<<<< CARRERA DE AUTOBUSES >>>>>>>>>>");
        System.out.println("         MONNEGRE FC vs IES MUTXAMEL        ");
        System.out.println("                   FIGHT!                   ");
        Thread.sleep(3000);
        while (pos1 < TAM && pos2 < TAM) {
            // Increment positions randomly (between 1 and 3)
            pos1 += random.nextInt(3) + 1;
            pos2 += random.nextInt(3) + 1;

            if (pos1 > TAM) {
                pos1 = TAM;
            }
            if (pos2 > TAM) {
                pos2 = TAM;
            }

            limpiarPantalla();
            System.out.println(autobus1(pos1));
            System.out.println(autobus2(pos2));

            Thread.sleep(70);
        }
        String winner;
        if (pos1 >= TAM && pos2 >= TAM) {
            winner = "Resulta en empate!";
        } else if (pos1 >= TAM) {
            winner = "FC Mutxamel";
        } else {
            winner = "MONNEGRE FC";
        }

        System.out.println("\033[32m" + "¡¡GANADOR: " + winner + " !!" + "\033[0m");
    }

    public static String autobus1(int n1) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________ ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   FC MUTXAMEL   |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    }

    public static String autobus2(int n2) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(n2)).append("________________ ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|   MONNEGRE FC   |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}