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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double compra,descuento,precio_final;
        
        System.out.println("Ingrese la cantidad a pagar");
        
        compra = read.nextDouble();
        
        if ( compra > 100){
        
        descuento = 0;
        }else{
        descuento = compra * 0.2;
        }
        
        precio_final = compra - descuento;
        
        System.out.println("El precio a pagar es de : "+ precio_final);
        
        
    }
    
}
