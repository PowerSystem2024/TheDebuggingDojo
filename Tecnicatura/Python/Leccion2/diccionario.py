#Un "Diccionario" esta compuesto por 2 elementos, una llave y un valor
#dict(key,value)

diccionario = {
    "IDE": "Integrated Development Environment",
    "POO": "Programacion Orientada a Objetos",
    "SABD": "Sistema de Administracion de Bade de Datos"
}

print(diccionario) 
print(len(diccionario)) 

#Acceder a un diccionario con la llave(key)

print(diccionario["IDE"])

#Esta es otra forma de hacerlo 

print(diccionario.get("POO")) #Obtenemos el valor de la llave con el metodo ".get()"

#Modificamos elementos

diccionario["IDE"] = "Entorno de Desarrollo Integrado" 
print(diccionario)

#Recorrer los elementos
for termino in diccionario: 
    print(termino)

#Necesitamos una funcion para recorrer un diccionario

for termino, valor in diccionario.items():
    print(termino, valor)

#Otras maneras de acceder a un diccionario

for termino in diccionario.keys():
    print(termino)

#Mostramos los valores sin las llaves

for valor in diccionario.values():
    print(valor) 

#Comprobar la existencia de elementos

print("IDE" in diccionario)

#Agregar un elemento 

diccionario["PK"] = "Primary Key"
print(diccionario)

#Eliminar un elemento

diccionario.pop("SABD") #Elimina la llave y su valor
print(diccionario)

#Vaciar un diccionario

diccionario.clear()
print(diccionario)

#Eliminar diccionario

# del diccionario