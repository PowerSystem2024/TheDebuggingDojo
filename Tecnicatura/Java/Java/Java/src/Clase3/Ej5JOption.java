/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author nahue
 */
public class Ej5JOption {
    public static void main(String[] args) {
        
         int num, num2, cont;
        
       
       num = Integer.parseInt(JOptionPane.showInputDialog("digite en umero a encontrar"));
        cont = 0;
        do{
         
        
            num2 = Integer.parseInt(JOptionPane.showInputDialog("digite el numero que cree que sea "));

            
            if(num2 < num){
               JOptionPane.showInputDialog("el numero ingresado "+num2+" es menor al numero que busca ");
            }
            if ((num2 > num)){
              JOptionPane.showInputDialog("el numero ingresado "+num2+" es mayor al numero que busca");
            }
            if (num2 != num){
            cont = cont+1;
                    }
            
           if( num2 == num){
                JOptionPane.showInputDialog(" excelente encontraste el numero "+ num);
              JOptionPane.showInputDialog(" te llevo "+cont+" intentos");
           }
        }
         while(num2 != num);
        
  
        
        
    }
    
}
