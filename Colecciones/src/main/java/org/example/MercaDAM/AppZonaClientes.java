package org.example.MercaDAM;

import java.util.*;

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
        procesarCompra();
        mostrarResumen();
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
                    AppZonaClientes.cliente = cliente;
                    iniciarCompra();
                    autenticado = true;
                    break;
                }
            }

            if (!autenticado) {
                System.out.println("El producto no existe! Elije otro.");
                intentos++;
            }
        } while (!autenticado && intentos < 3);

        if (!autenticado) {
            System.out.println("ERROR DE AUTENTICACIÓN.");
            System.exit(1);
        }
    }

    public static void procesarCompra() {
        boolean agregar = true;
        while (agregar) {
            System.out.println("=========================");
            System.out.print("Elije un producto: ");
            String producto = scanner.next();

            cliente.insertarProducto(producto);

            double totalActual = cliente.importePedido();
            System.out.println("\nTotal actual: " + totalActual + "€");
            System.out.print("¿Deseas añadir más productos? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                agregar = false;
            } else {
                imprimirProductos();
            }
        }
    }

    public static void mostrarResumen() {
        System.out.println("=========================");
        System.out.println("\nResumen de la compra:");
        System.out.println("\nProductos: ");
        System.out.println();

        for (Map.Entry<Producto, Integer> entry : cliente.getPedido().getProductos().entrySet()) {
            Producto producto = entry.getKey();
            System.out.printf(entry.getValue() + " " +
                    entry.getKey()+ " " +
                    producto.getPrecio() + "€\n");
        }

        double total = calcularTotal(cliente.getPedido());
        System.out.printf("\nImporte total: " + total + "€\n");
    }

    public static double calcularTotal(Pedido pedido) {
        double total = 0;
        for (Map.Entry<Producto, Integer> entry : pedido.getProductos().entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            total += producto.getPrecio() * cantidad;
        }
        return total;
    }


    public static void iniciarCompra() {
        if (cliente != null) {
            cliente.crearPedido();
            imprimirProductos();
        }
    }

    public static void imprimirProductos() {
        Producto[] productos = Producto.values();
        System.out.println("Añade productos a tu carrito de compra...");
        for (Producto producto : productos) {
            System.out.println(producto + " - Precio: " + producto.getPrecio());
        }
    }

    public static void imprimirDespedida() {

    }
}