/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz_ejercicio_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Random random = new Random();
    int matriz[][] = new int[7][7];
    
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
if(fila == col){
matriz[fila][col] = 1;
}
else {
   int num =  random.nextInt(10);
     matriz[fila][col]= num;       
   
}
                }
            System.out.println("");
        }
     
        
       System.out.println("");  
        System.out.println("matriz diagonal");
         System.out.println("");
        
          for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col]);
                }
            System.out.println("");
        }
        
    }
    
}
