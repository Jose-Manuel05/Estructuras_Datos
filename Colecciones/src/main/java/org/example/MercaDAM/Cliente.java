package org.example.MercaDAM;

import lombok.Getter;
import lombok.Setter;

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

    }

    public double importePedido() {

        return 0;
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
