/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author nahue
 */
public class TestMatrices {
    public static void main(String[] args) {
        
        int edades[][] = new int[3][2];
        
        System.out.println("edades = " + edades);
        
        edades[0][0]= 1; // llenado manueal
        edades[0][1]=2; //diferente columna 
        edades[1][0]=3;
        edades[1][1]=4;
        edades[2][0]=5;// tarea 
        edades[2][1]=6;
        
        
        System.out.println("edades 0-0 = " + edades[0][0]);
         System.out.println("edades 0-1 = " + edades[0][1]);
          System.out.println("edades 1-0 = " + edades[1][0]);
           System.out.println("edades 1-1 = " + edades[1][1]);
            System.out.println("edades 2-0 = " + edades[2][0]);
             System.out.println("edades 2-1 = " + edades[2][1]);
        
    
        System.out.println(" ");
        System.out.println(" ");
        for (int fila = 0; fila < edades.length; fila++) {
            
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades "+fila+" - "+ col+" "+ " : "+edades[fila][col]);
            }
            
        }
        
       //Sintaxis Clasica
       //String frutas[][] = new String[3][2];
       
        System.out.println(" ");
        System.out.println(" ");
       //Sintaxis Simplificada
       String frutas[][]= {{"limon","pomelo"},{"Ciruela","kiwi"},{"Bnana","Manzana"}};
        Imprimir(frutas);
      // for (int fila = 0; fila < frutas.length; fila++) {
        //    System.out.println("");
          //  for (int col = 0; col < frutas[fila].length; col++) {
            //    System.out.println(frutas[fila][col]);
           // }
            //}
       
        //Creamos una Matriz de objetos
        //Asignamos valores a la matriz
        Persona personas[][] = new Persona[2][3];
       personas[0][0] = new Persona("nahuel");
       personas[0][1] = new Persona("osvaldo");
       personas[0][2] = new Persona("manchas");
       personas[1][0] = new Persona("beltru");
       personas[1][1] = new Persona("mica");
       personas[1][2] = new Persona("neron");
       
       
       Imprimir(personas);
  
       
       
    }
    
    public static void Imprimir(Object matriz[][]){
    
        
            for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println("");
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println(matriz[fila][col]);
            }
            
        }
    }
    
}
