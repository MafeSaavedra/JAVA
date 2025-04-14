// Objetivo: 
// Pedir 7 temperaturas al usuario (una por cada día de la semana), guardarlas en un array, 
// calcular el promedio y mostrar un mensaje según el rango del promedio con 3 decimales.

package com.mycompany.prueba;
import java.util.Scanner;

public class MediaTemperatures {
    public static void main(String[]args){
        //Definimos el objeto scanner
        Scanner input = new Scanner(System.in);
        double promedioTemp = 0;
        double sumaTemp=0;
        double[] temp= new double[7];
        // Pedimos Temperaturas
        System.out.println(" -------------------------- ");
        System.out.println(" Porfavor introduce 7 temperaturas de la semana en °C");
        System.out.println(" -------------------------- ");  
        
        // For para recibir las notas y guardarlas
        for( int cont= 0; cont<=6; cont++){
            System.out.println("Tempt #  "+ (cont +1)+ ": " );
            temp[cont]= input.nextDouble();
            sumaTemp += temp[cont];
        }
        promedioTemp= sumaTemp/ temp.length;
        // Mostrar promedio
        System.out.println("El promedio de temperatura de tu semana fue de : "+ String.format("%.3f",promedioTemp));
        
       //// calcular el promedio y mostrar un mensaje según el rango del promedio con 3 decimales.
        if(promedioTemp>= 32){
           System.out.println("Tuviste una semana muy calurosa ⊛");
           }
        else if (promedioTemp>=15 && promedioTemp<=33){
               System.out.println("Tuviste una semana fresca !! ");
        } 
    }
    
}
