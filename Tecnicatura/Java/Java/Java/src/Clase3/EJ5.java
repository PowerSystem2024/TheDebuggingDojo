/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase3;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EJ5 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num, num2, cont;
        
        System.out.println(" ingrese el numero para que lo puedab buscar");
        num = Integer.parseInt(read.nextLine());
        cont = 0;
        do{
         
             System.out.println("");
            System.out.println(" ingrese el numero para adivinar");
            num2 = Integer.parseInt(read.nextLine());

            
            if(num2 < num){
                System.out.println("el numero ingresado "+num2+" es menor al numero que busca ");
            }
            if ((num2 > num)){
                                System.out.println("el numero ingresado "+num2+" es mayor al numero que busca");
            }
            if (num2 != num){
            cont = cont+1;
                    }
            
           if( num2 == num){
               System.out.println(" te llevo "+cont+" intentos");
           }
        }
         while(num2 != num);
        
        System.out.println(" excelente encontraste el numero "+ num);
      
    }
}
