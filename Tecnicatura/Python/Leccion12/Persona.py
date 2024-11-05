#Clase 12. Parte 2a

class Persona: 
    def __init__(self, nombre, edad):
        self.nombre = nombre 
        self.edad = edad 

    def __add__(self, other):  
        return f'{self.nombre} {''} {other.nombre}'  # Concatenar nombres con un espacio
    
# Parte 2b. Metodo -> Resta: SUB (substraction)
    def __sub__(self, otro):
        return self.edad - otro.edad
    
persona1 = Persona('Juan', 30)
persona2 = Persona('Pérez', 10)

#persona1.__Add__(persona2) sintaxis interna 

print(persona1 + persona2)  # Esto imprimirá: Juan Pérez
print(persona1 - persona2)  #Se restaran las edades 
