
package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero[] = new int[5];
        
        double mediaPositivo;
        double mediaNegativo;
        
        double totalP = 0;
        double totalN = 0;
        
        
        int ceros = 0;
        int contP = 0;
        int contN = 0;
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println(" ingrese el numero en la posicion "+i);
            numero[i] = read.nextInt();
            
            if(numero[i] > 0){
            contP = contP+1;
            totalP = totalP + numero[i];
            }
            else if(numero[i] < 0){
            contN = contN+1;
             totalN = totalN + numero[i];
            }
            else{ ceros = ceros+1;}
            
        }
        
        mediaPositivo = totalP / contP;
        mediaNegativo = totalN / contN;
       
        
        System.out.println(" numeros positivos "+ contP+" el total de la suma de los numeros positivos es "+ totalP+"  la media seria "+mediaPositivo);
        System.out.println(" numeros negativos "+ contN +" el total de la suma de los numeros negativos es "+ totalN +" la media seria "+ mediaNegativo);
        System.out.println(" la cantidad de 0 son "+ ceros);
        
        
        
        
        
        
        
        
        
    }
}
