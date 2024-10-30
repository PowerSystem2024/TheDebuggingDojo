/*
    Ejercicio 12:
    Pedir un número y calcular su factorial
    Clase Scanner
*/

package Ciclos12;
import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long factorial = 1;
        
        System.out.println("Digite un número positivo: ");
        int num = Integer.parseInt(scanner.nextLine());
        
        
        while(num < 0){
            System.out.println("El número " + num + " NO es positivo");
            System.out.println("Digite un número positivo: ");
            num = Integer.parseInt(scanner.nextLine());
        }
        if (num == 0){
            System.out.println("El factorial del número " + num + " es: 0");
        }
        else{
           for (int i = 1; i <= num; i++) {
            factorial *= i;
            } 
           System.out.println("El factorial del número " + num + " es: " + factorial);
        }
    }
}
