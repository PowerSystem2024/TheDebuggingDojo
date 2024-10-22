/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg12;

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
        // Ejercicio: Construir un programa que, dado un número total de
        // horas, devuelve el número de semanas, días y horas equivalentes.
        
        Scanner read = new Scanner(System.in);
        int numero;
        int semanas = 0, dias = 0, horas = 0;
       
        System.out.println("Ingrese la cantidad de horas: ");
        numero = read.nextInt();

        // Cálculo de semanas usando un ciclo do-while
        do {
            if (numero >= 168) {
                semanas++;
                numero -= 168;
            }
        } while (numero >= 168);

        // Cálculo de días usando otro ciclo do-while
        do {
            if (numero >= 24) {
                dias++;
                numero -= 24;
            }
        } while (numero >= 24);

        // Lo que queda en 'numero' serán las horas restantes
        horas = numero;
        
        // Imprimir el resultado
        System.out.println("El número de semanas es: " + semanas);
        System.out.println("El número de días es: " + dias);
        System.out.println("El número de horas es: " + horas);
    }
    
}
