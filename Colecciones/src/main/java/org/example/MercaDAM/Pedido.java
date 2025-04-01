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

    }

    public void aplicarPromo10() {

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "importe_total=" + importe_total +
                ", productos=" + productos +
                '}';
    }
}
