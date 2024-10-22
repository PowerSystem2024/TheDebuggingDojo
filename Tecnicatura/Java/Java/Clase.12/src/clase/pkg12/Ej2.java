/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg12;

import java.util.Scanner;

/*

Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow


 */
public class Ej2 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double a,b,resultado;
        
        System.out.println("Ingrese los balores de a y b");
        a = read.nextDouble();
        b = read.nextDouble();
    
   resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2*a*b;
   
   
        System.out.println("el resultado es "+resultado);
        
        
        
    }
    
}
