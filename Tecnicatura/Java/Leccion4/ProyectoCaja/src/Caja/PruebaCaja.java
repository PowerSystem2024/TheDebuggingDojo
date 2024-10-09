/*
    Proyecto Caja:
    Ejercicio 1:
    Crear un proyecto según las especificaciónes mostradas a continuación.
    La formula es: volumen = ancho * alto * profundidad.
*/
package Caja;
import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES LOCALES
        System.out.println("Digite el ancho: "); 
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite el alto: "); 
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite la profundidad: "); 
        double c = Double.parseDouble(scanner.nextLine());
        
        
        System.out.println("CÁLCULO DE VOLUMEN CON CONSTRUCTOR VACIO"); 
        
        // Nuevo objeto con contructor vacio
        Caja caja1 = new Caja();
        
        caja1.ancho = a;
        caja1.alto = b;
        caja1.prof = c;
        double volumen = caja1.calcularVolumen(); // llamar al método
        // imprimir el resultado
        System.out.println("El volumes caja 1 es: " + caja1.ancho + " * " + caja1.alto + " * " + caja1.prof );
        System.out.println("El volúmen caja 1 es  " + volumen);
        
        
        // -----------------------------------------------------------\\
        
        System.out.println("CÁLCULO DE VOLUMEN CON CONSTRUCTOR CON ARGUMENTOS"); 
        
        // nuevo objeto con contructor con argumentos
        Caja caja2 = new Caja(a, b, c); 
        
        // si desea diferenciar los valores de ambos constructores
        // solo descomente lo siguiente:
        /*
        System.out.println("Digite el ancho: "); 
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite el alto: "); 
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite la profundidad: "); 
        double c = Double.parseDouble(scanner.nextLine());
        */

        volumen = caja2.calcularVolumen(); // llamar al método
        // imprimir resultados
        System.out.println("El volumes caja 2 es: " + a + " * " + b + " * " + c );
        System.out.println("El volúmen caja 2 es  " + volumen);
        
        
    }
}
