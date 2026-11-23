package org.example;

import java.util.Scanner;

public class Bucles_Ej6_1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres sumar?: ");
        int n = teclado.nextInt();
        int suma = 0;

        for (int i= 1; i<=n ; i++){
            System.out.println("Inserta nº" + i);
            int n_x = teclado.nextInt();
            suma += n_x;
        }
        System.out.println("El resultado es: " + suma);
    }
}
