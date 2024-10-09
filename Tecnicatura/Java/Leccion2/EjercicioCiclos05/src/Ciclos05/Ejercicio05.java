/*
    Ejercicio 5:
    Realizar un juego para adivinar un número, para ello generar un númerp aleatorio
    entre 0-100 y luego ir pidiendo números indicando "es mayor" o "es menor" según
    sea mayor o menor con respecto a N
    El proceso termina cuando el usuario acierta y muestra el número de intentos hechos.
    Clase SCANNER
*/
package Ciclos05;
import javax.swing.JOptionPane;
/**
 *
 * @author PORTATIL
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        
        int conteo = 0;
        int random = (int)(Math.random()*100);
        int num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite un número entre 0 y 100: "));
        
        while(num1 != random ){
            if(num1 > random){
                JOptionPane.showMessageDialog(null, "El número " + num1 + " es MAYOR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número " + num1 + " es MENOR");
            }
            conteo ++;
            num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "        ¡¡¡Felicidades!!!");
        JOptionPane.showMessageDialog(null, "El número "+ num1 +" es el correcto");
        JOptionPane.showMessageDialog(null, "Se han intentado " + conteo + " veces");
    }
}
