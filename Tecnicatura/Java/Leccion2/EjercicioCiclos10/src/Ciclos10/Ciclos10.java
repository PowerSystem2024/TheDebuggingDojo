/*
    Ejercicio 10:
    Pedir 10 números y escribir la suma total
    Clase Scanner
*/
package Ciclos10;
import java.util.Scanner;

public class Ciclos10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int num1 = 0; 
        
        for (int i = 1; i < 11; i++) {
            System.out.println(i + ". Digite un número: ");
            num1 = Integer.parseInt(scanner.nextLine());
            total += num1;
        }
        
        System.out.println("El total de la suma de los 10 números es: " + total);
    }
}
