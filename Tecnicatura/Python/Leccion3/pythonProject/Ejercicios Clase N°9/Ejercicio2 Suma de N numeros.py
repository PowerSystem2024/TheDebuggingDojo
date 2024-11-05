# Clase 9 Ejercicios y mucha práctica Lunes 03/06/2024

# Ejercicio N°2:
'''Calcular la suma de "N" primeros números.'''

num = int(input(f"Digite la cantidad de N números a sumarse: "))
total = 0
for num in range (num):
    total += num

print(f"El total de la suma es: {total}")