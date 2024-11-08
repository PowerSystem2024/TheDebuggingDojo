'''
miVariable = 3;
print(miVariable)
miVariable = "Hola a todos los alumnos de la Tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x = 072, la variable y = 816, lavariable z = 136.
print(id(y))
print(id(z))

# Tipos int, float, String ,Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "AC/DC:"
caracteristicas = "JBalvin"
print("Mi grupo favorito es:", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Boleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es VERDADERO.")
else:
    print("El resultado es FALSO.")

# Procesar la entrada del usuario
# Función input.
# resultado = input("Digite un número: ")  # Regresa un dato tipo string.
# print(resultado)

# Conversión de la entrada de datos
numero1 = int(input("Escribe el primer número: "))
numero2 = int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ",resultado)
'''

'''
# Operadores Aritméticos!
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma:",suma)
print(f'El resultado de la suma es: {suma}') #Iterpolación

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicación es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la división es: {division}")
division = operandoA // operandoB
print(f"El resultado de la división (int) es : {division}")
modulo = operandoA % operandoB
print(f"El resultado de la división o residuo (módulo) es : {modulo}")
exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")
'''

# Instrucciones de la tarea:
# • En el siguiente ejercicio se solicita calcular el área y el perímetro de un rectángulo. Para ello debemos de crear las siguientes variables:
# • alto (int)
# • ancho (int)
# • El usuario debe de proporcionar los valores de alto y ancho, después se debe de imprimir el resultado en el siguiente formato:
# • Proporciona el alto del rectángulo: 5
# • Proporciona el ancho del rectángulo: 3,
# • Área: 15
# • Perímetro: 16
# • Las fórmulas para calcular el área y el perímetro de un rectángulo son:
# • Área: alto * ancho
# • Perímetro: (alto + ancho) * 2
"""
# Intento mío sin ver el del profe=
alto = int(input("Digite el alto del rectángulo en (cm): "))
ancho = int(input("Digite el ancho del rectángulo en (cm): "))
area = alto * ancho
print(f"El área del rectángulo es: {area}")
perimetro = (alto + ancho) * 2
print(f"El perímetro del rectángulo es: {perimetro}")

# Del video del profe
alto = int(input('Proporciona el alto del rectángulo: '))
ancho = int(input('Proporciona el ancho del rectángulo: '))
area = alto * ancho
perimetro = (alto + ancho) * 2
print('Área: ',area)
print('Perímetro: ',perimetro)
"""
"""
miVariable3 = 10
print(miVariable3)

# Operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de Comparación

d = 4
b = 2

# Comprobamos si son iguales
resultado = d == b
print(resultado)

# Operador Diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador Menor o Igual que
resultado = d <= b
print(resultado)

# Operador Mayor o Igual que
resultado = d >= b
print(resultado)
"""
"""
# EJERCICIO 1: Número par o impar.
# 1.Solicitamos que el usuario ingrese un número
# 2.Este se asigna a una variable
# 3.Utilizaremos la estructura 'if else'
# 4.La fórmula:<num> % 2 == 0 Esta operación nos dice si es un número par
# 5.Si es True imprimimos que es par
# 6.Si es False imprimimos que es impar

a = int(input("Digite un número: "))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} que es un número PAR.")
else:
    print(f"El valor de a es: {a} que es un número IMPAR.")

# EJERCICIO 2: Determinar si es mayor de edad.
# 1.Pedir un número al usuario
# 2.Almacenar el valor de una variable
# 3.Usar la estructura 'if else'
# 4.La fórmula es:<num> >=18
# 5.True: Eres mayor de edad, Imprimir
# 6.False: Eres menor de edad, Imprimir

# Intento mío sin ver el del profe=
a = int(input("Digite su edad en número: "))
if a >= 18:
    print(f"El valor de a es: {a} Eres MAYOR de edad.")
else:
    print(f"El valor de a es: {a} Eres MENOR de edad.")

# Del video del profe
edadAdulto = 18
edadPersona= int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es MAYOR de edad.")
else:
    print(f"Su edad es: {edadPersona} años, usted es MENOR de edad.")
"""
"""
# CLASE LUNES 06/05/2024
## Operadores Lógicos

# Operador AND
a = False
b = False
resultado = a and b
print(resultado)

# Operador OR
resultado = a or b
print(resultado)

# Operador NOT
resultado = not a
print(resultado)

# Ejercicio 4.6 "Valor dentro de un rango.
# Pedimos al usuario un valor numérico
# Verificar si el valor ingresado se encuentra entre el rango de 0 a 5
# La formula es: <num> >= 0  and  <num> <= 5
valor = int(input("Digite un valor numérico: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} se encuentra dentro del rango númérico.")
else:
    print(f"El valor {valor} NO se encuentra dentro del rango numérico.")

# Ejercicio 4.7 "Operador or"
# La pregunta es si un padre puede asistir al juego de su hijo.
# Verificamos si tiene vacaciones
# Verificamos si tiene el día libre
# Usar estructura ‘if else’ con el operador or
vacaciones = False
diaLibre = True
if vacaciones or diaLibre:
    print(f"Puede asistir al juego.")
else:
    print(f"No va a poder asistir al juego de su hijo.")
    
# Mismo ejercicio pero incorporamos el operador NOT:
vacaciones = True
diaLibre = True
if not (vacaciones or diaLibre):
    print(f"No va a poder asistir al juego de su hijo..")
else:
    print(f"Puede asistir al juego.")

# Ejercicio 4.8 "Rango entre las edades 20 y 30 años"
# Preguntar la edad al usuario
# Si la edad esta dentro de los 20 o 30 años, esta dentro del rango
# Combinamos los operadores and y or para saber si el usuario esta dentro del rango o no
edad = int(input("Digite su edad en número: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)
if veinte or treinta:
    if veinte:
        print('Estás dentro del rango de los (20\'0) años de edad.')
    elif treinta:
        print('Estás dentro del rango de los (30\'0 años de edad.')
    else:
        print("No estás dentro del rango")
else:
    print("No estás dentro del rango de los (20'0) a (30'0) años de edad.")

# Sin realizar las expresiones por separado:
edad = int(input("Digite su edad en número: "))
if (edad >=20 and edad < 30) or (edad >= 30 and edad < 40):
    print("Estás dentro del rango de los (20'0) a (30'0) años de edad.")
else:
    print("No estás dentro del rango de los (20'0) a (30'0) años de edad.")

# Sintaxis simplificada del operador and:
edad = int(input("Digite su edad en número: "))
if (20 <= edad < 30) or (30 <= edad < 40):
    print("Estás dentro del rango de los (20'0) a (30'0) años de edad.")
else:
    print("No estás dentro del rango de los (20'0) a (30'0) años de edad.")

# Ejercicio 1 "El mayor de dos números"
# Solicitar al usuario dos valores y determinar cuál es el mayor.
# 1.Solicitar al usuario dos valores
# 	numero1 (int)
# 	numero2 (int)
# 2.Se debe imprimir el mayor de los dos números (La salida debe ser identica a la siguiente):
# 	Digite el valor para el numero1:
# 	Digite el valor para el numero2:
# 	El número mayor es: <numeroMayor>
print("Digite dos valores aleatorios.")
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))
if numero1 > numero2:
    print("El número1 es mayor.")
else:
    print("El número2 es mayor.")
"""
#Ejercicio 2 "Tienda de libros"
#1.Mostrar: Ingrese los siguientes datos del libro
#2.Digite el nombre del libro
#3.Digite el ID del libro
#4.Digite el precio del libro
#5.Indicar si el envío es gratuito (True/False)
#6.Mostrar:
	#Nombre:
	#ID:
	#Precio:
	#Envío Gratuito?:
print("Ingrese los siguintes datos del libro.")
nombreLibro = input("Digite el nombre del libro: ")
ID = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: $"))
envioGratis = input("Digite si el envío es gratuito (True/False): ")
if envioGratis == 'True':
    envioGratis = True
elif envioGratis == 'False' :
    envioGratis = False
else:
    envioGratis = "El valor es incorrecto. Debe ingresar 'True' or 'False'"
print(f"""
        Nombre: {nombreLibro}
        ID: {ID}
        Precio: {precio}
        Envío gratuito?: {envioGratis}
""")