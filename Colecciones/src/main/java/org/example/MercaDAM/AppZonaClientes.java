package org.example.MercaDAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {

    static Scanner scanner = new Scanner(System.in);
    static Cliente cliente;

    public static void main(String[] args) {
        MercaDAM mercaDAM = new MercaDAM();
        MercaDAM.generarClientes();
        List<Cliente> clientes = new ArrayList<>(MercaDAM.getClientes());
        System.out.println("Lista de clientes generados:" + clientes);
        System.out.println("\n*** COMPRA ONLINE DE MERCADAM ***");
        System.out.println();
        autenticar(clientes);

        boolean agregar = true;
        while (agregar) {
            System.out.println("==========================");
            System.out.println("Elije un producto: ");

        }
    }

    public static void autenticar(List<Cliente> clientes) {
        int intentos = 0;
        boolean autenticado = false;
        do {

            System.out.print("Usuario: ");
            String usuario = scanner.next();
            System.out.print("Contraseña: ");
            String contrasenya = scanner.next();

            for (Cliente cliente : clientes) {
                if (cliente.getUsuario().equals(usuario) && cliente.getContrasenya().equals(contrasenya)) {
                    System.out.println("Autenticación exitosa");
                    AppZonaClientes.cliente = cliente;
                    iniciarCompra();
                    autenticado = true;
                    break;
                }
            }

            if (!autenticado) {
                System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
                intentos++;
            }
        } while (!autenticado && intentos < 3);

        if (!autenticado) {
            System.out.println("ERROR DE AUTENTICACIÓN.");
            System.exit(1);
        }
    }

    public static void iniciarCompra() {
        if (cliente != null) {
            cliente.crearPedido();
            imprimirProductos();
        }
    }

    public static void imprimirProductos() {
        Producto[] productos = Producto.values();
        System.out.println("Productos disponibles:");
        for (Producto producto : productos) {
            System.out.println(producto + " - Precio: " + producto.getPrecio());
        }
    }

    public void imprimirDespedida() {

    }
}