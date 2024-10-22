/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        
       double nota1,nota2,nota3, promedio;
       
        System.out.println(" Ingrese las 3 calificaciones ");
        nota1 = read.nextDouble();
        nota2 = read.nextDouble();
        nota3 = read.nextDouble();
        
        promedio = ( nota1+nota2+nota3)/3;
        
        if( promedio <= 70){
        
            System.out.println(" El alumno desaparobo con : "+promedio);
        }else{
            System.out.println(" el alumno esta aprobado con un promedio de "+ promedio );
        }
        
      
       
       
    }
    
}
