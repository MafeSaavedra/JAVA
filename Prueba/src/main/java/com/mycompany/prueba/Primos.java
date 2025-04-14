package com.mycompany.prueba;

import java.util.Scanner;

public class Primos {

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int cont2 = 2; cont2 <= Math.sqrt(num); cont2++) {
            if (num % cont2 == 0) {
                return false;
            }
        }
        return true; // Se coloca fuera del for
    }

    public static void main(String[] args) {
        Scanner scanerInput = new Scanner(System.in);
        int[] primos = new int[5];
        boolean hayPrimos = false;

        System.out.println("-----------------------------------------------------------");
        System.out.println("A CONTINUACIÓN DIGITE 5 NÚMEROS ALEATORIOS DE TIPO ENTERO");
        System.out.println("-----------------------------------------------------------");

        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Número # " + (cont + 1));
            primos[cont] = scanerInput.nextInt();
        }

        for (int cont3 = 0; cont3 < primos.length; cont3++) {
            if (esPrimo(primos[cont3])) {
                System.out.println(primos[cont3] + " es primo.");
                hayPrimos = true;
            } else {
                System.out.println(primos[cont3] + " no es primo.");
            }
        }

        if (!hayPrimos) {
            System.out.println("No se encontró ningún número primo.");
        }
    }
}
