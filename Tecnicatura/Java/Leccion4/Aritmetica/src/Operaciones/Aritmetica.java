
package Operaciones;

public class Aritmetica {
    ////// atributos
    int a;
    int b;
    
    
    ///// metodos 
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println(resultado);
    }
    
    public int sumarConRetorno(){
       int resultado;
       resultado = a + b;
        
        return resultado;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
    a = arg1;
    b = arg2;
    
    return sumarConRetorno();
            
        
    }
    
    
}
