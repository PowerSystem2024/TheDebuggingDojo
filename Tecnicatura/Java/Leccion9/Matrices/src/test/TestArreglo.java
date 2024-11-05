
package test;

/**
 *
 * @author nahue
 */
public class TestArreglo {
    
    public static void main(String[] args) {
        // lado izq declaramos la variable
        // lado derecho instanciamos un objeto de tipo object 
        int edad [] = new int [3];
        System.out.println("edad = " + edad.length);
        
         
        edad[0] = 17;
        System.out.println(" edades 0 = " +  edad[0]);
        
        edad[1]=20;
        edad[2]=21;
        
        System.out.println(" edad[1] = "+ edad[1]);
         System.out.println(" edad[2] = "+ edad[2]);
        
          
       // edad[3]=7; fuera de rango
       
       
        for( int i = 0; i < edad.length; i++){
            System.out.println( "edades y sus elementos "+i+" = "+edad[i]);
        
        }
    }
  
}
