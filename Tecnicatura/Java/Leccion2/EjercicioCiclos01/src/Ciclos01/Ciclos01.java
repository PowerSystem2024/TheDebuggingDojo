
/*
    Ejercicio 1:
    Leer un número y mostrar su cuadrado, repetir el
    proceso hasta que  se introdusca un valor negativo
*/
/*
    Cada forma esta encerrado en comentarios
*/

package Ciclos01;
import java.util.Scanner;
public class Ciclos01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        // digita un número y calcula todos los cuadrados de ese num hasta el cero
        
        System.out.println("Digite un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        
        while (num1 >= 0){
            int cuadrado1 = num1 * num1;
            System.out.println("El cuadrado del número " + num1 + " es " + cuadrado1);
            conteo--;
        }
        */
        
        // digita un numero y muestra su cuadrado
        /*
        int num2 = 0;
        do{
            System.out.println("Digite un número para calcular su cuadrado: ");
            num2 = Integer.parseInt(scanner.nextLine());
            if (num2 >= 0){
            int cuadrado2 = num2 * num2;
            System.out.println("El cuadrado del número " + num2 + " es " + cuadrado2);
            }
            System.out.println("Ingrese un número negativo para finalizar el ciclo");
            System.out.println("");
        }while(num2 >= 0);
        */
        // permite calcular con números con coma
        
        double num3 = 0;
        do{
            System.out.println("Digite un número para calcular su cuadrado: ");
            num3 = Double.parseDouble(scanner.nextLine());
            if (num3 >= 0){
            double cuadrado3 = num3 * num3;
            System.out.println("El cuadrado del número " + num3 + " es " + cuadrado3);
            System.out.println("Ingrese un número negativo para finalizar el ciclo");
            }
            System.out.println("");
        }while(num3 >= 0);
        
        
        /* Por el profe */
        /*
        int num4,cuadrado4;
        System.out.println("Digite un número: ");
        num4 = Integer.parseInt(scanner.nextLine());
        while(num4 >= 0) {
            cuadrado4 = (int)Math.pow(num4, 2);
            System.out.println("El número " + num4 + " elevado al cuadrado es " + cuadrado4);
            System.out.println("Digite otro número: ");
            num4 = Integer.parseInt(scanner.nextLine());
        }
        */
        System.out.println("El sistema ha finalisado por número negativo");
    }
}
