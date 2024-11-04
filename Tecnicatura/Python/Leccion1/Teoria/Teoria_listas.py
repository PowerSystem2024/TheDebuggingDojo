# ----------- Listas Parte 1 -------------

# lista = Florencia, Gonzalo, Pablo, Paula

nombres = ['Florencia', 'Gonzalo', 'Pablo',  'Paula']

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

nombres[2] = '  Nahuel'
nombres[0] = 'Gabriel'

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

nombres.append('Valentin')
print(nombres)

# Insertar elemento en un indice 

nombres.insert(1, 'Lazaro')
print(nombres)

nombres.insert(3, 'Leandro')
print(nombres)


# Eliminar un elemento 

nombres.remove('Valentin')
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
