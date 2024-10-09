/*
    Ejercicio 6:
    Pedir números hasta que se teclee un cero
    Mostrar la suma de todos los números introducidos.
    Clase JOptionPane
 */
package Ciclos06;
import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        int suma = 0;
        int num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
        while(num1 != 0) {
            suma += num1;
            num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El sistema ha finalisado por ingresar cero");
        JOptionPane.showMessageDialog(null, "El total de los números ingresados es: " + suma);
        */
        
        // Profe
        int numero, sumar = 0;
        do{
            numero = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
            sumar += numero;
        }while(numero != 0);
        JOptionPane.showMessageDialog(null, "El total de los números ingresados es: " + sumar);
        
    }
}
