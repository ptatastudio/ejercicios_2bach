package org.example;

import java.util.Scanner;

public class Practicaferia {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        System.out.println(" altura (en cm)");
        int l = in.nextInt();


        if ((l <= 0) || (l > 230)) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
        } else if (l < 140) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN, te faltan " + (140 - l) + " cm de altura");

        } else {
            System.out.println("peso");
            float p = in.nextFloat();

            double pm = (l * 2 / 8);

            if ((p > pm) || (p < 120)) {
                System.out.println("Pesas " + p + " Kg. Peso minimo calculado: " + pm + " .¡¡SUBE A LA ATRACCIÓN!!");

            } else {
                System.out.println("LO SIENTO, sobrepasas" + (120 - p) + " Kg el limite.");

            }
        }
    }
}