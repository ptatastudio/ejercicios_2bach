package org.example;

import java.util.Scanner;

public class Bucles_Ej7 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una palabra/frase para ver su cadena ivertida: ");
        String t1 = in.nextLine();
        int count = t1.length()-1;

        //Bucle invertir
        for (int i= count; i >=0; i--){
            System.out.print(t1.charAt(i));
        }
    }
}
