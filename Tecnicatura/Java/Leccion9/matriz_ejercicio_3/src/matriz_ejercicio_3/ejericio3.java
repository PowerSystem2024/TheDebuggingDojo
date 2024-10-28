/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz_ejercicio_3;

import java.util.Scanner;


public class ejericio3 {
   
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
      
    int matriz[][] = new int[3][3];
    
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println(" ingrese un numero para llenar la matriz");
               matriz[fila][col] =  read.nextInt();
                }
            System.out.println("");
        }
        
        System.out.println(" ");
          System.out.println("la matriz completa es ");
          System.out.println(" ");
        
          for (int fila = 0; fila < matriz.length
                  ; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col]);
                }
              System.out.println("");
        }
          
          
          System.out.println(" ");
          System.out.println("la matriz transpuesta  es ");
          System.out.println(" ");
        
          for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[col][fila]+ " ");
                }
              System.out.println("");
        }
          System.out.println("");
        
    }
    
 
    
   
    
    
}
