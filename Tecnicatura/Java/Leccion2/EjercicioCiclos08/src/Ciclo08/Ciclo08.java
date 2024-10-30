/*
    Ejercicio 8:
    Pedir un número N y mostrar todos los numeros enteros del 1 a N.
    Clase Scanner
 */
package Ciclo08;
import java.util.Scanner;

public class Ciclo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        int i = 1;
        
        if(num > 0){
            while(i <= num){
                System.out.println(i);
                i++;
            }
        }
        else{
            while(i >= num){
                System.out.println(i);
                i--;
            }
        }
    }
}
