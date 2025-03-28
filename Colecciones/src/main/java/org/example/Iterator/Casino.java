package org.example.Iterator;

public class Casino {

    private String nombre;
    private double apuesta_minima;

    public Casino(String nombre, double apuesta_minima) {
        this.nombre = nombre;
        this.apuesta_minima = apuesta_minima;
    }

    public double getApuesta_minima() {
        return apuesta_minima;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "apuesta_minima=" + apuesta_minima +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
