/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer8;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EJER8 {

    
    public static void main(String[] args) {
    
        Scanner read = new Scanner(System.in);
        
        int num;
        
        System.out.println(" ingrese un numero para recorrerlo");
        num = read.nextInt();
        
        
        System.out.println(" inicio de ciclo ");
        System.out.println("");
        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("fin de cilco");
        
    }
    
}
