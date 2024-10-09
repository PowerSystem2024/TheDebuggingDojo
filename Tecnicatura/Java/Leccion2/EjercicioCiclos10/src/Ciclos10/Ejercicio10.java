/*
    Ejercicio 10:
    Pedir 10 números y escribir la suma total
    Clase JOptionPane
*/
package Ciclos10;
import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int total = 0;
        int num1; 
        
        for (int i = 1; i < 11; i++) {
            num1 = Integer.parseInt (JOptionPane.showInputDialog( i +". Digite un número: "));
            total += num1;
        }
        
        JOptionPane.showMessageDialog(null,"El total de la suma de los 10 números es: " + total);
    }
}
