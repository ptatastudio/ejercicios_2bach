package org.example;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Tenemos tomate. SI o NO");
        String t = in.next();

        in.nextLine();

        System.out.println("Tenemos aceite. SI o NO");
        String a = in.next();

        in.nextLine();

        System.out.println("Tenemos jamón. SI o NO");
        String j = in.next();

        if ((t.equals("NO")) || (a.equals("NO")) || (j.equals("NO"))) {
            System.out.println("Tenes que ir a comprar playooo");
        }else{
            System.out.println("Todo bien, todo correcto y yo que me alegro");
        }
    }
}