package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double n1 = in.nextFloat();

        if (n1 == 0) {
            System.out.println(n1 + " es neutral");

        }else if (n1>0){
            System.out.println(n1 + " es positivo");
        }else{
            System.out.println(n1 + " es negativo");
        }
    }
}
