package org.example;

import java.util.Scanner;

public class PracticaTres {
    static void main() {
        Scanner in = new Scanner(System.in);

        int numero;

        //Pedir el numero 2

        do {

            System.out.println("Introduce el primer numero (tres cifras)");
            numero = in.nextInt();

        } while (numero <= 99 || numero > 999);

        in.nextLine();

        int numero2;

        //Pedir el numero 2

        do {

            System.out.println("Introduce el segundo nuemero (tres cifras)");
            numero2 = in.nextInt();

        } while (numero2 <= 99 || numero2 > 999);

        //Convertir los enteros a Strings para sacar cada posición

        String numint = Integer.toString(numero2);
        String c1 = numint.substring(0, 1);
        String c2 = numint.substring(1, 2);
        String c3 = numint.substring(2, 3);

        //Convertir los Strings a enteros para multiplicar

        int n_c1 = Integer.parseInt(c1);
        int n_c2 = Integer.parseInt(c2);
        int n_c3 = Integer.parseInt(c3);

        //Juntar cada numero e imprimir en distintas posicinones para motras proceso de multiplicación

        System.out.println(numero);
        System.out.println("x " + numero2);

        System.out.println("--------");

        System.out.println(n_c3 * numero);
        System.out.println(n_c2 * numero + "x");
        System.out.println(n_c1 * numero + "xx");

        System.out.println("--------");

        System.out.println(numero * numero2);


    }
}
