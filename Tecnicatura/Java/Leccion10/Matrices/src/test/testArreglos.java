
package test;

public class testArreglos {
    public static void main(String[] args) { // Lado derecho instanciamos un objeto de tipo object.  
        int edades[] = new int [3]; // Lado izquierdo declaramos la variable.
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 24;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 55;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3] = 7; // Fuera de rango, error en tiempo de ejecución.
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]); 
        }
    }
}
