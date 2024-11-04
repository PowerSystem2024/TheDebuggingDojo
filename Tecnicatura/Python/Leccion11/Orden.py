from Producto import Producto

class Orden:
    contador_ordenes = 0 

    def __init__(self, productos):
        Orden.contador_ordenes += 1 
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # Sirve para agregar un nuevo producto 

    def calcular_total(self): 
        total = 0  # Variable temporal para almacenar el total
        for producto in self._productos: 
            total += producto.precio
        return total 

    def __str__(self): 
        productos_str = ''
        for producto in self._productos: 
            productos_str += str(producto) + ' | '  # Cambié producto._str_() a str(producto)
        return f'Orden: {self.id_orden}, \nProductos: {productos_str.strip()}'

if __name__ == '__main__': 
    producto1 = Producto('Remera', 150.00)
    print(producto1)
    producto2 = Producto('Short', 100.00)
    print(producto2)
    productos1 = [producto1, producto2] 
    orden1 = Orden(productos1) 
    print(orden1)
    orden2 = Orden(productos1)
    print (orden2)
#Tarea Modificar la orden 2 ingresando nuevos productos con sus nombres y precios 
#Crear una nueva lista de productos y agregarla a la orden2 
 # Modificar la orden2 ingresando nuevos productos
    nuevo_producto1 = Producto('Pantalón', 200.00)
    nuevo_producto2 = Producto('Zapatos', 300.00)
 # Agregar nuevos productos a orden2
    orden2.agregar_producto(nuevo_producto1)
    orden2.agregar_producto(nuevo_producto2)
# Imprimir la nueva orden2 con los productos agregados
    print(orden2)
