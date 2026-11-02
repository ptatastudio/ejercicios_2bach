package org.example;

import java.util.Scanner;

public class PracticaTres {
    static void main() {
        Scanner in = new Scanner(System.in);


        System.out.println("Introduce un numero de (tres cifras)");
        int numero = in.nextInt();

        in.nextLine();

        System.out.println("Introduce un numero de (tres cifras)");
        int numero2 = in.nextInt();


        String numint = Integer.toString(numero2);
        String c1 = numint.substring(0,1);
        String c2 = numint.substring(1,2);
        String c3 = numint.substring(2,3);

        int n_c1 = Integer.parseInt(c1);
        int n_c2 = Integer.parseInt(c2);
        int n_c3 = Integer.parseInt(c3);

        System.out.println("La primera cifra es " + n_c1);
        System.out.println("La segundo cifra es " + n_c2);
        System.out.println("La tercero cifra es " + n_c3);

    }
}
