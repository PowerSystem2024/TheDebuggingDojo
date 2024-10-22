/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg12;

import java.util.Scanner;

/*Ejercicio 3: La calificacion final de un estudiante de informática

se calcula con base a las calificaciones de cuatro aspectos de su

rendimiento académico: participación, primer examen parcial, segundo

examen parcial y examen final. Sabiendo que las calificaciones anteriores

entran a la calificación final con ponderaciones de 10%, 25%, 25%

y 40%, Hacer un programa que calcule e imprima la calificación final

obtenida por un estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,

la calificación final.


*/
public class Ej3 {
    public static void main(String[] args) {
        
        
       Scanner read = new Scanner(System.in);
       
       double participacion, primerExamen, segundoExamen,examenFinal,total;
       double totalParticipacion,totalExamen,totalSegundoExamen,totalExamenFinal;
       
        System.out.println("Ingrese las notas correspondientes");
        participacion = read.nextDouble();
        primerExamen = read.nextDouble();
        segundoExamen = read.nextDouble();
        examenFinal = read.nextDouble();
        
        
        totalParticipacion = (participacion * 10)/ 10;
        totalExamen =  ( primerExamen * 25)/10;
        totalSegundoExamen = ( segundoExamen * 25)/10;
        totalExamenFinal = ( examenFinal * 40)/10;


   total = totalParticipacion + totalExamen+ totalSegundoExamen+totalExamenFinal;  
   
        System.out.println(" el total el  %"+total);
       
        
        
    }
    
}
