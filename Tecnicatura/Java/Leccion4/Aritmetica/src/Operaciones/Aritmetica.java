
package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    // memoria heap, para atributos u objetos
    int a;
    int b;
    
    
    // SOBRECARGA DE CONSTRUCTORES
    // El constructor es un método especial
    // CONSTRUCTOR 1
    public Aritmetica(){ 
        System.out.println("Se está ejecutando el constructor número 1");
    }
    // CONSTRUCTOR 2
    public Aritmetica(int a, int b){ // no se usa var para atributos o parámetros
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor número 2");
    }
    
    // METODO
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        //return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; // el argumento a se asigna el atributo this.a
        this.b = b; // el uso del this. es opcional
        //return a + b;
        return this.sumarConRetorno();
    }
}
