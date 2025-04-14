//Objetivo: 
//Pedir 5 notas al usuario, guardarlas en un array, calcular el promedio 
//y mostrarlo.
package com.mycompany.prueba;
import java.util.Scanner;

//

public class PromedioNotas {
        public static void main(String[]args){
        // Crear el objeto de tipo Scanner
        Scanner input = new Scanner (System.in);
        // Declaramos el array con entradas tipo double o decimal
        double[] notas = new double[5];
        // Declaramos la variable que contendra la suma de la notas
        double suma = 0;
        
        double promedio= 0;
        
       // Pedimos los datos al usuario
       System.out.println("----------------------------");
       System.out.println("Porfavor introduce 5 notas ");
       System.out.println("----------------------------");

       // Hacemos un for porque es necesaario para aumentar contadores y guardar
       for(int i=0; i<notas.length; i++){
           System.out.println("Nota #" + (i+1)+ " : ");
           notas[i]= input.nextDouble();
           //Sumar los valores de array
           suma += notas[i];
           }
       promedio= suma/notas.length;
       
       System.out.println("El promedio de tus notas es : "+ String.format("%3f",promedio));
       // cerramos el scanner
       input.close();
       
       // Mostrar un mensaje de felicitacion si esta por encima de 4.0 
       // Mostrar un mensaje de puede mejorar, si esta [3.0 & 3.94]
       // Mostrar un mensaje de puede lo siento reprobaste, si esta [1.0 & 2.98]
       
       if (promedio >=4.0){
           System.out.println(" Felicitaciones te fue muy bien ⁂ !! ");
       }
           else if (promedio>=3.0 && promedio <=3.94){
                   System.out.println(" Aprobaste pero puedes mejorar ");
           }else{
                  System.out.println("No aprobaste esta vez. ¡Sigue esforzándote! ");
                   }
               
                
           
       

}
    
}
