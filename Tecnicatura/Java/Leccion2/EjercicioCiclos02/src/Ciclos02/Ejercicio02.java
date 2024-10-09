/*
    Ejercicio 2:
    Leer un número e indicar si es positivo o negativo.
    El proceso se repetira hasta que se introduzca un cero.
*/
package Ciclos02;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        while(num1 != 0){
            if (num1 > 0){
                System.out.println("El número " + num1 + " es POSITIVO");
            }
            else{
                System.out.println("El número " + num1 + " es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("");
        }
        System.out.println("El sistema finaliza por ingresar cero");
    }
}
