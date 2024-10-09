/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos;

import javax.swing.JOptionPane;



public class ej7MediaJOptionPane {
    
     public static void main(String[] args) {

   int numero, media, total;
   boolean salir;
  salir = true;
  total=0;
  media=0;
   
    do{
  
     numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
     if( numero >= 0){
    media = media + numero;
    total++;
    }
     else{
     salir = false;}
}
    while(salir);
    JOptionPane.showInputDialog("Totales de intentos "+ total);
        JOptionPane.showInputDialog("La media es "+ media / total);
    
    
    }
    
}
