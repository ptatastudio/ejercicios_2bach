package org.example;

import java.util.Scanner;

public class Practica_Suma_Descendinte {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero");
        String t1 = in.nextLine();

        int count = t1.length();
        int resultado = 0;


        //Bucle contar
        for (int i = count; i > 0; i--) {

            String c1 = t1.substring(count - i, count);

            if (i != count) {
                System.out.print(" + ");
                System.out.print(c1);

            } else {
                System.out.print(c1);
            }

            int n_c1 = Integer.parseInt(c1);
            resultado = resultado + n_c1;
        }
        //Imprimir resultados
        System.out.print(" = " + resultado);

    }
}

