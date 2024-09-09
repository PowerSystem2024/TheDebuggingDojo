SeleccionArgentina = {
    1:{'Nombre':'Emiliano Martínez','Edad':32,'Altura':1.96,'Peso': 87, 'Posición':'Arquero (Portero)'},
    2:{'Nombre':'Gonzalo Montiel','Edad':34,'Altura':34,'Peso': 68, 'Posición':'Lateral derecho (Defensor)'},
    3:{'Nombre':'Cristian Romero','Edad':26,'Altura':1.85,'Peso': 78, 'Posición':'Defensa Central'},
    4:{'Nombre':'Lautaro Martínez','Edad':27,'Altura':1.75,'Peso': 72, 'Posición':'Delantero (Centrodelantero)'},
    5:{'Nombre':'Nicolás Tagliafico','Edad':32,'Altura':1.73,'Peso': 67, 'Posición':'Lateral izquierdo'},
    6:{'Nombre':'Ángel Di María','Edad':36,'Altura':1.80,'Peso': 70, 'Posición':'Extremo derecho o izquierdo'},
    7:{'Nombre':'Rodrigo De Paul','Edad':30,'Altura':1.80,'Peso':68, 'Posición':'Mediocampista (Interior derecho)'},
    8:{'Nombre':'Enzo Fernández','Edad':23,'Altura':1.78,'Peso': 76, 'Posición':'Mediocampista central'},
    9:{'Nombre':'Alexis Mac Allister','Edad':25,'Altura':1.75,'Peso': 68, 'Posición':'Mediocampista ofensivo (Interior izquierdo)'},
    10:{'Nombre':'Lionel Andrés Messi','Edad':37,'Altura':1.70,'Peso': 72, 'Posición':'Delantero (Media punta, Extremo derecho)'},
    11:{'Nombre':'Julián Álvarez','Edad':24,'Altura':1.70,'Peso': 71, 'Posición':'Delantero (Centrodelantero, Extremo)'},
    12:{'Nombre':'Franco Daniel Armani','Edad':37,'Altura':1.89,'Peso':85, 'Posición':'Arquero (Portero)'},
    13:{'Nombre':'Nicolás Otamendi','Edad':36,'Altura':1.83,'Peso':78, 'Posición':'Defensa central'},
    14:{'Nombre':'Leandro Paredes','Edad':30,'Altura':1.80,'Peso':73, 'Posición':'Mediocampista central (Pivote)'},
    15:{'Nombre':'Giovani Lo Celso','Edad':28,'Altura':1.78,'Peso':68, 'Posición':'Mediocampista ofensivo (Interior izquierdo)'},
    16:{'Nombre':'Paulo Exequiel Dybala','Edad':30,'Altura':1.78,'Peso':75, 'Posición':'delantero o mediapunta'},
    17:{'Nombre':'Alejandro Garnacho','Edad':20,'Altura':1.80,'Peso':73, 'Posición':'Extremo izquierdo (Delantero)'}
}
'''
#   Muestra todos de una 
for termino,valor in SeleccionArgentina.items():
    print(termino,valor)
'''
print('Total de jugadores cargados en el diccionario: ', end=' ')
print(len(SeleccionArgentina))

# Le permite elegir al usuario cual mostrar
num = int(input('Ingrese un número del 1 al 17: '))
while num != 0:
    if(num >= 1 and num <= 17):
        print(SeleccionArgentina[num])
    else:
        print('Valor fuera de rango')
    num = int(input('Ingrese cero(0) para salir o ingrese otro número: '))
print('Finaliza el programa')
