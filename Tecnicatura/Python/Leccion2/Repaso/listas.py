# Se definen dos listas, lista1 y lista2
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]

# Se crea una nueva lista, lista3, que es la concatenación de lista1 y lista2
lista3 = lista1 + lista2
print(lista3)

# Se extiende lista3 añadiendo más elementos [7, 8, 9]
lista3.extend([7, 8, 9])
print(lista3)

# Se busca el índice del primer elemento que tiene el valor 5 en lista3
print(lista3.index(5))

# Se cuenta cuántas veces aparece el valor 1 en lista3
print(lista3.count(1))

# Se invierte el orden de los elementos en lista3
lista3.reverse()
print(lista3)

# Se multiplica lista3 por 2, duplicando sus elementos
lista3 = lista3 * 2
print(lista3)

# Se ordena lista3 en orden ascendente
lista3.sort()
print(lista3)

# Se ordena lista3 en orden descendente
lista3.sort(reverse=True)

# Se imprime la lista3 después de ordenarla en orden descendente
print(lista3)

# Se define una tupla con varios tipos de datos
tupla = (4, "Hola", 6, 78, [1, 2, 78], 4, "Hola")
print(tupla)

# Se verifica si el número 4 se encuentre en la tupla y se imprime el resultado
print(4 in tupla)