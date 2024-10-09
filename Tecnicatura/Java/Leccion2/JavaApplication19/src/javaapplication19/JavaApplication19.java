/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num;
        int total;
        System.out.println("Ingrese un numero para el ejercicio del factorial");
        num = read.nextInt();
        total=1;
        
        for (int i = 2; i <= num; i++) {
            total = total*i;
        }
        
        System.out.println(" el numero ingresado fue "+num);
        System.out.println(" Su factorail es "+total);
        
        
    }
    
}
