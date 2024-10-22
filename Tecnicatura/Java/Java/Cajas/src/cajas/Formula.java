/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajas;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Formula {
    
    int alto;
    int ancho;
    int profundidad;
    int volumen;
    
    public void FormulaSinParametro(){
    
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el alto");
        alto = read.nextInt();
        
         System.out.println("Ingrese el ancho");
        ancho = read.nextInt();
        
        
         System.out.println("Ingrese la profundidad");
        profundidad = read.nextInt();
        
        
       volumen = alto*ancho*profundidad;
    
        System.out.println("volumen sin parametros = " + volumen);
        
        
        
    }
    
    public void FormularioConParametro(int alto, int ancho, int profundidad){
    
    volumen = alto*ancho*profundidad;
    
        System.out.println("volumen con parametros = " + volumen);
    }
    
}
