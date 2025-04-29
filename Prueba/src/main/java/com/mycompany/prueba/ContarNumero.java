package com.mycompany.prueba;
// Leer 10 números y contar cuántos son pares y cuántos impares.
public class ContarNumero {
    // Definimos la funcion para verificar que un numero es par
   public static boolean  esPar(int numPar){
       return numPar % 2 == 0;
  
   }
   
  
  public static void main(String[]args){
      int[]numeros={10, 12, 14, 3, 18, 5,7,9, 13, 26};
      // Contadores de pares a impares
      int contPar=0;
      int contImPar=0;
      
      
      // for para recorrer el bucle
      for (int step=0; step<numeros.length; step++){      
      // If para verificar que numero son pares o impares
      if (esPar(numeros[step])){ 
          System.out.println(numeros[step]+ " Es par");
          contPar++;
           }
      else {
          System.out.println(numeros[step]+ " Es impar" );
          contImPar++;
      }
         }
      
      //Mostrar el total de numero pares e impares
      System.out.println("Total de números : ");
      System.out.println("Total de números Impares "+ contImPar);
      System.out.println("Total de números Pares "+ contPar);

  }
    
}
