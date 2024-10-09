/*
    Ejercicio 6:
    Pedir números hasta que se teclee un cero
    Mostrar la suma de todos los números introducidos.
    Clase Scanner
 */
package Ciclos06;
import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mi manera
        /*
        System.out.println("Digite un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        int suma = 0;
        while(num1 != 0){
            suma += num1;
            System.out.println("Digite otro número: ");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("");
        }
        System.out.println("El sistema finaliza por ingresar cero");
        System.out.println("La suma de los números ingresados es: " + suma);
        */
        
        
        
        // FORMA DEL PROFE
        int numero, sumar = 0;
        do {
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(scanner.nextLine());
        sumar += numero;
        }while(numero != 0);
        System.out.println("\nLa suma de todos los números ingresados es: " + sumar);
    }
}
