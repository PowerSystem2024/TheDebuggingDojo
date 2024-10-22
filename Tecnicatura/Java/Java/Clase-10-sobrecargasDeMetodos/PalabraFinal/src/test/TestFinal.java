
package test;

import domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        final int miDni = 38771028;
        
        System.out.println("miDni = " + miDni);
        
      final Persona Persona1 = new Persona();
      
      //persona1 = new Perosna(); No se puede asignar una nueva referneica
      
      Persona1.setNombre("Nahuel Francia");
        System.out.println("Persona1 nombre "+ Persona1.getNombre());
        
      Persona1.setNombre("liliana");
         System.out.println("Persona1 nombre "+ Persona1.getNombre());
    }
    
}
