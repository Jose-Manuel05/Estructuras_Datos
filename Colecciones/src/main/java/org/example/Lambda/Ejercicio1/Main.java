package org.example.Lambda.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Ejecutor ej = new Ejecutor() {
            @Override
            public boolean ejecutar(int param1) {
                if (param1 > 10) {
                    return true;
                }else {
                    return false;
                }
            }
        };

        Ejecutor lambda = param1 -> {
            if (param1 > 10) {
                return true;
            } else {
                return false;
            }
        };

        boolean resultado1 = ej.ejecutar(15);
        boolean resultado2 = lambda.ejecutar(5);
        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}
