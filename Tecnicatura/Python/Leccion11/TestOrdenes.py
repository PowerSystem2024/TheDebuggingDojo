from Producto import Producto
from Orden import Orden


producto1 = Producto('Remera', 150.00)
producto2 = Producto('Short', 100.00)
producto3 = Producto('Medias', 50.00)
producto4 = Producto('Campera', 300.00)
producto5 = Producto('Sueter', 200.00)
producto6 = Producto('Blusa', 160.00)

productos1 = [producto1, producto2] #Lista de productos
orden1 = Orden(productos1) #Primer objeto orden pasando a la lista
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)

print(orden1)
print(f'Total de la Orden1: {orden1.calcular_total()}')
productos2 = [producto3, producto4] 
orden2 = Orden(productos2)
orden2.agregar_producto(producto6)
orden2.agregar_producto(producto2)
print (orden2)
print(f'Total de la Orden2: {orden2.calcular_total()}')