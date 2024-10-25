/*
    Proyecto Caja:
    Ejercicio 1:
    Crear un proyecto según las especificaciónes mostradas a continuación.
    La formula es: volumen = ancho * alto * profundidad.
*/
package Caja;

public class Caja {
    // ATRIBUTOS
    double ancho;
    double alto;
    double prof;
    
    // CONSTRUCTOR VACIO
    public Caja(){
    }
    
    // CONSTRUCTOR CON ARGUMENTOS
    public Caja(double ancho, double alto, double prof){
        this.ancho = ancho;
        this.alto = alto;
        this.prof = prof;
    }
    
    // MÉTODO PARA CALCULAR VOLUMEN
    public double calcularVolumen(){
        //double volumen = ancho * alto * prof;
        //System.out.println("El volumes es: " + ancho + " * " + alto + " * " + prof );
        //System.out.println("El volúmen es  " + volumen);
        return ancho * alto * prof;
    }
}
