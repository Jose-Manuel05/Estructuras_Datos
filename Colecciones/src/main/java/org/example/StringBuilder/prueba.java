package org.example.StringBuilder;

public class prueba {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(" Mundo"); // inserta " Mundo" al final
        sb.insert(5, " querido"); // inserta " querido" en la posición 5 (delante de el que ya estaba en esa posición que es Mundo)
        sb.replace(5, 13, "gran "); // reemplaza por "gran" todo lo que haya desde la posición 5 a la 13
        sb.delete(0, 5); // borra los primeros 5 caracteres: "Hola "
        System.out.println(sb.toString()); // imprime "granoMundo"
        sb.reverse();
        System.out.println(sb.toString()); // imprime "odnuM narg"

    }
}
