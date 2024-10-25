
package arreglo_ejericio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero[] = new int[5];
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println(" ingrese el numero en la posicion "+i);
            numero[i] = read.nextInt();
        }
        
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println(" el numero en la posicion "+i+" es : "+ numero[i]);
            
        }
        
    }
    
}
