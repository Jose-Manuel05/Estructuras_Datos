package org.example.equals_hascode;

import java.util.Objects;

public class Pacientes {

    private String sip;
    private String nombre;
    private String apellidos;

    public Pacientes(String sip, String nombre, String apellidos) {
        this.sip = sip;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacientes pacientes = (Pacientes) o;
        return Objects.equals(sip, pacientes.sip) && Objects.equals(nombre, pacientes.nombre) && Objects.equals(apellidos, pacientes.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "apellidos='" + apellidos + '\'' +
                ", sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
