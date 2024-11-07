/*
Ejercicio 4:
Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden:
El primero, el segundo, el penúltimo, el tercero, etc.

*/
package arreglos_ejercico_4;

import java.util.Scanner;

public class Arreglos_Ejercico_4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.print("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((numeros[i] + " ")); // Primero, segundo...
            System.out.print((numeros[9 - i] + " ")); // Último, penúltimo...
        }
        
        System.out.println(); // Salto de línea.
    }
}