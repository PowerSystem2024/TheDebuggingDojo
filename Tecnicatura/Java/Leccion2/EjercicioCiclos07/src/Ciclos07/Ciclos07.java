/*
    Ejercicio 7:
    Pedir números hasta que se introduzca uno negativo y calcular la media
    Clase Scanner
 */
package Ciclos07;
import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conteo = 0;
        int suma = 0;
        System.out.println("Digite un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        while(num1 >= 0){
            suma += num1;
            conteo ++;
            System.out.println("Digite otro número: ");
            num1 = Integer.parseInt(scanner.nextLine());
        }
        if(conteo == 0){
            System.out.println("El sistema finaliza por ingresar "+ num1 +", porque es un número NEGATIVO");
        }
        else{
            float resultado = (float)suma / conteo;
        System.out.println("El sistema finaliza por ingresar "+ num1 +", porque es un número NEGATIVO");
        System.out.println("La media aritmetrica de los números ingresados es: " + resultado);
        }
    }
}
