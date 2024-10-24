class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property # Decorador.
    def nombre(self): # Método Getter.
        print('Estamos utilizando el método Get.')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): # Método Setter.
        print('Estamos utilizando el método Set.')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')


if __name__ == '__main__':
    persona1 = Persona2('Gabriel', 'Bruni', 24)
    print(persona1.nombre) # Llamamos al método Getter.
    persona1.nombre = 'Ariel Betancud' # Llamamos al método Setter.
    print(persona1.nombre) # Otra vez con el método Getter.
    print(persona1.mostrar_detalles()) # Llamamos el método mostrar_detalles.
    # Atributo read-only (solo lectura) sería la edad porque no tiene el método set.
    print(persona1.edad)

    # Tarea:
    # Crear 3 objetos más, utilizando los métodos Getter and Setter.
    # Para moodificar y mostrar cambios con el método mostrar_detalles.

    # Objeto N°1 de la tarea:
    persona2 = Persona2('Agustina', 'Carallol', 21)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Daiana'
    persona2.apellido = 'Fernandez'
    persona2.edad = 30
    print(persona2.mostrar_detalles())

    # Objeto N°2 de la tarea:
    persona3 = Persona2('Ariadna', 'Perez', 29)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Julieta'
    persona3.apellido = 'García'
    persona3.edad = 25
    print(persona3.mostrar_detalles())

    # Objeto N°3 de la tarea:
    persona4 = Persona2('Valentina', 'Pino', 35)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Paulina'
    persona4.apellido = 'Arreo'
    persona4.edad = 40
    print(persona4.mostrar_detalles())

    print(__name__)