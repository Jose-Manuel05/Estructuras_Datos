package org.example.MercaDAM;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Objects;

@Getter @Setter
public class Cliente {

    private String usuario;
    private String contrasenya;
    private Pedido pedido;
    private boolean promociones;
    private String direccion;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.pedido = null;
        this.promociones = false;
        this.direccion = "Calle Falsa 123";
    }

    public void crearPedido() {
        if (this.pedido == null) {
            this.pedido = new Pedido();
            System.out.println();
        }
    }

    public void insertarProducto(String producto) {
        try {
            Producto prod = Producto.valueOf(producto.toUpperCase());

            System.out.print("¿Cuántas unidades quieres añadir? ");
            int cantidad = 1;

            try {
                cantidad = AppZonaClientes.scanner.nextInt();
                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor que cero. Se añadirá 1 unidad.");
                    cantidad = 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Cantidad no válida. Se añadirá 1 unidad.");
            }

            if (this.pedido.getProductos().containsKey(prod)) {
                int cantidadActual = this.pedido.getProductos().get(prod);
                this.pedido.getProductos().put(prod, cantidadActual + cantidad);
            } else {
                this.pedido.getProductos().put(prod, cantidad);
            }

            System.out.println("Se han añadido " + cantidad + " unidades de " + producto.toUpperCase() + " correctamente!");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: El producto no existe! Elije otro.");
        }
    }

    public double importePedido() {
        double total = 0;
        for (Producto p : this.pedido.getProductos().keySet()) {
            int cantidad = this.pedido.getProductos().get(p);
            total += p.getPrecio() * cantidad;
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return promociones == cliente.promociones && Objects.equals(usuario, cliente.usuario) && Objects.equals(contrasenya, cliente.contrasenya) && Objects.equals(pedido, cliente.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenya, pedido, promociones);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contrasenya + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
