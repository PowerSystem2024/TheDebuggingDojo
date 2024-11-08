# Clase 9 Ejercicios y mucha práctica Lunes 03/06/2024

# Ejercicio N°3:
'''Leer 10 números, determinar cuáles son positivos, cuántos son negativos y cuántos son neutros.'''

positivos = 0
negativos = 0
neutros = 0

for i in range(10):
    numero = float(input(f"Digite el número {i + 1}: "))

    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
    else:
        neutros += 1

print(f"Los números positivos son: {positivos}")
print(f"Los números negativos son: {negativos}")
print(f"Los números neutros son: {neutros}")