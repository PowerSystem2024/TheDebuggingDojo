import FiguraGeométrica
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print('Creación de objetos clase Cuadrado.'.center(50, '_'))
cuadrado1 = Cuadrado(8, 'azul')
cuadrado1.alto = 7
cuadrado1.ancho = 7
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')

# MRO = Method Resolution Order
#print(Cuadrado.mro())

print(cuadrado1)
print('Creación de objetos clase Rectángulo.'.center(50, '_'))
rectangulo1 = Rectangulo(3, 9, 'verde')
rectangulo1.ancho = 8
print(f'Calculo del área del rectángulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

#figura1 = FiguraGeométrica() # No se puede instanciar, es abstracta.
print(Cuadrado.mro())

