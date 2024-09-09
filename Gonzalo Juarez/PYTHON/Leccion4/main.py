# COLECCIONES EN PYTHON

# LISTAS
'''
listas = Gonzalo, Santiago, Leonel, Franco
puedo tener cualquier tipo de elemento en un lista y a cada elemento de la misma
se le asigna un valor, comenzando por el cero.
En otros lenguajes se las conoce como ARREGLOS o VECTORES
'''
nombres = ['Leonel', 'Gonzalo','Franco', 'Orlando']
print(nombres)
print(nombres[1])
print(nombres[-1]) # recorre el array hacia atras, mostrando el último
print(nombres[0:2])
# imprime desde el valor ingresado a la izq hasta el valor de la derecha, sin terlo en cuenta
print(nombres[ :3])
# si el primero queda vacío, comienza desde el principio
# y el programa imprime los tres primeros
print(nombres[1: ])
# al dejar el segundo vacío, comienza desde el valor asignado y imprime hasta el final

# Modificar un valor
nombres[3] = 'Santiago'
print(nombres)

# iterar la lista
for nombre in nombres: # nombre en singular y la lista en plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Función LEN
# ¿Cuántos elementos hay en una lista?
print(len(nombres)) # comienza desde 1, por ende tiene 4 valores

# Agregar un elemento
nombres.append('Valentín') # se agrega al final
'''
nombres.append([1, 2, 3]) # se pueden agregar listas
nombres.append(True) # se pueden agregar booleanos
nombres.append(10.45) # se pueden agregar floats
nombres.append([4, 5])
nombres.append(7) # se pueden agregar enteros
'''
print(nombres)

# Agregar un elemento en un índice específico
nombres.insert(2, 'Martín')
nombres.insert(4, 'Gabriel')
print(nombres)

# Eliminar un elemendo
nombres.remove('Martín')
print(nombres)

# Eliminar el último elemento (última posición de la lista)
nombres.pop()
print(nombres) # chau valen

# Eliminar un índice específico
del nombres[3]
print(nombres)

# Eliminar todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
# print(nombres) # ya no existe, por lo que da error

# TUPLAS
# no se puede cambiar ni editar las tuplas
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)

#Ejemplo
verduras = ('papas',) # Una tupla de un solo elemento
# ya que tiene coma, de no tener coma solo sería un string

# Función LEN: ¿Cuántos elementos hay en la tupla?
print(len(cocina))
# Imprimir un elemento
print(cocina[0])
# Imprimir un rango
print(cocina[0:2])
#Recorremos la tupla
for cocinar in cocina:
    print(cocinar, end=' ')
    # print usa \n para saltos de línea
    # end =' ' para evitar el salto de línea
else:
    print('')

# Convercion de Tupla a lista y de Lista a Tupla
cocinaLista = list(cocina)
print(cocinaLista)
cocina = tuple(cocinaLista)
print(cocina)

# Eliminar la tupla
del cocina
# print(cocina) # ya no existe, por lo que da error

# Tipo SET
planetas = {"Marte","Júpiter","Venus"}
print(planetas) # se imprimen en orden aleatorio
print(len(planetas)) # para saver el largo

# Revisar si un elemento existe dentro del set
print("Marte" in planetas) # not in o in, para saber si está o no

# Agregar un elemento
planetas.add("Tierra")
planetas.add("Tierra") # no se pueden agregar elementos duplicados
print(planetas)

# Eliminar elemento
planetas.remove("Júpiter") # al escribir mal el codigo se rompe
print(planetas)
planetas.discard("Tierra") # al escribir mal no pasa nada
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set
del planetas
#print(planetas) #ocurre un error

# DICCIONARIO
# Compuesto por 2 elementos
# una llave y un valor
# 'MARADONA' : 10
# dict(key,value)
diccionario = {
    'IDE' : 'Integrated Development Environment',
    'POO' : 'Programación Orientada a Objetos',
    'SABD' : 'Sistema de Administración de Base de Datos'
}
# Verificar la cantidad de elementos
print(len(diccionario))
print(diccionario)

# Acceder al diccionario con la llave(key)
print(diccionario['IDE'])
# Otra forma
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificar los elementos del diccionario
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Recorrer los elemento del diccionario
# muestra solo las llaves
for termino in diccionario:
    print(termino)
# muestra llaves y elementos
for termino,valor in diccionario.items():
    print(termino,valor)
# Otras formas de acceder al diccionario
# muestra solo las llaves
for termino in diccionario.keys():
    print(termino)
# muestra solo las valores
for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de un elementos
print('IDE' in diccionario) # booleano (TRUE)
print('GRJZ' in diccionario) # booleano (FALSE)

# Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar un diccionario
del diccionario
# print(diccionario) # sale error porque no existe


# REPASO LISTAS
# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7, 8, 9, 1]) # agrega varios elementos a la lista
print(lista3)

# Indica el indice en el que se encuentra un elemento
print(lista3.index(5)) # elemento 5 esta en la posición 5
# si no existe el valor tira error
# si esta repetido slo nombra el indice del primero

# Como saber cuantos valores repetidos hay en un lista
print(lista3.count(1))

# Poner una lista al reves
lista3.reverse()
print(lista3)

# PAra que una lista se multiplique, repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento
lista3.sort() # Orden ascendente
print(lista3)
lista3.sort(reverse=True) # Orden Descendente
print(lista3)

# REPASO TUPLAS
# las tuplas pueden contener varios tipos de elementos
tupla = (4, 'Hola', True, 6.78, [1, 2, 78], 4, 'Hola')
lista3.sort() # Orden ascendente
print(tupla)

# Saber si hay un elemento
print(4 in tupla) # respuesta booleana (True)

# En las tuplas podemos usar index, count, lean
# En las tuplas se puede conertir de tupla a lista y de lista a tupla


# REPASO SET O CONJUNTO
# definir o iniciar un conjunto
conjunto1 = set() # vacío
conjunto2 = {'bye',} # con las llaves no se puede inicializar un conjunto
conjunto1.add(7)
conjunto1.add('Hola')
print(conjunto1)
conjunto2.add('Hola')
print(conjunto2)
print(3 not in conjunto2) # boolean (true)
# Igualdad de conjuntos
print(conjunto2 == conjunto1) # boolean (False)

# Operaciones en conjuntos
conjunto3 = conjunto2| conjunto1 # la linea une los conjuntos
print(conjunto3)
# los mismos elementos los escribe una sola vez

# Elementos en comun
conjunto3 = conjunto2 & conjunto1
print(conjunto3)

#Valores que estan el el conjunto2 y no en el conjunto1
conjunto3 = conjunto2 - conjunto1
print(conjunto3)
conjunto3 = conjunto1 - conjunto2
print(conjunto3)

# Valores que no tienen en comun
conjunto3 = conjunto2 ^ conjunto1
print(conjunto3)

# Saber si un conjunto esta incluido en otro
conjunto3 = conjunto2| conjunto1
#El conjunto 1 es subconjunto del conjunto 3?
print(conjunto1.issubset(conjunto3)) # boolean (True)
#El conjunto 2 es subconjunto del conjunto 3?
print(conjunto2.issubset(conjunto3)) # boolean (True)
#El conjunto 3 es subconjunto del conjunto 1?
print(conjunto3.issubset(conjunto1)) # boolean (False)
#El conjunto 3 es subconjunto del conjunto 2?
print(conjunto3.issubset(conjunto2)) # boolean (False)

#Elementos del conjunto 1 están incluidos en conjunto 3?
print(conjunto3.issuperset(conjunto1)) # boolean (True)
#Elementos del conjunto 2 están incluidos en conjunto 3?
print(conjunto3.issuperset(conjunto2)) # boolean (True)
#Elementos del conjunto 3 están incluidos en conjunto 1?
print(conjunto1.issuperset(conjunto3)) # boolean (False)
#Elementos del conjunto 3 están incluidos en conjunto 2?
print(conjunto2.issuperset(conjunto3)) # boolean (False)

# Saber si un conjunto es DISCONEXO
# no comparten ningun elemento
print(conjunto1.isdisjoint(conjunto2)) # boolean (False)

# Convertir un conjunto en INMUTABLE
conjunto1 = frozenset
# no se pueden agregar, modificar ni eliminar elementos del conjunto


# REPASO DICCIONARIOS
diccionarioNuevo = {'Azul':'Blue','Rojo':'Red','Verde':'Green','Amarillo':'Yellow'}
print(diccionarioNuevo)

# Eliminar elemento
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Se pueden agregar diferentes tipos de datos:
diccionario2 = {
    'Gonzalo': {'Edad': 24, 'Altura': 1.68},
    'Franco': [23, 1.73],
    'Santiago': [26, 1.70]
}
print(diccionario2)

# Ejercicio de la SeleccionArgentina creado en otro archivo

# PILAS usando listas
pila = [1, 2, 3]
print(pila)

# Agregar elementos al final a la pila
pila.append(4)
pila.append(5)
print(pila)

# Eliminar el ultimo elemento de una pila
# pila.pop()
# Eliminar el ultimo elemento y lo guardo en una variable
elementoBorrado = pila.pop()
print(f'Eliminamos el elemento {elementoBorrado} y la pila queda así {pila}')


# COLAS con listas
# Estructura de datos de tipo fifo (first input / first output)
cola = ['Gonzalo','Martin','Franco','Valentin']
print(cola)

# Agregamos elementos al final de la cola
cola.append('Santiago')
cola.append('Daniel')
print(cola)

# Eliminar el primer elemento de una cola
# cola.pop(0)
# Eliminar el ultimo elemento y lo guardo en una variable
elementoRetirado = cola.pop(0)
print(f'Atendido el cliente {elementoRetirado} y la cola queda: {cola}')
elementoRetirado = cola.pop(0)
print(f'Atendido el cliente {elementoRetirado} y la cola queda: {cola}')
elementoRetirado = cola.pop(0)
print(f'Atendido el cliente {elementoRetirado} y la cola queda: {cola}')
elementoRetirado = cola.pop(0)
print(f'Atendido el cliente {elementoRetirado} y la cola queda: {cola}')
elementoRetirado = cola.pop(0)
print(f'Atendido el cliente {elementoRetirado} y la cola queda: {cola}')
elementoRetirado = cola.pop(0)

