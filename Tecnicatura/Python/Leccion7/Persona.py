class Persona: # Esta clase hereda de la clase Object.
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self):  # Override = sobreescribir.
        return f'Persona: [ Nombre: {self._nombre}, Edad: {self._edad} ]'
class Empleado(Persona): # Esta clase es hija de la clase Persona.
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo}] {super().__str__()}'

empleado1 = Empleado('Gabriel', 24, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

# Tarea:
# Encapsular los atributos y agregar los métodos Getter and Setter. Crear otro objeto.
# Pasar los datos para nombre, edad y sueldo; y mostrar esos datos, luego modificar y mostrar nuevamente.

empreado2 = Empleado('Liliana', 38, 70000)
print(empreado2.nombre)
print(empreado2.edad)
print(empreado2.sueldo)
empreado2.nombre = 'Natalia'
empreado2.edad = 35
empreado2.sueldo = 75000
print(empreado2.nombre)
print(empreado2.edad)
print(empreado2.sueldo)
