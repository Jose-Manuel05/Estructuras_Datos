package org.example.MercaDAM;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class Pedido {

    HashMap<Producto, Integer> productos;
    private double importe_total;

    public Pedido() {
        this.productos = new HashMap<>();
        this.importe_total = 0;
    }

    public void aplicarPromo3x2() {
        for (HashMap.Entry<Producto, Integer> entry : productos.entrySet()) {
            int cantidad = entry.getValue();
            if (cantidad >= 3) {
                int gratis = cantidad / 3;
                double descuento = gratis * entry.getKey().getPrecio();
                this.importe_total -= descuento;
            }
        }
    }

    public void aplicarPromo10() {
        this.importe_total *= 0.9;
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (HashMap.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            total += producto.getPrecio() * cantidad;
        }
        this.importe_total = total;
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "importe_total=" + importe_total +
                ", productos=" + productos +
                '}';
    }
}
