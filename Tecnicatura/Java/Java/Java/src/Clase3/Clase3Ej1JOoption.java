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
public class Clase3Ej1JOoption {
    public static void main(String[] args) {

    int num;
    
    do{
     num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            System.out.println("eL NUMERO ES = " + num);
            if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "el numero es par");
            }
            else{ JOptionPane.showMessageDialog(null, "el numero es impar");}
     }
    while(num != 0);
  JOptionPane.showMessageDialog(null, "me sali del programa");
        
   }}
