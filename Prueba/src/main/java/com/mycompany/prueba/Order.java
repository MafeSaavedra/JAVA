package com.mycompany.prueba;

import java.util.Scanner;
// Usar metodos de array
import java.util.Arrays;

public class Order {
    public static void main(String[] args){
        //Definimos el Scanner
        Scanner input = new Scanner(System.in);
        Scanner inputnombre = new Scanner(System.in);
        System.out.println("¿Cuantos nombres vas a escribir?");
        int cantidad = input.nextInt();
        
        //Definimos el array con el tamaño dado por el usuario
        String[] nombres = new String[cantidad];
        // Pedimos y guardamos los datos uno por uno
        int i = 0;
        while (i<cantidad){
        System.out.println("Escribe el nombre ");
        nombres[i]= inputnombre.nextLine();
        i++;
        }
        // Ordenamos el array
        Arrays.sort(nombres);
        
        //Mostramos el array organizado
        // Usamos un formato for each para recorrer el array asignando la info en un variable temporal
        System.out.println("Nombres ordenados");
        for (String nombre : nombres){
        System.out.println(nombre);
        }
        input.close();
            
    }
   
   
   
    
}
