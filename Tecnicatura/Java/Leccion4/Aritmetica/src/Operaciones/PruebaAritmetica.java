/*
 
*/
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // memoria stack, almacena las variables
        var a = 8; // variables locales
        int b = 2; // varibales locales
        // se puede usar var para variable slocales
        
        miMetodo(); // llamamos al método
        
        Aritmetica aritmetica1 = new Aritmetica(); // CONSTRUCTOR 1
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(4, 6);
        System.out.println("Resultado = " + resultado);
        
        System.out.println("Aritmetica1 a: " + aritmetica1.a);
        System.out.println("Aritmetica1 b: " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8); // CONSTRUCTOR 2
        System.out.println("Aritmetica2 a: " + aritmetica2.a);
        System.out.println("Aritmetica2 b: " + aritmetica2.b);
        
        //aritmetica1 = null; // limpia o destruye (no se utiliza, ya que ocurre automaticamente)
        //System.gc(); // limpia residuos del programa (no se utiliza, ya que ocurre automaticamente)
        
        Persona persona = new Persona("Gonzalo","Juarez");
        System.out.println("Persona = " + persona);
        System.out.println("Persona nombre = " + persona.nombre);
        System.out.println("Persona apellido = " + persona.apellido);
    }
    
    // Modularidad: Creamos un nuevo método
    public static void miMetodo(){
        //a = 10; // la variable está limitada,no se puede trascender desde la clase main
        System.out.println("Aquí hay otro método");
    }
}

// Creamos una nueva clase
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ // Constructor
        super(); // LLamada al constructor padre Object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
                
    }
}


class Imprimir{
    public Imprimir(){
        super(); // el constructor de la clase padre, para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase Imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}