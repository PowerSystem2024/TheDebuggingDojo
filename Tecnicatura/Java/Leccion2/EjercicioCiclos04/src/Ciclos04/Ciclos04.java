/*
    Ejercicio 4:
    Pedir números hasta que se teclee uno negativo y
    Mostrar cuántos números se han introducido.
    Clase SCANNER
 */
package Ciclos04;
import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conteo = 0;
        System.out.println("Digite un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        while(num1 >= 0){
            System.out.println("El número " + num1 + " es POSITIVO");
            conteo += 1;
            System.out.println("Digite otro número: ");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("");
        }
        System.out.println("El sistema finaliza por ingresar "+ num1 +", porque es un número NEGATIVO");
        System.out.println("Se han ingresado " + conteo + " números POSITIVOS");
    }
}
