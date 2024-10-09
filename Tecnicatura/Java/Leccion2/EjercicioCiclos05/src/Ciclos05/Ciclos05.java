/*
    Ejercicio 5:
    Realizar un juego para adivinar un número, para ello generar un númerp aleatorio
    entre 0-100 y luego ir pidiendo números indicando "es mayor" o "es menor" según
    sea mayor o menor con respecto a N
    El proceso termina cuando el usuario acierta y muestra el número de intentos hechos.
    Clase SCANNER
*/
package Ciclos05;
import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conteo = 0;
        int random = (int)(Math.random()*100);
        System.out.println("Digite un número entre 0 y 100: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        
        while(num1 != random ){
            if(num1 > random){
                System.out.println("El número " + num1 + " es MAYOR");
            }
            else{
                System.out.println("El número " + num1 + " es MENOR");
            }
            conteo ++;
            System.out.println("Digite otro número: ");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("");
        }
        System.out.println("¡Felicidades! El número "+ num1 +" es el correcto");
        System.out.println("Se han intentado " + conteo + " veces");
    }
}
