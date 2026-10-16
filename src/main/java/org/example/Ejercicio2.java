package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner in = new Scanner(System.in);

        final double VALOR = 1.5;

        System.out.println("¿Cuantas horas trabajas?");
        double hora = in.nextFloat();

        in.nextLine();

        System.out.println("¿Que precio cobras la hora?");
        double precio = in.nextFloat();

        double ganancias;
        double ganancias2;
        double ganancias3;

        ganancias = hora*precio;
        ganancias2 = ((hora*precio)*VALOR)-hora*precio;
        ganancias3 = ganancias+ganancias2;
        if (hora > 40) {
            System.out.println("Ganas: " + ganancias3 + " $");
        }else{
            System.out.println("Ganas: " + ganancias + " $");
        }
    }
}
