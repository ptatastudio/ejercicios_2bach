package org.example;

import java.util.Scanner;

public class Bucles_SumaVocales {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una palabra/frase para ver numero de vocales: ");
        String t1 = in.nextLine().toUpperCase();
        int count = t1.length()-1;
        int num_v = 0;

        //Bucle contar
        for (int i= count; i >=0; i--){
            char c = t1.charAt(i);
            switch(c) {
                case 'A':
                    num_v = (num_v+1);
                    break;
                case 'E':
                    num_v = (num_v+1);
                    break;
                case 'I':
                    num_v = (num_v+1);
                    break;
                case 'O':
                    num_v = (num_v+1);
                    break;
                case 'U':
                    num_v = (num_v+1);
                    break;

            }
        }
        //Mostrar resultado
        System.out.println("Tiene " + num_v + " vocales");
    }
}

