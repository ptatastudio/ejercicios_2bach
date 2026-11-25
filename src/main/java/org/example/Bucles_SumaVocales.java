package org.example;

import java.util.Scanner;

public class Bucles_SumaVocales {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una palabra/frase para ver numero de vocales: ");
        String t1 = in.nextLine().toUpperCase();
        int count = t1.length()-1;
        int num_v = 0;
        int num_A = 0;
        int num_E = 0;
        int num_I = 0;
        int num_O = 0;
        int num_U = 0;

        //Bucle contar
        for (int i= count; i >=0; i--){
            char c = t1.charAt(i);
            switch(c) {
                case 'A':
                    num_v = (num_v+1);
                    num_A = (num_A+1);
                    break;
                case 'E':
                    num_v = (num_v+1);
                    num_E = (num_E+1);
                    break;
                case 'I':
                    num_v = (num_v+1);
                    num_I = (num_I+1);
                    break;
                case 'O':
                    num_v = (num_v+1);
                    num_O = (num_O+1);
                    break;
                case 'U':
                    num_v = (num_v+1);
                    num_U = (num_U+1);
                    break;
            }
        }

        //Mostrar resultado
        System.out.println("  ");
        System.out.println("Tiene " + num_v + " vocales");
        System.out.println("  ");
        System.out.println("A:" + num_A);
        System.out.println("E:" + num_E);
        System.out.println("I:" + num_I);
        System.out.println("O:" + num_O);
        System.out.println("U:" + num_U);


    }
}

