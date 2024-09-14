
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class CilcosEj07 {
    public static void main(String[] args) {
        
        
          Scanner read = new Scanner(System.in);
   int numero, media, total;
   boolean salir;
  salir = true;
  total=0;
  media=0;
   
    do{
     System.out.println("ingrese un numero");
     numero = read.nextInt();
     
     if( numero >= 0){
    media = media + numero;
    total++;
    }
     else{
     salir = false;}
}
    while(salir);
        System.out.println("la cantidad de intentos fueron "+ total);
        System.out.println("La media es "+media/total);
    
    
    }
}
