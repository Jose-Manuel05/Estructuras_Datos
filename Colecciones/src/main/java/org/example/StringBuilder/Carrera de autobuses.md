# Carrera de autobuses

---

## Índice

1. [Resumen](#resumen)

2. [Estructura](#estructura)

3. [Programa](#programa)

4. [Entrega](#entrega)

## Resumen

> El programa simula una carrera entre dos autobuses ("MONNEGRE FC" y "IES MUTXAMEL") en la consola. Cada autobús avanza de forma aleatoria en una pista de longitud 97 unidades, representada visualmente con caracteres ASCII. El programa actualiza la pantalla continuamente hasta que uno de los autobuses alcanza la meta. Finalmente, se declara un ganador o un empate.

## Estructura

- He duplicado la clase de autobús y la nombrado autobus2

```java
public static String autobus1(int n1) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________ ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   FC MUTXAMEL   |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    }

public static String autobus2(int n2) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(n2)).append("________________ ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|   MONNEGRE FC   |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    };
    }
```

- Luego he añadido dos variables para identificar la posición de cada autobús llamas: pos1 y pos2

```java
int pos1 = 0;
int pos2 = 0;
```

- Después solo queda modificar la lógica en el while para que avancen los dos buses

```java
while (pos1 < TAM && pos2 < TAM) {
            // Increment positions randomly (between 1 and 3)
            pos1 += random.nextInt(3) + 1;
            pos2 += random.nextInt(3) + 1;

            if (pos1 > TAM) {
                pos1 = TAM;
            }
            if (pos2 > TAM) {
                pos2 = TAM;
            }

            limpiarPantalla();
            System.out.println(autobus1(pos1));
            System.out.println(autobus2(pos2));

            Thread.sleep(70);
        }
```

- Y para finalizar es añadir el ganador de la competición 

```java
String winner;
        if (pos1 >= TAM && pos2 >= TAM) {
            winner = "Resulta en empate!";
        } else if (pos1 >= TAM) {
            winner = "FC Mutxamel";
        } else {
            winner = "MONNEGRE FC";
        }

        System.out.println("\033[32m" + "¡¡GANADOR: " + winner + " !!" + "\033[0m");
```

## Programa

## Entrega
