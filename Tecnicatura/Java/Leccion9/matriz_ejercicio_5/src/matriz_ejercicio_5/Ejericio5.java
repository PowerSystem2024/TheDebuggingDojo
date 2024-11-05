/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Ejericio5 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
       int totalFila = 0;
        int totalCol=0;
        
    int matriz[][] = new int[2][2];
    
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println(" ingrese un numero para llenar la matriz");
               matriz[fila][col] =  read.nextInt();
                }
            System.out.println("");
        }
        
        
          for (int fila = 0; fila < matriz.length; fila++) {
              totalFila=0;
              
            for (int col = 0; col < matriz[fila].length; col++) {
              totalFila = totalFila + matriz[fila][col];
                }
            System.out.println("");
              System.out.println("el total de la suma de la fila "+fila+" es : "+totalFila);
        }
        
        
    }
}
