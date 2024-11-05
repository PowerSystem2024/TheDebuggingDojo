# 6.2 Ejercicio 1: Clase Lunes 13/05/24
'''Escribir la siguiente expresión en forma de expresión algorítmica:
 (a3 x (b2 – 2ac)) / 2b
1. Pedimos al usuario 3 valores = a, b, c.
2. Mostramos el resultado final.'''
# a = float(input("Digite el valor de la variable 'a': "))
# b = float(input("Digite el valor de la variable 'b': "))
# c = float(input("Digite el valor de la variable 'c': "))
# resultado = (a**3 * (b**2 - 2*a*c)) / (2*b)
# print(f"El resultado es: {resultado}")

# Ejercicio 2:
'''Determinar la solución lógica de la siguiente operación:
((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)'''
# a = float(input("Digite el valor de la variable 'a': "))
# b = float(input("Digite el valor de la variable 'b': "))
# resultado = ((3+5*8) < 3 and ((-6/2*4) + 2 < 2)) or (a > b)
# print(f"El resultado es: {resultado}")

# Ejercicio 3:
'''Intercambiar el valor de dos variables.
Por ejemplo: 
a = 10    a = 5
b = 5     b = 10'''
# a = input("Digite el valor de '10' para la variable 'a': ")
# b = input("Digite el valor de '5' para la variable 'b': ")
# a , b = b , a
# print(f"El nuevo valor de la variable 'a' es : {a}")
# print(f"El nuevo valor de la variable 'b' es: {b}")

# Ejercicio 4: Área y longitud de un circulo
'''Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia.
Área = Pi * r2
Longitud = 2 * Pi * r
En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
Se escribe: import math'''
r = float(input("Digite el valor del radio de un círculo 'r': "))
import math
area = math.pi * r**2
longitud = 2 * math.pi * r
print(f"El área del cíeculo es: {area:.2f}") # Colocando :.2f solo elijo usar dos decimales después de la coma.
print(f"y la longitud de la circunferencia es: {longitud:.2f}") # Colocando :.2f solo elijo usar dos decimales después de la coma.