# Definir una tupla 
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento 
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango 
print(cocina[0:2])

verduras = ('papa', )

# Recorrer elementos 
for cocinar in cocina: 
    print(cocinar, end='')

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# Eliminar tupla 
# del cocina 