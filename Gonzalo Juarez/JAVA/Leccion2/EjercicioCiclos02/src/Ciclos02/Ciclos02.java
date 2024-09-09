/*
    Ejercicio 2:
    Leer un número e indicar si es positivo o negativo.
    El proceso se repetira hasta que se introduzca un cero.
*/

package Ciclos02;
import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero != 0) {
            if (numero > 0){
                //System.out.println("El número " + numero + " es POSITIVO");
                JOptionPane.showMessageDialog(null, "El número " + numero + " es POSITIVO");
            }
            else{
                //System.out.println("El número " + numero + " es NEGATIVO");
                JOptionPane.showMessageDialog(null, "El número " + numero + " es POSITIVO");
            }
            numero = Integer.parseInt (JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        //System.out.println("El sistema ha finalisado por ingresar cero");
        JOptionPane.showMessageDialog(null, "El sistema ha finalisado por ingresar cero");
    }
}
