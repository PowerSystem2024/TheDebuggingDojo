
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        // ciclo WHILE
        var conteo = 0;
        while (conteo < 7){
            System.out.println("conteo = " + conteo);
            conteo++;
        }
        
        // ciclo DO WHILE
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
        // ciclo FOR
        for (var contando = 0; contando < 7; contando++){
            System.out.println("contando = " + contando);
        }
        
        // palabra reservada BREAK
        // para detener o interrumpir un ciclo
        for (var contando1 = 0; contando1 < 7; contando1++){
            if(contando1 % 2 == 0){
                System.out.println("contando = " + contando1);
                break;
            }
            // el sistema muestra los numeros pares, pero al ingresar la palabra break
            // se detiene luego de imprimer valor, en este caso 0
        }
        
        // palabra reservada CONTINUE
        for (var contando2 = 0; contando2 < 7; contando2++){
            if(contando2 % 2 != 0){
                continue;
            }
            System.out.println("contando 2 = " + contando2);
            // cuando la variable es un numero impar, salta a la siguiente iteración
            // es decir, fuera del ciclo, por lo que el sistema solo muestra los numeros pares
        }
        
        // etiquetas LABELS
        // Malas practicas usar estas etiquetas
        // se usan para guiar hacia a donde ir despues de usar break o continue
        inicio:
        for (var contando3 = 0; contando3 < 7; contando3++){
            if(contando3 % 2 == 0){
                System.out.println("contando 3 = " + contando3);
                break inicio;
            }
            // el sistema muestra los numeros pares, pero al ingresar la palabra break
            // se detiene luego de imprimer valor, en este caso 0
        }
    }
}
