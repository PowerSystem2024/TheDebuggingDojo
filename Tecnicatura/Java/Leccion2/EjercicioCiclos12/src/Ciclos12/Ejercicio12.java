/*
    Ejercicio 12:
    Pedir un número y calcular su factorial
    Clase JOptionPane
*/
package Ciclos12;
import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        long factorial = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número positivo: "));
        
        
        while(num < 0){
            JOptionPane.showMessageDialog(null,"El número " + num + " NO es positivo");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número positivo: "));
        }
        if (num == 0){
            JOptionPane.showMessageDialog(null,"El factorial del número " + num + " es: 0");
        }
        else{
           for (int i = 1; i <= num; i++) {
            factorial *= i;
            } 
           JOptionPane.showMessageDialog(null,"El factorial del número " + num + " es: " + factorial);
        }
    }
}
