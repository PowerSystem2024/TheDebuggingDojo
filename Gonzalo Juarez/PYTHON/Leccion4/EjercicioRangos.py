# Sintaxis de range( inicio<opcional>, fin <requerido> , incremento<opcional>)

'''
Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3.
Ejemplo de ejecución: 0, 3, 6, 9
'''
print('Rango de 0 a 10 con números divisibles por 3:')
for i in range(11):
    if (i % 3 == 0):
        print(i)
else:
    print('')
'''
Ejercicio 2: Crear un rango de números de 2 a 6 e imprimelos.
Ejemplo de ejecución: 2, 3, 4, 5, 6
'''
print('Rango de 2 a 6:')
for i in range(2,7):
    print(i)
else:
    print('')
'''
Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1. 
Ejemplo de ejecución: 3, 5, 7, 9
'''
print('Rango de 3 a 10 con paso 2:')
for i in range(3, 11, 2):
    print(i)
else:
    print('')
