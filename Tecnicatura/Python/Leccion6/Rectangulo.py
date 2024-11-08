class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base.
    El nombre del método será calcular_área utilizando la fórmula: área = base * altura
    Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser tres.
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.base

base = int(input('Digite el número para la base del rectángulo: '))
altura = int(input('Digite el número para la altura del rectámgulo: '))
rectangulo1 = Rectangulo(base, altura)
print(f'El área del rectángulo es: {rectangulo1.calcular_area()}')