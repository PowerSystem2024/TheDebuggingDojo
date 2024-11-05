# Ciclo While (Mientras o durante).
"""contador = 0
while contador < 78:
    print("Ejecutamos nuestro ciclo while", contador)
    contador += 1
else:
    print("Fin del ciclo while)")"""

# Ejercicio: Imprimir número del 0 al 5 con el ciclo While.
'''maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1'''
# Ejercicio: Imprimir número del 5 al 1 con el ciclo While.
'''minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1'''

# Ciclo For.
'''cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for.")'''

# Palabra reservada Break.
'''for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        break
else:
    print("Fin del ciclo for.")'''

# Palabra reservada Continue.
for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')

for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')