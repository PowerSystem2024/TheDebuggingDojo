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
public class Clase3Eje {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
      int num;
       
           
         do{
    
        System.out.println(" digite un numero");
         num =  Integer.parseInt(read.nextLine());
           System.out.println(" el numero ingresado es "+ num);
         }
         while( num != 0);
         
         if(num == 0){
             System.out.println("Me sali");
         }
        
         
         
         
       
}}
