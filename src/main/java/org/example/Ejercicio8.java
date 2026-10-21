package org.example;

import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un lado");
        float l1 = in.nextFloat();

        in.nextLine();

        System.out.println("Introduce otro lado");
        float l2 = in.nextFloat();

        in.nextLine();

        System.out.println("Introduce otro lado");
        float l3 = in.nextFloat();

        if (l1!=l2 & l2!=l3 & l3!=l1 ) {
            System.out.println("Es un triangulo escaleno");

            }else if (l1==l2 & l2==l3 & l3==l1){
            System.out.println("Es un triangulo equilátero");

            }else{
            System.out.println("Es un triangulo isosceles");
        }
    }
}