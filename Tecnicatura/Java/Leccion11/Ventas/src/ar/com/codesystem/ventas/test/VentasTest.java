
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.Orden;
import ar.com.codesystem.ventas.Producto;

public class VentasTest {

    public static void main(String[] args) {
        
        
    Producto producto1 = new Producto("Pantalon",700);
    Producto producto2 = new Producto("Campera",1000.00);
    
    //tarea 
    Producto producto3 = new Producto("camisa",700);
    Producto producto4 = new Producto("zapato",800);
    Producto producto5 = new Producto("remera",900);
    Producto producto6 = new Producto("remera",1000);
    Producto producto7 = new Producto("remera",1100);
    
    
    Producto producto8 = new Producto("camisa",700);
    Producto producto9 = new Producto("zapato",800);
    Producto producto10 = new Producto("cinto",900);
    Producto producto11 = new Producto("reloj",1000);
    Producto producto12 = new Producto("gorra",1100);
    
    
    Orden orden1 = new Orden();
    
    
    orden1.agregarProducto(producto1);
     orden1.agregarProducto(producto2);
    orden1.mostrarOrden();
    
    System.out.println("");
    System.out.println("tarea");
    System.out.println("");
    //tarea 
    Orden orden2 = new Orden();
    
    orden2.agregarProducto(producto3);
    orden2.agregarProducto(producto4);
    orden2.agregarProducto(producto5);
    orden2.agregarProducto(producto6);
    orden2.agregarProducto(producto7);
    
    orden2.mostrarOrden();
    
    System.out.println("");
    System.out.println("");
    
    
    Orden orden3 = new Orden();
    orden3.agregarProducto(producto8);
    orden3.agregarProducto(producto9);
    orden3.agregarProducto(producto10);
    orden3.agregarProducto(producto11);
    orden3.agregarProducto(producto12);
    
    orden3.mostrarOrden();
    }
    
    
}
