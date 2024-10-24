# Comenzamos con Funciones:
# mi_funcion() # No se puede llamar antes de definir a una función.
# Definimos una Función.
def mi_funcion():
    print('Saludos a todos los alumnos de la Tecnicatura.')

mi_funcion() # Estamos llamando a la función.
mi_funcion() # Se puede llamar a una función N cantidad de veces.

# Desempaquetado de listas o list Unpacking. (CLASE05 - 16-09-2024)
def show(name, lastName):
    print(name+' '+lastName)
person = ['Gabriel', 'Bruni']
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la función.
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto.
person2 = ("Osvaldo", "Giordanini") # Desempaquetamos a través de una tupla.
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3)

numbers = [1, 2, 3, 4, 5] # Aún con la lista vacía se va a ejecutar el else.
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la única manera para que no se ejecute el else.
else:
    print('Esto se terminó.')

# List comprehension, lista de comprensión.
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P'] # Esto regresa una nueva lista.
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg."},
           {"name": "Corona", "country": "Mx."},
           {"name": "Stella Artois", "country": "Belgium."},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg."]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones).
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a través del canal de YouTube.")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge', 'Lucero')
mi_funcion2('Ariel', 'Betancud')
mi_funcion2('Gabriel', 'Bruni')

# La palabra Return en Funciones:
# Creamos una función para sumar.
def sumar(a, b):
    return a + b
# resultado = sumar(78, 22,)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a = 0, b = 0): # Le damos un valor por default.
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Argumentos, variables en funciones.
def listarNombres(*nombres): # Normalmente se utiliza: *args.
    for nombre in nombres: # Se va a convertir en una tupla.
        print(nombre)
listarNombres('Gabriel', 'Lucas', 'Ariel', 'Virginia', 'Sofía')
listarNombres('Marcos', 'Valeria', 'Florencia', 'Lucía')

def listarTerminos(**terminos): # Lo más utilizado es **kwargs para recibir los argumentos.
    for llave, valor in terminos.items(): # kwargs significa: Key Word Argument.
        print(f'{llave} : {valor}')

listarTerminos() # No recibe nada, nada se va a mostrar.
listarTerminos(IDE = 'Integrated Develoment Enviroment', PK = 'Primary Key')
listarTerminos(Nombre = 'Leonel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10, 11) # No es un objeto iterable.
desplegarNombres((10, 11)) # La convertimos a una tupla, en un sólo elemento no olvidar la coma.
desplegarNombres([22, 55]) # La convertimos en una lista.

# Funciones Recursivas.
def factorial(numero):
    if numero == 1: # Caso Base.
        return 1
    else:
        return numero * factorial(numero-1) # Caso Recursivo.

resultado = factorial(5) # Lo hacemos en código duro.
print(f'El factorial del número 5 es: {resultado}') # Tarea: Que el usuario ingrese el número para calcular el factorial.
# TAREA:
numeroFactorial = int(input('Digite el número para calcular el factorial: '))
resultado = factorial(numeroFactorial)
print(f'El factorial del número {numeroFactorial} es: {resultado}')
