
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    
    
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero[] = new int[5];
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println(" ingrese el numero en la posicion "+i);
            numero[i] = read.nextInt();
        }
        
        
        for (int i = numero.length -1 ; i >= 0 ; i--) {
            System.out.println(" el numero en la posicion "+i+" es : "+ numero[i]);
            
        }
        
    }
    
    
  
    
    
    
    
}