/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int dia,mes,anio;
        
        System.out.println("Ingrese un dia ");
        dia = read.nextInt();
        
        System.out.println(" ingrese un mes del 1 al 12");
        mes = read.nextInt();
        
        System.out.println(" ingrese un año,no mayor al 2024");
        anio = read.nextInt();
        
        if ( ( dia > 0 & dia <=30) & ( mes > 0 & mes <= 12) & ( anio <= 2024)  ){
            
            System.out.println(" los datos ingresados son en dia mes y año son "+ dia + " "+mes+" " + anio);
    }  
        else {
            System.out.println(" revise los datos ingresados puede que no esten correctos ");
        }
    }
    
}
