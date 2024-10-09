

package Operaciones;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        Aritmetica aritmetica1;
        
        aritmetica1 = new Aritmetica();
        
        aritmetica1.a = 3;
        aritmetica1.b = 1;
        int resultado = aritmetica1.sumarConRetorno();
        int argumentosResultado;
        
        argumentosResultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("con argumentos");
        System.out.println(argumentosResultado);
        System.out.println("");
        System.out.println("sin argumentos");
        System.out.println("");
        aritmetica1.sumarNumeros();
        System.out.println(resultado);
        

        
        
        
    }
    
}
