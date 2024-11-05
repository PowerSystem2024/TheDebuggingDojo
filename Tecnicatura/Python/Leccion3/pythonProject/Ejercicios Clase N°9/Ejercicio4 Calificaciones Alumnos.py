# Clase 9 Ejercicios y mucha práctica Lunes 03/06/2024

# Ejercicio N°4:
'''Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos.
Realizar un algoritmo para calcular la calificación promedio y la calificación más baja de todo el grupo.'''

min = 10
suma = 0

for i in range(10):
    calificaciones = float(input(f"Ingrese las calificiones {i + 1}: "))
    suma += calificaciones
    if calificaciones < min:
        min = calificaciones

promedio = suma / 10
print(f"El promedio es: {promedio}")
print(f"La calificacion mínima es: {min}")