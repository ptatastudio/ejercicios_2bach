package org.example;

import java.util.Scanner;

public class Bucles_Ej6_1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres sumar?: ");
        int n = in.nextInt();
        int suma = 0;

        //Espacios para orgianización visual
        System.out.println("  ");

        //Bucle de pedir numeros
        for (int i= 1; i<=n ; i++){
            System.out.println("Inserta nº" + i);
            int n_x = in.nextInt();
            suma += n_x;
        }

        //Espacios para orgianización visual
        System.out.println("  ");

        //Enseñar sumatorio
        System.out.println("El resultado es: " + suma);
    }
}
