/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double num1,num2,resultado;
        
        System.out.println(" Digite 2 numeros ");
        num1 = read.nextDouble();
        num2 = read.nextDouble();
        
        if(num1==num2){resultado = num1*num2;}
        else if(num1<num2){ resultado = num1 + num2;}
        else { resultado = num1 - num2;}
        
        System.out.println(" EL resultado es : "+resultado);
        
        
                
        
        
    }
}
