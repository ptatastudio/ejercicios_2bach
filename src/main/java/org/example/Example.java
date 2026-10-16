package org.example;

import java.util.Scanner;

public class Example {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String name = in.next();

        in.nextLine();

        System.out.println("A que curso vas?");
        String grade = in.nextLine();

        System.out.println("Hola " + name + ", bienevenido a " + grade);

        System.out.println("Inserta un numero...");
        int x = in.nextInt();
        System.out.println("Inserta otro numero...");
        int y = in.nextInt();

        //Concatenando
        System.out.println("El resultado es: " + (x+y));

        //variable resultado
        int resultado = x+y;
        System.out.println("El resultado es: " + resultado);

    }


}


