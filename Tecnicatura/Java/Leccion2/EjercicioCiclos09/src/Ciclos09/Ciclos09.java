/*
    Ejercicio 9:
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
    Suponiendo que todos los meses son de 30 días.
    Clase Scanner
 */
package Ciclos09;
import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el número de día: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite el número de mes): ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite el año: ");
        int year = Integer.parseInt(scanner.nextLine());
        
        System.out.println("La fecha es = " + day + "/" + month + "/" + year);
        
        if(day > 0 && day < 31){
            if(month > 0 && month < 13){
                if(year > 0 && year < 2025){
                    System.out.println("La fecha es una fecha CORRECTA");
                }
                else{
                    System.out.println("El año " + year + " es INCORRECTO");
                    System.out.println("LA FECHA ES INCORRECTA");
                }
            }
            else{
                System.out.println("El mes " + month + " es INCORRECTO");
                if(year < 0 || year > 2024){
                    System.out.println("El año " + year + " es INCORRECTO");
                }
                System.out.println("LA FECHA ES INCORRECTA");
            }
        }
        else{
            System.out.println("El día " + day + " es una fecha INCORRECTO");
            if(month > 0 || month < 12){
                System.out.println("El mes " + month + " es INCORRECTO");
            }
            if(year < 0 || year > 2024){
                    System.out.println("El año " + year + " es INCORRECTO");
            }
            System.out.println("LA FECHA ES INCORRECTA");
        }
    }
}
