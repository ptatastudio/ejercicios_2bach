package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ClasificadorGeneraciones {
    static void main() {
        Scanner in = new Scanner(System.in);

        LocalDateTime hoy = LocalDateTime.now();

        int crrt_year = hoy.getYear();

        System.out.println("Bienbenido al clasificador de generaciones");

        System.out.println("Elige el caso (1 o 2)");
        int c = in.nextInt();

        in.nextLine();

        switch(c) {
            case 0:
                break;
            case 1:
                //modo 1
                System.out.println("Introduce tu año de nacimiento:");
                String year_st = in.nextLine();

                int g = Integer.parseInt(year_st);

                if (g >= 1900 && g <= crrt_year) {
                    System.out.println("Valido, naciste en " + g);

                    //test
                    if (g <= 1927) {
                        System.out.println("Sin Generación bautizada");

                    } else if (g <= 1944) {
                        System.out.println("Generación Silent");

                    } else if (g <= 1964) {
                        System.out.println("Baby Boomers");

                    } else if (g <= 1981) {
                        System.out.println("Generación X");

                    } else if (g <= 1994) {
                        System.out.println("Generación Y");

                    } else {
                        System.out.println("Generación Z");
                    }
                } else {
                    System.out.println("No valido");
                }
                break;
            case 2:
                //modo 2
                System.out.println("Introduce tu edad:");
                int year = in.nextInt();

                if (year >= 0) {
                    int g2 = (crrt_year - year);
                    System.out.println("Valido, naciste en el " + g2);

                    //test
                    if (g2 >= 1900 && g2 <= 1927) {
                        System.out.println("Sin Generación bautizada");

                    } else if (g2 >= 1928  && g2 <= 1944) {
                        System.out.println("Generación Silent");

                    } else if (g2 >= 1945  && g2 <= 1964) {
                        System.out.println("Baby Boomers");

                    } else if (g2 >= 1965  && g2 <= 1981) {
                        System.out.println("Generación X");

                    } else if (g2 >= 1982  && g2 <= 1994) {
                        System.out.println("Generación Y");

                    } else {
                        System.out.println("Generación Z");
                    }
                } else {
                    System.out.println("No valido");
                break;
                }
        }
        }
    }
