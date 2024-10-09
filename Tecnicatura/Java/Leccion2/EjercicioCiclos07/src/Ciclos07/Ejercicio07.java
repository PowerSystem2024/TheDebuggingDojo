/*
    Ejercicio 7:
    Pedir números hasta que se introduzca uno negativo y calcular la media
    Clase JOptionPane
 */
package Ciclos07;
import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {
        int conteo = 0;
        int suma = 0;
        int num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
        while(num1 >= 0){
            suma += num1;
            conteo ++;
            num1 = Integer.parseInt (JOptionPane.showInputDialog("Digite otro número: "));
        }
        if(conteo == 0){
            JOptionPane.showMessageDialog(null, "El sistema finaliza por ingresar "+ num1 +", porque es un número NEGATIVO");
        }
        else{
            float resultado = (float)suma / conteo;
        JOptionPane.showMessageDialog(null, "El sistema finaliza por ingresar "+ num1 +", porque es un número NEGATIVO");
        JOptionPane.showMessageDialog(null, "La media aritmetrica de los números ingresados es: " + resultado);
        }
    }
}
