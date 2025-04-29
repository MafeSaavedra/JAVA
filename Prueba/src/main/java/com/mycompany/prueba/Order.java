package com.mycompany.prueba;

import java.util.Scanner;
import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuántos nombres vas a escribir?");
        int cantidad = input.nextInt();
        input.nextLine(); // Limpiamos la entrada

        String[] nombres = new String[cantidad];

        // Pedimos los nombres uno por uno
        int i = 0;
        while (i < cantidad) {
            System.out.println("Escribe un nombre:");
            nombres[i] = input.nextLine();
            i++;
        }

        // Ordenamos los nombres
        Arrays.sort(nombres);

        // Mostramos los nombres ya ordenados
        System.out.println("Nombres ordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        input.close();
    }
}
