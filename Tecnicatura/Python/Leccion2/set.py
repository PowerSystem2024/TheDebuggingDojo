#Tipo "set" (conjunto)

planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)
print(len(planetas)) 
print("Marte" in planetas) 

#Agregar un elemento a nuestro set

planetas.add("Tierra") 
print(planetas)

#Eliminar elementos (Da error si el elemento no existe)

planetas.remove("Jupiter") 
#planetas.remove("jupiter") #Da error por que no "existe"
print(planetas)

planetas.discard("Tierra") 
print(planetas)

#Limpiar set

planetas.clear() 
print(planetas)

#Eliminar set por completo
del planetas
print(planetas) #Da error por que nuestro set ya no existe