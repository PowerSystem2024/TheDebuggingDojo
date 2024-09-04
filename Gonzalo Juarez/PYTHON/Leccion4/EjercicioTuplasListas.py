'''
    Ejercicio de Tuplas y de Listas:

    Dada la siguiente tupla:
    tupla = (13, 1, 8, 3, 2, 5, 8)

    Crear una lista que solo incluya los numeros menores a 5 e imprima por consola
    Ejemplo de ejecución: [1, 3, 2]
'''

tupla = (13, 1, 8, 3, 2, 5, 8)

lista = list(tupla)
for i in lista:
    if(i<5):
        print(i,end=' ')
print('\n')

# Profesor
listaProfe = []
for elemento in tupla:
    if elemento < 5:
        listaProfe.append(elemento)

print(listaProfe)