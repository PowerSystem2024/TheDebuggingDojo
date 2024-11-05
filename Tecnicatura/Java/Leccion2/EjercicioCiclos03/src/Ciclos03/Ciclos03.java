/*
    Ejercicio 3:
    Leer números hasta que se introduzca un cero.
    Para cada uno indicar si es par o impar
    Clase SCANNER
 */
package Ciclos03;
import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        while(num1 != 0){
            if (num1 % 2 == 0){
                System.out.println("El número " + num1 + " es PAR");
            }
            else{
                System.out.println("El número " + num1 + " es IMPAR");
            }
            System.out.println("Digite otro número: ");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("");
        }
        System.out.println("El sistema finaliza por ingresar cero");
    }
}