
package com.mycompany.prueba;

/**
 *
 * @author USUARIO
 */
public class Prueba {

    public static void main(String[] args) {
        // Vamos a verificar los números del 1 al 50
        for (int numero = 1; numero <= 50; numero++) {
            if (esPrimo(numero)) {
                System.out.println(numero + " es primo");
            }
        }
    }

    // Esta función verifica si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false; // 0 y 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Si tiene algún divisor, no es primo
            }
        }

        return true; // Si no se dividió entre ningún número, es primo
    }
}

