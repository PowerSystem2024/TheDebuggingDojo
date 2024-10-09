/*
    Ejercicio 8:
    Pedir un número N y mostrar todos los numeros enteros del 1 a N.
    Clase JOptionPane
 */
package Ciclo08;
import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        
        int num = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
        int i = 1;
        
        if(num > 0){
            while(i <= num){
                JOptionPane.showMessageDialog(null, i);
                i++;
            }
        }
        else{
            while(i >= num){
                JOptionPane.showMessageDialog(null, i);
                i--;
            }
        }
    }
}
