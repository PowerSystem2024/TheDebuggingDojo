
package ar.com.codesystem.ventas;


public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int ContadorOdenes;
    private int contadorProductos;
    private static final int MAX_PROXUTOS=10;
    
    
    public Orden(){
    this.idOrden = ++Orden.ContadorOdenes;
    this.productos = new Producto[Orden.MAX_PROXUTOS];
    }
    
    public  void agregarProducto ( Producto producto){
    if(this.contadorProductos < Orden.MAX_PROXUTOS)
    {
    this.productos[this.contadorProductos++] = producto;
    }
    else{
        System.out.println(" se superaro el maximo de productos "+ Orden.MAX_PROXUTOS);
    }
    }
    
    
    public double calcularTotal(){
    
        double total = 0;
        
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        
        return total;
    }
    
    
    
    public void mostrarOrden(){
        System.out.println(" el id de la orden es "+idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println(" el total de la orden es "+totalOrden);
        System.out.println(" ");
        
        for (int i = 0; i < this.contadorProductos; i++) {
            
           
            System.out.println( this.productos[i].getNombre());
            
        }
    }
    
}
