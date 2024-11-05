# Clase Lunes 13/05/24
# 6.1 Sentencia If/Else
# En esta clase veremos la sentencia if/else.
'''condicion = 10
if condicion == True:
    print("Condición Verdadera")
elif condicion == False:
    print("Condición Falsa")
else:
    print("Condición sin especificar.")'''

# Ejercicio: Conversión de Número a Texto.
# num = int(input("Digite un número en el rango del 1 al 3: "))
# numTexto = ""
# if num == 1:
#     numTexto = "Número uno."
# elif num == 2:
#     numTexto = "Número dos."
# elif num == 3:
#     numTexto = "Número tres."
# else:
#     numTexto = "Has ingresado un número fuera del rango."
# print(f"El número ingresado es: {num} - {numTexto}")

# 6.3 Sintaxis simplificada (Operador Ternario)
condicion = False
# if condicion:
#     print('Condición Verdadera')
# else:
#     print('Condición Falsa')

print('Condición Verdadera') if condicion else print('Condición Falsa')