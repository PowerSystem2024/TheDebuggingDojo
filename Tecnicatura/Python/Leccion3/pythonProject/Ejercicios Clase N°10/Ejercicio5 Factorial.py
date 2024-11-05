# Clase 10 Ejercicios y mucha práctica Lunes 10/06/2024

# Ejercicio N°5:
'''Calcular el factorial de un número mayor o igual a 0.'''

num = int(input("Digite un número: "))
if num < 0:
        print("El número debe ser mayor o igual a 0.")

i = 1
factorial = 1

while i <= num:
    factorial *= i
    i += 1
print(f"El factorial de {num} es: {factorial}")