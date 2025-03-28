package org.example.Ejemplo_Map.Ejercicio3;

public class AppTemperaturas {
    public static void main(String[] args) {
        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.insertarTemperatura("Alicante", 32);


        registro.actualizarTemperatura("Alicante");
        System.out.println(registro);

        System.out.println();
        registro.consultarTemperatura();
        System.out.println(registro);

        System.out.println();
        registro.mostrar();

    }
}
