
package pasoporreferencia;
import Clases.Persona; // importo desde la clase Persona

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ariel";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1); // muestra la dirección de memoria heap
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        // parámetro por referencia
        persona.nombre = "Gonza";
        
    }
}
