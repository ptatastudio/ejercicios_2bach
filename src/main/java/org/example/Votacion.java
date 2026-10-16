package org.example;

import java.util.Scanner;

public class Votacion {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String name = in.next();

        in.nextLine();

        System.out.println("¿Que edad tienes?");
        int edad = in.nextInt();

        if (edad > 100) {
            System.out.println(name + " ,eres altamente viejo BRO, per puedes votar igual <3");
        } else {
            if (edad <= 0) {
                System.out.println(name + ", no existes, siento decirtelo yo. No puedes votar");
            } else {
                if (edad == 18) {
                    System.out.println(name + " ,que joven y guapooo estàs! Puedes votar");
                } else {
                    if (edad > 18) {
                        System.out.println(name + " ,puedes votar");
                    } else {
                        System.out.println(name + ",no puedes votar");
                    }
                }
            }
        }
    }
}


