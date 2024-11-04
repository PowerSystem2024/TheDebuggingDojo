
package ar.com.codesystem.ventas;

public class Producto {
    
    //Atributos
    private int idProductos;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
        this.idProductos = ++Producto.contadorProducto;
    }
    
    public Producto( String nombre, double precio ){
    this();
    this.nombre = nombre;
    this.precio=precio;
    }
    
    public int getIdProducto(){
    return idProductos;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public double getPrecio(){
    return precio;
    }
    
    public void setPrecio( double precio){
    this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProductos=" + idProductos + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
