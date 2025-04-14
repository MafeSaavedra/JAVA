package com.mycompany.prueba;

import java.io.PrintStream;
import java.util.Scanner;

public class SaludosPersonalizados {
     
    public static void main(String[] args) throws Exception {
        // Fuerza la salida a UTF-8
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        // Escáner con codificación UTF-8
        Scanner entrada = new Scanner(System.in, "UTF-8");

        System.out.print("Introduce tu nombre por favor: ");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre + " ¡Bienvenido!");

        System.out.print("Por favor introduce tu edad: ");
        int edad = entrada.nextInt();

        System.out.println(nombre + " tiene " + edad + " años");
         
        //Evaluar la edad 
        if (edad>=18){
            System.out.println(nombre+"Eres mayor de edad");
        }else{
            int diferencia=18-edad;
            System.out.println(nombre + " Te faltan "+ diferencia +" años para ser mayor de edad");
    }
    }
}
