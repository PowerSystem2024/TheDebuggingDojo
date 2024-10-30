# REPASO DE DICCIONARIOS (Clase )

diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}

# Como eliminar diccionario
print(diccionarioNuevo)
del (diccionarioNuevo['Azul']) # Recordar que para eliminar un elemento debemos usar la llave.
print(diccionarioNuevo)

# Recordar que los diccionarios puede almacenar distintos tipos de datos
diccionario2 = {'Ulises':{'Edad': 40, 'Altura': '1.78'}, 'Ariel': [40, 1.83], 'Osvaldo': [45, 1.85]}
print(diccionario2)


# Ejercicio Diccionario Seleccion Argentina
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 millones', 'Posicion': 'Extremo Derecho o Mediocampista Ofensivo'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 millones', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posicion': 'Extremo Derecho o Mediocampista Ofensivo'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones', 'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 millones', 'Posicion': 'Arquero'},
    7: {'Nombre': 'Lautaqro Martinez', 'Edad': 27, 'Altura': 1.74, 'Precio': '35 millones', 'Posicion': 'Delantero'},
    3: {'Nombre': 'Nicolas Tagliafico', 'Edad': 32, 'Altura': 1.72, 'Precio': '8 millones', 'Posicion': 'Lateral Izquierdo'},
    8: {'Nombre': 'Enzo Fernandez', 'Edad': 23, 'Altura': 1.78, 'Precio': '75 millones', 'Posicion': 'Mediocentro'},
    17: {'Nombre': 'Julian  Alvarez', 'Edad': 24, 'Altura': 1.70, 'Precio': '75 millones', 'Posicion': 'Delantero'}
}
print(seleccionArgentina)
print(seleccionArgentina[11])
print(seleccionArgentina.values())
for llave in seleccionArgentina:
    print(llave)