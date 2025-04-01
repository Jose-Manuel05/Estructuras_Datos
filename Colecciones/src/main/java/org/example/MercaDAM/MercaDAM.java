package org.example.MercaDAM;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MercaDAM {

    private static Set <Cliente> clientes;
    static Random random = new Random();

    public MercaDAM() {
        clientes = new HashSet<>();
    }

    public static void generarClientes() {
        for (int i = 0; i < 1; i++) {
            String usuario = generarCadenaAleatoria(8);
            String contrasenya = generarCadenaAleatoria(8);
            Cliente cliente = new Cliente(usuario, contrasenya);
            clientes.add(cliente);
        }
    }

    private static String generarCadenaAleatoria(int longitud) {
        char[] cadena = new char[longitud];
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < longitud; i++) {
            cadena[i] = caracteres.charAt(random.nextInt(caracteres.length()));
        }
        return new String(cadena);
    }

    public static Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

    @Override
    public String toString() {
        return "MercaDAM{" +
                "clientes=" + clientes +
                '}';
    }
}
