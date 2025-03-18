package org.example.equals_hascode;

import java.util.LinkedHashSet;

public class prueba {
    public static void main(String[] args) {

        Pacientes raul = new Pacientes("123456", "Raúl", "Garcia Delgado");
        Pacientes xavi = new Pacientes("123456", "Javier", "Cervera Lillo");
        Pacientes javi = new Pacientes("123456", "Javier", "Cervera Lillo");

        LinkedHashSet<Pacientes> listaPacientes = new LinkedHashSet<>();
        listaPacientes.add(raul);
        listaPacientes.add(xavi);
        listaPacientes.add(javi);

        System.out.println(xavi.hashCode());
        System.out.println(javi.hashCode());

        System.out.println(listaPacientes);

    }
}
