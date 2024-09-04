/*
    Ejercicio 4:
    Pedir números hasta que se teclee uno negativo y
    Mostrar cuántos números se han introducido.
    Clase JOptionPane
 */
package Ciclos04;
import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        int conteo = 0;
        int num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
        
        while(num1 >= 0){
            JOptionPane.showMessageDialog(null, "El número " + num1 + " es POSITIVO");
            conteo ++;
            num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null,"El sistema finaliza por ingresar "+ num1 +", porque es un número NEGATIVO");
        JOptionPane.showMessageDialog(null,"Se han ingresado " + conteo + " números Positivos");
    }
}
