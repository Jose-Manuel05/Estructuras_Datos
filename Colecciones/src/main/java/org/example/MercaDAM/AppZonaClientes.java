package org.example.MercaDAM;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
        imprimirMenuPromos();
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
                System.out.println("\nAlgo no coincide o no existe! Vuelve a intentarlo...\n");
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
        System.out.println("Productos: ");
        System.out.println();

        for (Map.Entry<Producto, Integer> entry : cliente.getPedido().getProductos().entrySet()) {
            Producto producto = entry.getKey();
            System.out.printf(entry.getValue() + " " +
                    entry.getKey()+ " " +
                    producto.getPrecio() + "€\n");
        }

        double total = cliente.getPedido().calcularImporteTotal();
        System.out.printf("\nImporte total: " + total + "€\n");
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

    public static void imprimirMenuPromos() {
        boolean continuar = true;
        while (continuar) {
        System.out.println("¿Quieres aplicar alguna promoción?");
        System.out.println("[1]. Aplicar promo");
        System.out.println("[2]. Mostrar resumen ordenado por uds.");
        System.out.println("[3]. Terminar pedido.");
        System.out.println("\n==========================");
        System.out.print("\nElige una opción: ");
        String op = scanner.next();
        System.out.println("\n==========================");

        switch (op) {
            case "1":
                if (!cliente.isPromociones()) {
                    cliente.getPedido().calcularImporteTotal();
                    cliente.getPedido().aplicarPromo3x2();
                    cliente.getPedido().aplicarPromo10();
                    cliente.setPromociones(true);
                    System.out.println("Promociones aplicadas correctamente.");
                    mostrarResumen();
                } else {
                    System.out.println("\n=============================");
                    System.out.println("\nYA HAS APLICADO TUS PROMOS.");
                    System.out.println("\n=============================");
                }
                break;
            case "2":
                System.out.println(cliente.getPedido());
                break;
            case "3":
                imprimirDespedida();
                continuar = false;
                break;
            default:
                System.out.println("Opción no válida.");
        }

        }
    }

    public static void imprimirDespedida() {
        System.out.println("\nGRACIAS POR SU PEDIDO. Se lo mandaremos a la dirección " + cliente.getDireccion() + ".");
    }
}