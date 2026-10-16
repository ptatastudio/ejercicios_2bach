package org.example;

import java.util.Scanner;

public class Ejercicio {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuantas horas trabajas?");
        float hora = in.nextFloat();

        in.nextLine();

        System.out.println("¿Que precio cobras la hora?");
        float precio = in.nextFloat();

        float ganancias;

        ganancias = hora*precio;

        System.out.println("Ganas: " + ganancias + " $");
    }
}
