# ----------- Listas Parte 1 -------------

# lista = Ariel, Liliana, Natalia, Osvaldo 

nombres = ['Naty', 'Osvaldo', 'Lily',  'Ariel']

print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[-1])
print(nombres[-2])


# ------------ Listas Parte 2 ------------

print(nombres)
print(nombres[0:2])
print(nombres[:3])
print(nombres[1:]) 

# Modificar un valor

nombres[2] = 'Liliana'
nombres[0] = 'Natalia'

print(nombres)

# Iterar lista 

for nombre in nombres: 
    print(nombres)
else: 
    print('Se acabaron los elementos de la lista')


# ------------ Listas Parte 3 ------------

# Cantidad de elementos que tiene una lista

print(len(nombres))

# Agregar un elemento 

nombres.append('Marcelo')
print(nombres)

# Insertar elemento en un indice 

nombres.insert(1, 'Alberto')
print(nombres)

nombres.insert(3, 'Debora')
print(nombres)


# Eliminar un elemento 

nombres.remove('Alberto')
print(nombres)

# Eliminar ultimo elemento

nombres.pop()
print(nombres)

# Eliminar un indice en especifico 

del nombres[2]
print(nombres)


# Eliminar, borrar o limpiar todos los elementos

nombres.clear()
print(nombres)

# Eliminar la lista 

del nombres 
print(nombres)
