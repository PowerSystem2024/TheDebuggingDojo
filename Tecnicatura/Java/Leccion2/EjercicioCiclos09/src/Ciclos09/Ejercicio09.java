/*
    Ejercicio 9:
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
    Suponiendo que todos los meses son de 30 días.
    Clase Scanner
 */
package Ciclos09;
import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        
        int day = Integer.parseInt (JOptionPane.showInputDialog("Digite el día: "));
        int month = Integer.parseInt (JOptionPane.showInputDialog("Digite el mes: "));
        int year = Integer.parseInt (JOptionPane.showInputDialog("Digite el año: "));
        
        JOptionPane.showMessageDialog(null, "La fecha es = " + day + "/" + month + "/" + year);
        
        if(day > 0 && day < 31){
            if(month > 0 && month < 13){
                if(year > 0 && year < 2025){
                    JOptionPane.showMessageDialog(null,"La fecha es una fecha CORRECTA");
                }
                else{
                    JOptionPane.showMessageDialog(null,"El año " + year + " es INCORRECTO");
                    JOptionPane.showMessageDialog(null,"LA FECHA ES INCORRECTA");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"El mes " + month + " es INCORRECTO");
                if(year < 0 || year > 2024){
                    JOptionPane.showMessageDialog(null,"El año " + year + " es INCORRECTO");
                }
                JOptionPane.showMessageDialog(null,"LA FECHA ES INCORRECTA");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"El día " + day + " es una fecha INCORRECTO");
            if(month > 0 || month < 12){
                JOptionPane.showMessageDialog(null,"El mes " + month + " es INCORRECTO");
            }
            if(year < 0 || year > 2024){
                    JOptionPane.showMessageDialog(null,"El año " + year + " es INCORRECTO");
            }
            JOptionPane.showMessageDialog(null,"LA FECHA ES INCORRECTA");
        }
    }
}
