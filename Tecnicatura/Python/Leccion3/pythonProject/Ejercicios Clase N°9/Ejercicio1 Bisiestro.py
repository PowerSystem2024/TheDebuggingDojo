# Clase 9 Ejercicios y mucha práctica Lunes 03/06/2024

# Ejercicio N°1:
'''Diseñar un programa que ingresando un año, nos devuelva por consola si es un año bisiestro o no:
Repetir la acción hasta que el usuario lo decida.'''

print("Comprobamos que año es bisiestro")

opcion = 0
while opcion != 1:
    num = int(input("Ingrese el año: "))
    if(num % 4 == 0 and num % 100 != 0) or num % 400 == 0:
        print("El año es bisiestro.")
    else:
        print("El año NO es bisiestro.")

    num2 = int(input("Digite 1 para salir: "))
    if num2 == 1:
        opcion = 1
else:
    print("Fin del ciclo")