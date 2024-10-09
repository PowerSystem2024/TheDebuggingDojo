/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

import javax.swing.JOptionPane;

/**
 *
 * @author nahue
 */
public class EJER8JO {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para recorrer"));
        
        for (int i = 1; i <= num; i++) {
            
            JOptionPane.showInputDialog("vuelta "+i);
            
        }
                
               
        
    }
    
}
