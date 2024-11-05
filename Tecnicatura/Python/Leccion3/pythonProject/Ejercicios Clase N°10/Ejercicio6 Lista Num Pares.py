# Clase 10 Ejercicios y mucha práctica Lunes 10/06/2024

# Ejercicio N°6:
'''Ingresar "N" enteros, visualizar la suma de los números pares de la lista.
¿Cuántos números pares existen y cuál es el promedio de los números impares.'''

n = int(input("Ingrese la cantidad de números a ingresar: "))

suma_pares = 0
conteo_pares = 0
suma_inpares = 0
conteo_inpares = 0

for i in range(n):
  num = int(input("Ingrese un numero: "))

  if num % 2 == 0:
     print("El numero es par")
     suma_pares = suma_pares + num
     conteo_pares = conteo_pares +1

  else:
     print("El numero es impar")
     suma_inpares= suma_inpares+num
     conteo_inpares = conteo_inpares+1
#//////////////////////////////////////////////////////////
  print("")
  if conteo_pares > 0:

      print(f"La suma de los numero pares es {suma_pares}")
      print(f"El conteo de los numeros pares es {conteo_pares}")

  else:
      print("No se digitaron numeros pares")

#///////////////////////////////////////////////////////////

if conteo_inpares > 0:
    print(f"La suma de los numero impares es {suma_inpares}")
    print(f"El conteo de los numeros impares es {conteo_inpares}")

else:
    print("No se digitaron numeros impares")