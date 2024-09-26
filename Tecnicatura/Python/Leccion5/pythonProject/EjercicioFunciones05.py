# Ejercicio 5: Convertidor de temperaturas.
# Realizar dos funciones para convertir de grados Celsius a Fahrenheit y viceversa.
# Investigar las fórmulas.

# Funciones que convierte de Celsius a Fahrenheit:
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32 # La presedencia: multiplicación, división y suma.

# Función que convierte de Fahrenheit a Celsius:
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9 # Respetar la presedencia utilizando paréntesis.

# Celsius:
celsius = float(input('Digite el valor de Celsius: '))
resultado = celsius_fahrenheit(celsius)
print(f'{celsius} C a F -> {resultado:.2f}')

# Fahrenheit:
fahrenheit = float(input('Digite el valor de Fahrenheit: '))
resultado = fahrenheit_celsius(fahrenheit)
print(f'{fahrenheit} F a C -> {resultado:.2f}')