package org.example;

import java.util.Scanner;

public class Ejercicio1_b2 {

    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String t = in.nextLine();

        System.out.println("Longitud de frase:");
        System.out.println(t.length());

        System.out.println("Frase sin espacios:");
        System.out.println(t.replace(" ", ""));

        System.out.println("Frase sin espacios:");
        System.out.println(t.replace(" ", ""));

        System.out.println("Frase en mayuscula:");
        System.out.println(t.toUpperCase());

    }
}
