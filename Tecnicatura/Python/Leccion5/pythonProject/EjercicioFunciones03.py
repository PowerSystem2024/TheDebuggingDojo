# Ejercicio 3: Función Recursiva.
# Imprimir números del 5 al 1 de manera descendente usando función recursiva.
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada.
def imprimir_numeros_recursivos(numero):
    if numero >= 1: # Caso Base.
        print(numero)
        imprimir_numeros_recursivos(numero-1) # Caso Recursivo.
    elif numero == 0:
        return
    elif numero <= 0:
        print('Valor ingresado incorrecto...')

imprimir_numeros_recursivos(1) # Tarea:  Que el usuario ingrese el número.

# Tarea:
def imprimir_numeros_recursivos2(n):
    if n <= 0:
        return  # Si el número es negativo o cero, no hacemos nada
    else:
        print(n)  # Imprimir el número actual
        imprimir_numeros_recursivos2(n - 1)  # Llamada recursiva con el número decreciendo en 1

# Solicitar al usuario que ingrese un número positivo
numero = int(input("Ingrese un número: "))

# Llamar a la función recursiva si el número es positivo
if numero > 0:
    imprimir_numeros_recursivos2(numero)
else:
    print("No se pueden imprimir números negativos o cero.")