package org.example;

import java.util.Scanner;

public class Ejercicio2_b2 {

    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String t1 = in.nextLine();
        String t2 = in.nextLine();

        if (t1.length() > t2.length()) {
            System.out.println("mayor t1");
        } else {
            System.out.println("mayor t2");


    }
}
}